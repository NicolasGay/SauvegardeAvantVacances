$.get("http://localhost:8080/jax-rs-1/fora/topics")
    .then(topics=> topics.forEach(function(t){
    	const li = $('<li>').attr('topic-id', t.id).text(t.title);
        $("section.topics ul").append(li);
        li.on('click', ()=>selectTopic(t));
}));


function selectTopic(topic){

	$("section.selected ul").empty();
    topic.comments.forEach(function(c){
    	const name = c.user ? c.user.name:"Anonymous"
        const li = $('<li>').text(name+" says : "+c.content);
        $("section.selected ul").append(li);
    })
    
    customizeForm(topic);
}

function customizeForm(topic){
	
	const url =`/jax-rs-1/fora/topics/${topic.id}/comments`;
	$("button").on("click",function(){
		
		const content = $("input").val();
		const user={id:1, name:"Nicolas"};
		const c={user,content};
		
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			data:JSON.stringify(c),
			contentType:"application/json"
		}).then(function(){
			const name = c.user ? c.user.name:"Anonymous"
			const li = $('<li>').text(name+" says : "+c.content);
			$("section.selected ul").append(li);
		})	
	})	
}

function addCommentInTopic(content, user, topic){

}