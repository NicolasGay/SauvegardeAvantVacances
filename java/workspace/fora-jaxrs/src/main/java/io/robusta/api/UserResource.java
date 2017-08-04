package io.robusta.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.robusta.ForaDataSource;
import io.robusta.business.UserBusiness;
import io.robusta.demo.providers.NotAcceptableCustomException;
import io.robusta.domain.User;

@Path("users")
@Produces("application/json")
public class UserResource {

	@Path("test")
	@GET
	public String test() {
		return "test";
	}

	@GET
	public Response findUsers(@QueryParam("admin") String isAdmin) throws Exception {

		List<User> allUsers = ForaDataSource.getInstance().getUsers();
		List<User> result = new ArrayList<User>();

		for (User user : allUsers) {

			if (isAdmin == null) {
				result.add(user);
			} else {
				switch (isAdmin) {
				case "true":
					if (user.isAdmin())
						result.add(user);
					break;
				case "false":
					if (!user.isAdmin())
						result.add(user);
					break;
				default:
					throw new NotAcceptableCustomException("Parameter 'admin' must be 'true' or 'false'");
					// return Response.status(406).entity().build();
				}

			}
		}

		return Response.ok(result).build();

	}

	@GET
	@Path("{id}")
	public User findUserByID(@PathParam("id") Long id) throws Exception {
		User user = new UserBusiness().findById(id);
		if (user == null) {
			throw new NotFoundException("No user No" + id + "found");
		}

		return user;
	}
	/*
	 * @GET public String helloAdmin(@QueryParam("admin") boolean isAdmin) {
	 * return "isAdmin ? " + isAdmin; }
	 */
	
	@POST
	public  Response createUser(String nameOfUserToCreate){
		User newUser = new UserBusiness().createUser(nameOfUserToCreate);
		
		return Response
				.status(201)
				.header("X-Location", "Aelion Centaures")
				.entity(newUser)
				.build();
	}
}
