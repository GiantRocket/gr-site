function connectFixtureBoxes(){	
		jsPlumb.bind("ready", function() {
		 	jsPlumb.setContainer($("#fixture-section"));
	        jsPlumb.connect({
			    source:"match-a",
			    target:"match-i",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-b",
			    target:"match-i",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-c",
			    target:"match-j",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-d",
			    target:"match-j",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-e",
			    target:"match-k",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-f",
			    target:"match-k",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-g",
			    target:"match-l",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-h",
			    target:"match-l",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			//Second line
			jsPlumb.connect({
			    source:"match-i",
			    target:"match-m",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-j",
			    target:"match-m",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-k",
			    target:"match-n",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-l",
			    target:"match-n",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			//Third Line
			jsPlumb.connect({
			    source:"match-m",
			    target:"match-o",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-n",
			    target:"match-o",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-r",
			    target:"match-v",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-s",
			    target:"match-w",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-t",
			    target:"match-x",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-u",
			    target:"match-y",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			//Second line
			jsPlumb.connect({
			    source:"match-v",
			    target:"match-z",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-w",
			    target:"match-z",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-x",
			    target:"match-aa",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-y",
			    target:"match-aa",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			//Third Line
			jsPlumb.connect({
			    source:"match-z",
			    target:"match-ab",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-aa",
			    target:"match-ac",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-ab",
			    target:"match-ad",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-ac",
			    target:"match-ad",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-ad",
			    target:"match-ae",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
			jsPlumb.connect({
			    source:"match-o",
			    target:"match-p",
			    anchor:["Right","Left"],
			    paintStyle:{lineWidth:3,strokeStyle:'rgb(40,127,184)'},
			    connector: "Straight",
			    endpointStyle:{ fillStyle:"#287FB8", width:2, height:2},
			    endpoint: [ "Rectangle", { radius:4} ]
			});
	     });
}