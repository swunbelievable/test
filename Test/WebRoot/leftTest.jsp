<%@ page language="java" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生成绩管理系统</title>
    <style type="text/css">
        #menu{
            width: 200px;
            height: 500px;
            border: 1px solid #999;
        }
        #menu ul{
            margin-top: 20px;
            margin-left: 5px;
            padding: px;
            list-style: none;/* 隐藏默认列表符号*/
            background-image: url();
        }
        #menu ul li{
            background: #CC9933;
            height: 10x;
            margin-bottom: 80px;
            margin-right: 20px;
            line-height: 40px;  /*行距*/
            text-align: center;
            border-bottom: 1px solid #999;
            position: relative;
        }
        a{
            display: block;
            font-size: 13px;
            color: #FFF;
            text-decoration: none;/*隐藏超廉价默认下划线*/
        }
        a:hover{
            color:#F00;
            font-size: 14px;
        }
        #menu ul li ul{
            display: none;/*默认隐藏*/
            top:0px;
            width: 130px;
            margin-top: 0px;
            margin-bottom: 0px;
            border: 1px solid #ccc;
            border-bottom: none;
            position: absolute;
            left: 100px;
        }
        #menu ul li ul li{
            background: #CC9933;
            height: 10x;
            margin-bottom: 20px;
            margin-right: 20px;
            line-height: 40px;  /*行距*/
            text-align: center;
            border-bottom: 1px solid #999;
            position: relative;
        }
        #menu ul li:hover ul{
            display: block;
        }
        #menu ul li:hover ul li a{
            display: block;
        }
    </style>
</head>
<body>
<div id="menu">
    <ul>
    <li><font size="4px">学生信息管理</font>
        <ul>
            <li><a href="addXsView.action" target="right">学生信息录入</a></li>
            <li><a href="xsInfo.action" target="right">学生信息查询</a></li>
        </ul>
    </li>
    <li><font size="4px">课程信息管理</font>
        <ul>
            <li><a href="addKcView.action" target="right">课程信息录入</a></li>
            <li><a href="kcInfo.action" target="right">课程信息查询</a></li>
        </ul>
    </li>
    <li>成绩信息管理</font>
        <ul>
            <li><a href="addXscjView.action" target="right">成绩信息录入</a></li>
            <li><a href="xscjInfo.action" target="right">学生成绩查询</a></li>
        </ul>
    </li>
    </ul>
</div>
</body>
</html>