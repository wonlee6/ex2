<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
$(function(){
	$.ajax({
		type: "post",
		url: "background.do",
		success: function(result){ // 콜백함수
			console.log("test : " + result);
			$("#result").html(result.ksum + "방문  " + ", 매출 : " + result.sum);
		}
	})
})

</script>
</head>
<body>
	<jsp:include page="../include/menu.jsp" />
	<div id="result"> </div>
	
</body>
</html>