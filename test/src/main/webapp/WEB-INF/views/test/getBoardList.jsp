<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
</head>
<body>
<h1>아나 시발</h1>
<div>
		<table>
			<c:forEach items="${hotelList }" var="hotel">
				<tr>
					<td>${hotel.seq }</td>
					<td align="left"><a href="getHotel.do?seq=${hotel.seq }">
							${hotel.name }</a></td>
					<td>${hotel.age }</td>
					<td>${hotel.sex }</td>
					<td>${hotel.email }</td>
				</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>