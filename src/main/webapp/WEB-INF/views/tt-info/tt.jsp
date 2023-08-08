<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>유저 리스트</h3>
	<select name="searchType" id="searchType">
		<option value="1">번호</option>
		<option value="2">이름</option>
		<option value="3">작성일</option>
	</select>
	<input type="text" name="searchStr" placeholder="검색어" id="searchStr">

	<a href="/user-info/insert">search</a>
	<div class="container">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">번호</th>
					<th scope="col">이름</th>
					<th scope="col">작성일</th>
				</tr>
			</thead>


			<tbody id="tbody"></tbody>
		