<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>房屋信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/css/demo.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/themes/default/easyui.css">
	<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=path%>/js/jquery-ui.js"></script>
	<script type="text/javascript" src="<%=path%>/js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		$(function(){
			
			$("#search").button().click(function(){
				searchTitle();
			});
			
			function searchTitle(){
				$("#tb").datagrid("load",{title:$("#title").val()});
			};
			
			$("#tb").datagrid({
				url:'listPageAction.action',
				rownumbers:true,
				iconCls:'icon-search',
				pagination:true,//显示底部分页栏
				pageSize:3,
				pageList:[3,6,9],
				fitColumns:true,//自适宽度,防止水平滚动
				striped:true,//隔行变色
				columns:[[
					{field:'addBookid',title:'编号',width:80},
					{field:'addDuty',title:'职务',width:100},
					{field:'addUnit',title:'公司名称',width:100},
					{field:'addOfficeaddress',title:'公司类型',width:80},
					{field:'addHomeaddress',title:'公司地址',width:80},
					{field:'addMobil',title:'联系电话',width:80},
					{field:'del',title:'操作',width:50,formatter:function(){
						return "<a  style='color:red'>删除</a>";
					}}
				]],
					onClickCell:function(index,field,v){
						
						if(field=="del"){
							$.messager.confirm('确认','您确认要删除记录吗?',function(ok){
								if(ok){
									var hid = $("#tb").datagrid("getRows")[index].id;
									$.getJSON("delAction.action",{id:hid},function(obj){
										$("#tb").datagrid("reload");
									});
								};
							});
						};
					},
				loadMsg:"数据加载中。。。。。。"
			});
		})
	</script>
  </head>
  
  <body>
   	<div class="easyui-layout" style="width: 100%;height: 100%;">
   		<div data-options="region:'north',title:'上',split:true" style="height:100px;"></div>   
   		<div data-options="region:'south',title:'下',split:true" style="height:100px;"></div>   
    	<div data-options="region:'east',title:'东',split:true" style="width:150px;"></div>   
    	<div data-options="region:'west',title:'西',split:true" style="width:150px;"></div>   
    	<div data-options="region:'center',title:'主体'" style="padding:5px;background:#eee;">
    		<div class="search" style="float: right;">
    			标题:<input id="title" type="text" name="title" size="40" />
    			<input id="search" type="button" name="search" value="搜索" />
    		</div>
    		<table id="tb" title="全部信息"></table>
    	</div>   
   	</div>
  </body>
</html>
