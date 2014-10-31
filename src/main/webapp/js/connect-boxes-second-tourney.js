function connectFixtureBoxes(){	
		jsPlumb.bind("ready", function() {
		 	jsPlumb.setContainer($("body"));
	        jsPlumb.connect({
			    source:"match-1a",
			    target:"match-2a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1b",
			    target:"match-2a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1c",
			    target:"match-2b",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1d",
			    target:"match-2b",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1e",
			    target:"match-2c",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1f",
			    target:"match-2c",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1g",
			    target:"match-2d",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-1h",
			    target:"match-2d",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			//Second line
			jsPlumb.connect({
			    source:"match-2a",
			    target:"match-3a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-2b",
			    target:"match-3a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-2c",
			    target:"match-3b",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-2d",
			    target:"match-3b",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			//Third Line
			jsPlumb.connect({
			    source:"match-3a",
			    target:"match-4a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-3b",
			    target:"match-4a",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8"},
			    endpoint: [ "Dot", { radius:4} ]
			});
	     });
}