#  📚BookSearch-wishList
도서목록에서 검색을 하여 그 중에 마음에 드는 책들을 위시리스트에 담을 수 있는 간단한 미니 프로젝트 입니다.

<h3>프로젝트 목적</h3>  이 프로젝트의 목적으로는 배포에 초점을 두기보다는 스프링 부트와 JSP를 학습하며 MySQL을 사용해보고 싶은 것에 목적을 두고 진행하였습니다.
<h3>프로젝트 일정</h3>
<table>
  <tr><th>날짜</th> <th>내용</th></tr>
  <tr><td>07.25</td><td>search Page 구현 완료하기, MySQL DB연결하기</td></tr>
  <tr><td>07.26</td><td>result Page 구현 완료하기, result Page 중에서 마음에 드는 데이터 wishList DB에 데이터 넣기</td></tr>
  <tr><td>07.27</td><td>wishList Page구현하기</td></tr>
  <tr><td>07.28</td><td>마무리</td></tr>
</table>
<h3>기술 스택</h3>
| SpringBoot, MySQL, JSP, CSS

<h3>디렉토리 구조</h3>
<img src="https://github.com/user-attachments/assets/f481392e-728d-4cc4-b933-8035cbdc1de8">

<h3>기능 구현</h3>
- 도서검색 기능 : 외부 API인 네이버도서검색 API를 fetch로 구현할까 하다가 CRA방식으로 구현해버리면 스프링부트를 이용하여 프로젝트를 하는 의미가 없다 생각하여 RestTemplete를 이용하여 구현하였습니다.
- 등록 기능 : 검색을 통하여 도서 목록들이 나오면 그 리스트에 저장 버튼을 달아 저장할시 MySQL 데이터베이스에 insert가 될 수 있도록 구현하였습니다. (데이터베이스 동록 방식에는 JPA를 사용하였습니다.)
- 조회 기능 : wishList에 담은 도서 목록들을 조회하여 출력할 수 있게끔 구현하였습니다.
- 삭제 기능 : 조회된 리스트에 삭제 버튼을 달아 버튼을 클릭시 데이터베이스에서 delete가 될 수 있게끔 구현하였습니다.

<h3>Page</h3>
*search
<img src="https://github.com/user-attachments/assets/4482ce83-413a-491b-af4f-42783c5e22a8">

*searchResult
![searchResult](https://github.com/user-attachments/assets/a2d37d8e-080a-46a6-a7a6-5ac769e6c533)

*wishList
![wishList](https://github.com/user-attachments/assets/7d75485e-6007-4e0f-b600-c4119d42480b)

*wishList(empty)
![wishList(empty)](https://github.com/user-attachments/assets/dd7d3637-65fc-45d1-8a3a-cfbb2ccc9e8b)

<h3>시연영상</h3>

https://github.com/user-attachments/assets/f86a2783-ff91-421d-9b2e-e5d287d9dbc1



<h3>회고</h3>
기존의 리액트만 사용하여 프론트단만 해오다가 이번에 스프링부트를 접해볼 기회가 생겨 공부하면서 간단하게 프로젝트를 해보았는데 익숙한 리액트와 달리 스프링부트는 처음인지라 간단한 API호출이나 조건부렌더링 및 동작 과정등에서 많이 헤맸던것 같다. 헤매는 과정속에서 찾아보고 공부하고 조금은 성장한 기분이 들며, 이번에 구글의 firebase가 아닌 직접 MySQL을 사용해봤는데 재밌고 신기했었다. 사실 스프링부트로 해보려했던것도 DB를 연결해보고 싶어서도 컸는데 직접 해보니 좋았으며 늘 사용하던것이 아닌 다양한 경험을 하며 개발 자체를 잘하는 개발자가 되고 싶다는 생각을 가졌다. 화이팅하자
