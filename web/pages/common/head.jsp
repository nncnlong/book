<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/5/10
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<!--写base标签，永远固定相对路径跳转的结果-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()+
            request.getContextPath()+"/";
%>

<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
