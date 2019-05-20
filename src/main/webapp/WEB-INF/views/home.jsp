<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.4/sockjs.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<script type="text/javascript">
var sock = null,
stompClient = null;

function connect(){
	console.log("connect")
}
    sock = new SockJS("http://localhost:8080/stomp");
    stompClient = Stomp.over(sock);    //stomp client 구성
    stompClient.connect({}, function(frame){
        console.log('connected stomp over sockjs');
    stompClient.subscribe('/subscribe/notice', onMessage);
	}
);
    
function onMessage(message){
        console.log("Receive Data from server : "+message);
}

$(function(){
		connect();
})
</script>

</body>
</html>
