<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왓챠 - ${pageTitle}</title>
</head>
<body>
    <h1>${pageTitle}</h1>

	<c:forEach items="${moviesList}" var="movie">
		<div>
			<div>${movie.movieId}</div>
			<div>${movie.title}</div>
			<div>${movie.genre}</div>
			<div>${movie.location}</div>
			<div>${movie.summary}</div>
			<hr/>
		</div>
	</c:forEach>
</body>
</html>