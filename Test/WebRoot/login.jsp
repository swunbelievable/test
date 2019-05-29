<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
#fra {
	margin-top: -15px;
	margin-left: 28px;
	margin-bottom: 4px;
}
#wrap {
	height: 719px;
	width: 100;
	background-image: url(images/time.jpg);
	background-repeat: no-repeat;
	background-position: center center;
	position: relative;
}
#head {
	height: 120px;
	width: 100;
	background-color: #66CCCC;
	text-align: center;
	position: relative;
}
#foot {
	width: 100;
	height: 126px;
	background-color: #CC9933;
	position: relative;
}
#wrap .logGet {
	height: 408px;
	width: 368px;  
	position: absolute;
	background-color: #FFFFFF;
	top: 20%;
	right: 15%;
}
.logC a button {
	width: 100%;
	height: 45px;
	background-color: #ee7700;
	border: none;
	color: white;
	font-size: 18px;
}
.logGet .logD.logDtip .p1 {
	display: inline-block;
	font-size: 28px;
	margin-top: 30px;
	width: 86%;
}
#wrap .logGet .logD.logDtip {
	width: 86%;
	border-bottom: 1px solid #ee7700;
	margin-bottom: 60px;
	margin-top: 0px;
	margin-right: auto;
	margin-left: auto;
}
.logGet .lgD img {
	position: absolute;
	top: 12px;
	left: 8px;
}
.logGet .lgD input {
	width: 100%;
	height: 42px;
	text-indent: 2.5rem;
}
#wrap .logGet .lgD {
	width: 86%;
	position: relative;
	margin-bottom: 30px;
	margin-top: 30px;
	margin-right: auto;
	margin-left: auto;
}
#wrap .logGet .logC {
	width: 86%;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}
 
 
.title {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  /* 使用css3的transform来实现 */
	font-size: 36px;
	height: 40px;
	width: 30%;
}
 
.copyright {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  /* 使用css3的transform来实现 */
	height: 60px;
	width: 40%;
	text-align:center;
}
	
 
#foot .copyright .img {
	width: 100%;
	height: 24px;
	position: relative;
}
.copyright .img .icon {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E7%94%B5%E5%AD%90%E9%82%AE%E4%BB%B6.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
	
.copyright .img .icon1 {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E5%9C%B0%E5%9D%80.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
.copyright .img .icon2 {
	display: inline-block;
	width: 24px;
	height: 24px;
	margin-left: 22px;
	vertical-align: middle;
	background-image: url(%E8%81%94%E7%B3%BB%E6%96%B9%E5%BC%8F.png);
	background-repeat: no-repeat;
	vertical-align: middle;
	margin-right: 5px;
}
#foot .copyright p {
	height: 24px;
	width: 100%;
}
</style>
</head>
 
<body>
<form action="login" method="post">
<div class="header" id="head">
  <div class="title">教务系统</div>
	
</div>
	
<div class="wrap" id="wrap">
	<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">登录</p>
			</div>
			<!-- 输入框 -->
			<div class="lgD">
				<img src="img/logName.png" width="20" height="20" alt=""/>
				<input name="dl.xh" type="text"
					placeholder="输入用户名" />
			</div>
			<div class="lgD">
				<img src="img/logPwd.png" width="20" height="20" alt=""/>
				<input name="dl.kl" type="password"
					placeholder="输入用户密码" />
			</div>
			<div id="fra">用户类型：
				<select name="dl.type">
					<option value="学生">学生</option>
					<option value="教师">教师</option>
					<option value="管理员">管理员</option>
					<option value="教务">教务</option>
				</select>
			</div>
			<div class="logC">
				<a href="" target="_self"><button>登 录</button></a>
				<br/><br/>
				<a style="margin-top:10px ;" target="_self"><button>重置</button></a>
			</div>
		</div>
</div>
	
<div class="footer" id="foot">
  <div class="copyright">
    <p>Copyright © 0000.000.000 All Rights Reserved.</p>
    <div class="img">
		<i class="icon"></i><span>联系邮箱：00000000@00.com</span>
	</div>
	
	<div class="img">
		<i class="icon1"></i><span>联系地址：湖南工业大学</span>
	</div>
	  
	<div class="img">
	  <i class="icon2"></i><span>联系电话：0000000000</span>
	</div>
 
 
  </div>
	
</div>
	
</form>
</body>
</html>