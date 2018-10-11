<%--
  Created by IntelliJ IDEA.
  User: wr
  Date: 2018/10/4
  Time: 下午3:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <base href="<%=basePath%>">

  <title>登陆页面</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->
</head>

<body>
<div>
  <!--表单提交使用post，用户名和密码不会显示在链接中，提交地址为servlet地址 -->
  <form action="<%=path %>/servlet/LoginServlettest" method="post">
    <div>
      <label>姓名：</label>
      <input type="text" id="userid" name="userid"/>
    </div>
    <div>
      <label>密码：</label>
      <input type="text" id="psd" name="psd"/>
    </div>
    <div><button type="submit" id="submit">提交</button><button id="cancel">取消</button></div>

  </form>
</div>
</body>
</html>

