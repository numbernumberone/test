<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: wr
  Date: 2018/10/9
  Time: 上午11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">啤酒建议的jsp页面</h1>
<p>

<%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while (it.hasNext()) {
        out.print("<br>try: " + it.next());
        }

%>


</body>
</html>
