<%@ page import="kr.mjc.youngil.web.dao.Article" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h3>게시글 목록</h3>
<%
    List<Article> articleList = (List<Article>) request.getAttribute("articleList");
    for(Article article: articleList){%>
<p></p>
<a href = "getArticle?id=<%=article.getArticleId()%>"><%=article%></a>
<%
}
%>
</body>
</html>