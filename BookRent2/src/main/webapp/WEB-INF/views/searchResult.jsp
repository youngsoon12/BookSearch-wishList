<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Search Results</title>
    
    <style>
        /* 스타일 정의 */
        .book-item {
            margin: 10px 0;
        }
        .book-item img {
            max-width: 100px;
            margin-right: 10px;
        }
        .book-item div {
            display: inline-block;
            vertical-align: top;
        }
    </style>
</head>
<body>
    <h1>Book Search Results</h1>
    <ul>
        <c:forEach var="book" items="${books}">
            <li class="book-item">
                <div>
                    <img src="${book.image}" alt="${book.title}">
                </div>
                <div>
                    <h2><a href="${book.link}" target="_blank">${book.title}</a></h2>
                    <p>Author: ${book.author}</p>
                    <p>Publisher: ${book.publisher}</p>
                    <p>Publication Date: ${book.pubdate}</p>
                    <p>Description: ${book.description}</p>
                </div>
            </li>
            
        </c:forEach>
    </ul>
</body>
</html>