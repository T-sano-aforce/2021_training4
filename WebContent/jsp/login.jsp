<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.html" %>
<form action = "../Login.action" method = "post">
	<table>
		<tr>
			<th>ユーザID:</th>
				<td><input type = "text" name = "login"></td>
		</tr>
		<tr>
			<th>パスワード:</th>
				<td><input type = "password" name = "password"></td>
		</tr>
	</table>


		<input type = "submit" value = "ログイン">


</form>


<%@include file = "../footer.html" %>