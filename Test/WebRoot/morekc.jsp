<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
	<h3>该课程信息如下：</h3>
	<s:set name="kc" value="#request.kc"></s:set>
	<s:form action="kcInfo" method="post">
		<table border="0" cellpadding="5">
			<tr>
				<td>课程号：</td>
				<td width="100">
					<s:property value="#kc.kch"/>
				</td>
			</tr>
			<tr>
				<td>课程名：</td>
				<td width="100">
					<s:property value="#kc.kcm"/>
				</td>
			</tr>
			<tr>
				<td>开学学期：</td>
				<td width="100">
					<s:property value="#kc.kxxq"/>
				</td>
			</tr>
			<tr>
				<td>学时：</td>
				<td width="100">
					<s:property value="#kc.xs"/>
				</td>
			</tr>
			<tr>
				<td>学分：</td>
				<td width="100">
					<s:property value="#kc.xf"/>
				</td>
			</tr>
			<tr>
				<td align="right">
					<s:submit value="返回"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
