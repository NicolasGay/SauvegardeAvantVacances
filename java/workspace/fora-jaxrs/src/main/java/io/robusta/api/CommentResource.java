package io.robusta.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.robusta.ForaDataSource;
import io.robusta.business.CommentBusiness;
import io.robusta.domain.Comment;

@Path("comments")
@Produces("application/json")
public class CommentResource {

	@GET
	public List<Comment> getAllComments() {

		return ForaDataSource.getInstance().getComments();

	}

	@GET
	@Path("/{idComment}")
	public Comment getComment(@PathParam("idComment") String idComment) {

		return new CommentBusiness().getCommentById(idComment);

	}

	@PUT
	@Path("/{idComment}")
	public Response increaseCommentScore(@PathParam("idComment") String idComment, @QueryParam("vote") String vote) {

		Comment comment = new CommentBusiness().getCommentById(idComment);

		if (comment == null) {
			return Response.status(404).entity("No comment exists for this id").build();
		}

		switch (vote) {
		case "up":
			comment.up();
			return Response.status(201).entity("comment " + idComment + " : '" + comment + "' has been upvoted")
					.build();
		case "down":
			comment.down();
			return Response.status(201).entity("comment " + idComment + " : '" + comment + "' has been downvoted")
					.build();

		default:
			return Response.status(403).entity("argument 'vote' must either be 'up' or 'down'").build();
		}

	}

}
