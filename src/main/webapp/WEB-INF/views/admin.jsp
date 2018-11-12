<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Admin</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="post" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Admin Page ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>
    </c:if>
</div>

<div>
    <table class="table table-striped table-hover" align="left" >
        <thead class="thead-dark">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Username</th>
                <th scope="col">First name</th>
                <th scope="col">Last name</th>
                <th scope="col">email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="us">
                <tr>
                    <th scope="row">${us.id}</th>
                    <td>${us.username}</td>
                    <td>${us.firstName}</td>
                    <td>${us.lastName}</td>
                    <td>${us.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<div align="right">
    <table class="table table-striped table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Author</th>
            <th scope="col">Genre</th>
        </tr>
        </thead>

        <c:forEach items="${books}" var="b">
            <tr>
                <th scope="row">${b.id}</th>
                <td>${b.name}</td>
                <td>${b.author}</td>
                <td>${b.genre}</td>
                <td><a href="/deleteBook/${b.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
<div class="btn">
    <form action="/addBook" method="get">
        <button type="submit" class="btn btn-primary" >Add new book</button>
    </form>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>