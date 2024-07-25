<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>도서 검색</title>
    <link rel="stylesheet" href="/css/search.css">
</head>
<body>
    <div class="centered-container">
        <div class="search-box">
            <h1>📚 도서 검색</h1>
                <input type="text" id="search-input" placeholder="책 제목이나 저자를 입력하세요">
                <button type="submit" id ="search-btn">검색</button>
        </div>
        <a href="/wishlist" class="wishlist-button">위시리스트</a> 
        </div>
    </div>
    <script src="/js/search.js"></script>
</body>
</html>