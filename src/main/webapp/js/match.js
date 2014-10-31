function getMatchInformation(matchId){
	$.getJSON("/match/get/"+matchId)
		.done(function(data) {
			console.log( "get player screen data" );
		if (data == null) {
			return null;
		} else {
			return data;
		}
		});
}