<%@ page import="kr.mjc.youngil.web.dao.Article" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
  <base href="<%= request.getContextPath()%>/">
</head>
<body>
<%--menu.jsp를 include해 페이지 상단에 menu바가 있도록.--%>
<%@ include file="/WEB-INF/jsp/mvc/menu.jsp" %>
<h3>게시글 목록</h3>
<p><a href="./mvc/article/articleForm">글쓰기</a></p>
<% List<Article> articleList = (List<Article>) request
    .getAttribute("articleList");
  for (Article article : articleList) {%>
<p><a
    href="./mvc/article/articleView?articleId=<%= article.getArticleId()%>"><%= article
    .getArticleId()%>. <%= article.getTitle() %>
</a> / <%=article.getName()%>, <%=article.getUdate()%>
</p>
<%
  }%>
</body>
</html>
