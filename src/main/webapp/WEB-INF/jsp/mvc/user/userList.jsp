<%@ page import="kr.mjc.youngil.web.dao.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<%@ include file="/WEB-INF/jsp/mvc/menu.jsp" %>
<h3>사용자 목록</h3>
<%
    List<User> userList = (List<User>) request.getAttribute("userList");
    for(User user: userList){%>
    <p><%=user%></p>
<%
}
%>
</body>
</html>