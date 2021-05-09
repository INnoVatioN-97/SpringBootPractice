<%@ page import="kr.mjc.youngil.web.dao.Article" %>
<!DOCTYPE html>
<%
    Article article =  (Article) request.getAttribute("ARTICLE");
%>
<html>
<title>Article Information</title>
<body>
<h2>Article Information</h2>
<h3><%=article.getTitle() %></h3>

    Author : <%=article.getName()%>  <br>
    내용 : <%=article.getContent()%>

<button onclick="location='modifyArticle'">글 수정하기</button>

</body>
</html>