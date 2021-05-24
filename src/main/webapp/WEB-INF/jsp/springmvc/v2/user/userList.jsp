<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <base href="${pageContext.request.contextPath}/">
</head>
<body>
<%@ include file="/WEB-INF/jsp/springmvc/v2/menu.jsp" %>
<h3>사용자 목록</h3>
<c:forEach var="user" items="${userList}">
  <p>${user.userId}, ${user.email}, ${user.name}</p>
</c:forEach>
</body>
</html>
