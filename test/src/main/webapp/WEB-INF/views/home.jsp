<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel='stylesheet'
	href='https://cdn.jsdelivr.net/gh/alphardex/aqua.css/dist/aqua.min.css'>

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/bootstrap.js"></script>
<style>
header {
	display: flex;
	justify-content: center;
	align-items: center;
}
#td{
text-align: center;
}
</style>
</head>
<body>
	<header translate="no">
		<ul class="nav">
			<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="ajax.do">ajax</a></li>
			<li class="nav-item"><a class="nav-link" href="adminpage.do">adminpage</a></li>
			<li class="nav-item"><a class="nav-link" href="login.do">login</a></li>
			<li class="nav-item"><a class="nav-link" href="ajax_gugu.do">gugudan</a></li>
		</ul>
	</header>
	<br>
	<div class="container">
		<div class="form-group row pull-right" style="float: right;">
			<div class="col-xs-8">
				<input class="form-control" type="text" size="50">
			</div>
			<br>
			<div class="col-xs-2">
				<button class="btn btn-primary" type="button">검색</button>
			</div>
		</div>

	<table class="table" style="text-align: center; border: 1px solid #dddddd">
		<thead>
			<tr>
				<th style="background-color: #fafafa; text-align: center;">이름</th>
				<th style="background-color: #fafafa; text-align: center;">나이</th>
				<th style="background-color: #fafafa; text-align: center;">성별</th>
				<th style="background-color: #fafafa; text-align: center;">이메일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td id="td">이상원</td>
				<td id="td">26</td>
				<td id="td">남자</td>
				<td id="td">test@1234.com</td>
			</tr>
		</tbody>
	</table>
	</div>
</body>
</html>
