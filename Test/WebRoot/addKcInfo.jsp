<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
	<h3>请填写课程信息</h3>
	<hr width="700" align="left">
	<s:form action="addXs" method="post" enctype="multipart/form-data">
		<table border="0" cellspacing="0" cellpadding="1">
			<tr>
				<td>
					<s:textfield name="kc.kch" label="课程号" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="kc.kcm" label="课程名" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<s:textfield name="kc.kxxq" label="开学学期" value=""></s:textfield>
			</tr>
			<tr>
				<td>
					<s:textfield name="kc.xs" label="学时" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="kc.xf" label="学分" value=""></s:textfield>
				</td>
			</tr>
		</table>
		<p>
		<input type="submit" value="添加"/>
		<input type="reset" value="重置"/>
	</s:form>
</body>
</html>
