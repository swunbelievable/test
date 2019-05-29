<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<s:set name="dl" value="#session['dl']"/>
	<s:property value="#dl.xh"/>登录成功！欢迎使用教务系统。
</body>
</html>
