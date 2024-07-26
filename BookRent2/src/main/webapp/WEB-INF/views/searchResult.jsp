<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Search Results</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/searchResult.css">
</head>
<body>
    <div class="container">
    <div class="title-area">
        <span><a class="nav-button" href="/search">검색</a></span></span><h1><span style="color: #007BFF">"${query}"</span> 검색 결과</h1><span><a class="nav-button" href="/saveBook/wishlist">찜목록</a>
    </div>
        <ul>
            <c:forEach var="book" items="${books}">
                <li class="book-item">	
                    <div class="img-area">
                        <img src="${book.image}" alt="${book.title}">
                    </div>
                    <div>
                        <h2><a href="${book.link}" target="_blank">${book.title}</a></h2>
                        <p>Author: ${book.author}</p>
                        <p>Publisher: ${book.publisher}</p>
                        <p>Publication Date: ${book.pubdate}</p>
                        <p class="description">Description: ${book.description}</p>
                        <form class="save-form" action="${pageContext.request.contextPath}/saveBook" method="post">
                            <input type="hidden" name="title" value="${book.title}">
                            <input type="hidden" name="link" value="${book.link}">
                            <input type="hidden" name="image" value="${book.image}">
                            <input type="hidden" name="author" value="${book.author}">
                            <input type="hidden" name="publisher" value="${book.publisher}">
                            <input type="hidden" name="pubdate" value="${book.pubdate}">
                            <input type="hidden" name="description" value="${book.description}">
                            <input type="hidden" name="query" value="${query}">
                            <button type="submit">Save</button>
                        </form>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            document.querySelectorAll('.save-form').forEach(function(form) {
                form.addEventListener('submit', function(e) {
                    e.preventDefault(); // 폼의 기본 제출 동작 방지

                    const formData = new FormData(form);
                    fetch(form.action, {
                        method: 'POST',
                        body: formData
                    })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error('Network response was not ok');
                        }
                        return response.text(); // 응답을 텍스트로 처리
                    })
                    .then(data => {
                        // 서버로부터의 응답이 처리된 후, 페이지 이동 없이 작업 완료 표시
                        alert('성공적으로 담겼습니다 !');
                        // 필요한 경우 추가적인 UI 업데이트를 수행할 수 있습니다.
                    })
                    .catch(error => {
                        console.error('실패하였습니다.', error);
                    });
                });
            });
        });
    </script>
</body>
</html>