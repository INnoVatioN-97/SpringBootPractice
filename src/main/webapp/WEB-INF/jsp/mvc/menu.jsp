<%@ page import="kr.mjc.youngil.web.dao.User" %>
<%--모든 페이지 상단에 공통된 메뉴창을 띄우기 위한 메뉴 네비게이션--%>
<nav><a href="./">홈</a> <a
    href="./mvc/user/userList">사용자</a>
  <a href="./mvc/article/articleList">게시글</a>
  <% User sessionUser = (User) session.getAttribute("USER");
    if (sessionUser != null) { // 세션에서 USER Attribute 가 있는 경우 = 로그인을 했으면 %>
  <a href="./mvc/user/userInfo"><%= sessionUser.getName()%>
  </a>님 <a href="./mvc/user/logout">로그아웃</a>
  <% } else { // 로그인 안했으면 %>
  <a href="./mvc/user/loginForm">로그인</a> <a
      href="./mvc/user/userForm">회원가입</a>
  <%}%>
</nav>