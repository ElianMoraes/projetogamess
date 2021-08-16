<%@page import="vo.Game"%>
<%@page import="ctr.GamesProcess"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista com todos os jogos (CRUD)</title>
</head>
<body>
	<div>
		<a href="cadastro.jsp">Cadastrar Jogo</a> <a href="editar.jsp">Alterar ou Remover</a>
	</div>
	<table>
		<tr>
			<th>Jogo</th>
			<th>Ano</th>
			<th>Empresa</th>
		</tr>
		<%
		GamesProcess.testes();
				for (Game c : GamesProcess.games) {
			out.print(c.toHTML());
				}
		%>
	</table>
</body>
</html>