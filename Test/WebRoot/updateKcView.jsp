<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
	<s:set name="xs" value="#request.kcInfo"></s:set>
	<s:form action="updateKc" method="post" enctype="multipart/form-data">
		<table border="0" cellspacing="1" cellpadding="8" width="500">
			<tr>
				<td width="80">课程号：</td>
				<td>
					<input type="text" name="kc.kch" value="<s:property value="#kc.kch"/>" readonly/>
				</td>
			</tr>
			<tr>
				<td width="80">课程名：</td>
				<td>
					<input type="text" name="kc.kcm"	value="<s:property value="#kc.kcm"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">开学学期：</td>
				<td>
					<input type="text" name="kc.kxxq" value="<s:property value="#kc.kxxq"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">学时：</td>
				<td>
					<input type="text" name="kc.xs" value="<s:property value="#kc.xs"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">学分：</td>
				<td>
					<input type="text" name="kc.xf" value="<s:property value="#kc.xf"/>"/>
				</td>
			</tr>
		</table>
		<input type="submit" value="修改"/>
		<input type="button" value="返回" onclick="javascript:history.back();"/>
	</s:form>
	<script type="text/javascript">
		document.getElementById("xs.zyb.id").value='<s:property value="#xs.zyb.id"/>'
	</script>
</body>
</html>
