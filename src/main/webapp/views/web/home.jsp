<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chu</title>
</head>
<body>
<%-- de lay duowc chu fullName trong cai model ma ben controller tra ve thi phai cho them cai nay cua thu vien jsp --%>>
<%-- <%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core" %>, cái dongf này đc đưa cho vào file này <%@include file="/common/taglib.jsp" %>--%>
<h1>${model.fullName}</h1>
<%--Dau $ la expression langague --%>>

</body>
</html>