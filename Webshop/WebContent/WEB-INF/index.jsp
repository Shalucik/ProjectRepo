<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Css"/>
</head>
<body>
	<table>
			<tbody>
				<tr><th>Product</th><th>Prijs per Stuk</th><th>Hoeveelheid</th><th>Totaal prijs</th></tr>
				<tr><td><a href="Product?id=1">${Appel.getNaam()}</a></td><td>€${Appel.getPrijsPerEenheid()},-</td><td>3</td><th>€${Appel.getPrijs(3)},-</th></tr>
				<tr><td><a href="Product?id=2">${Peer.getNaam()}</a></td><td>€${Peer.getPrijsPerEenheid()},-</td><td>1</td><th>€${Peer.getPrijs(1)},-</th></tr>
			</tbody>
	</table>
</body>
</html>