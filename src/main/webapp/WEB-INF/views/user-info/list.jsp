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


			<tbody id="Addbody"></tbody>
		
		<td colspan="3" align="right">
				<button type="button" class="btn btn-primary"
					onclick="goPage('/board-info/insert')">등록</button>
			</td>
	</div>
</table>
	<script>
		function goPage(url) {
			location.href = url;
		}
		const loadFunc = function() {

			const xhr = new XMLHttpRequest();

			xhr.open('GET', 'http://localhost/user-info/list');
			xhr.onreadystatechange = function() {
				if (xhr.readyState === 4) {
					if (xhr.status === 200) {
						const obj = JSON.parse(xhr.responseText);
						console.log(obj);
						let html = '';
						for (let i = 0; i < obj.length; i++) {
							const user = obj[i];

							html += '<tr>';
							html += '<td>' + user.uiNum + '</td>';
							html += '<td>' + user.uiName + '</td>';
							html += '<td>' + user.credat + '</td>';
							html += '</tr>';
						}
						document.querySelector('#Addbody').innerHTML = html;
					}
				}
			}
			xhr.send();
		}
		window.addEventListener('load', loadFunc);
	</script>
</body>

</html>

