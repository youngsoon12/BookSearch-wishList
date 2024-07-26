<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Wish List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/wishList.css">
</head>
<body>
    <div class="container">
        <h1>나의 찜 목록 </h1>
        <ul>
            <c:forEach var="wish" items="${wishLists}">
                <li class="wish-item">
                    <div class="img-area">
                        <img src="${wish.image}" alt="${wish.title}">
                    </div>
                    <div>
                        <h2><a href="${wish.link}" target="_blank">${wish.title}</a></h2>
                        <p>Author: ${wish.author}</p>
                        <p>Publisher: ${wish.publisher}</p>
                        <p>Publication Date: ${wish.pubdate}</p>
                        <p class="description">Description: ${wish.description}</p>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>