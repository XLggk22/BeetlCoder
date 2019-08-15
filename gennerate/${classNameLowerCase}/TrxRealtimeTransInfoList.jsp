<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = path+"/";
HttpSession httpSession = request.getSession();
String userId = (String)httpSession.getAttribute("userId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">

    <title>萨摩耶运营管理平台</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath %>static/jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/jquery-easyui-1.4.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/css/button.css">
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/datagrid-bufferview.js"></script>

	<style>
		td{
			padding:10px 10px;
		}
	</style>

    <style>
    .input{
    	width:155px;
    }
    .title{
    	text-align: right;
    }
    </style>
  </head>

  <body>
	<div id = "conditionPanel" title="查询条件" class="easyui-panel" style="width:100%;" data-options="collapsible:true">
	<div style="width:1300px">

		<form id="queryParameters">
	  	<table style="line-height: 40px;margin: 20px;" >
	  		<tr style="">
	  			<td class="title">select条件:</td>
	  			<td class="input">
	  				<select id="field1_Qry" class="easyui-combobox" name="" style="width:150px;">
	  					<option value="">全部</option>
	  				</select>
	  			</td>
	  			<td class="title">input条件:</td>
	  			<td class="input">
					<input id="field2_Qry" class="easyui-textbox" style="width:150px;"></input>
	  			</td>
	  			<td><input type="button"  style="margin-left: 40px;" class="btn-search" onclick="searchForm()" value="查询"/></td>
	  		</tr>
	  	</table>
  	</form>
	</div>
	</div>
	<div style="margin:10px 0px">
	 	<div id = "gridPanel" title="列表" class="easyui-panel" style="padding:5px;width:100%;" >
	 	<div id="toolbar">
			<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="add()">添加</a>
		</div>
	  	<table id="dataList" style="width:100%;" ></table>
	  	</div>
	</div>

    <div id="addDlg" class="easyui-dialog" title="代收付交易流水表" data-options="modal:true,closed:true" style="width:850px;height:200px;padding:10px;top:20%">
  	</div>
  	<div id="editDlg" class="easyui-dialog" title="代收付交易流水表" data-options="modal:true,closed:true" style="width:800px;height:180px;padding:10px;top:20%">
  	</div>
  </body>
    <script type="text/javascript">


	$(function(){
		//首次查询
		searchForm();

		//渲染列表
		$('#dataList').datagrid({
			url:'<%=basePath %>trxRealtimeTransInfo/queryList',
		    columns:[[
				{field:'transSeqno',title:'交易流水号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'orgTransSeqno',title:'第三方机构交易流水号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'custNo',title:'客户号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bankCardNo',title:'银行卡号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bankCardType',title:'银行卡类型',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'currency',title:'币种',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transAmt',title:'交易金额',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transType',title:'交易类型',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transFrom',title:'交易来源',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transDesc',title:'交易描述',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'remark',title:'交易备注',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'validCode',title:'短信验证码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'storablePan',title:'缩略卡号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transDate',title:'支付机构处理日期',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'transTime',title:'支付机构处理时间',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'settleDate',title:'对账日期',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'status',title:'交易状态',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'thirdTransStatus',title:'交易返回状态',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'returnCode',title:'交易返回码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'returnMsg',title:'交易返回码信息',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'balStatus',title:'对账状态',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'balResult',title:'对账结果',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'taskId',title:'对账任务编号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'custName',title:'客户姓名',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'idType',title:'证件类型',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'idNo',title:'证件号码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'mobileNo',title:'手机号码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'realtimeThirdPartyCode',title:'实时交易机构代码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'openBankName',title:'开户行名',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bankCode',title:'开户行编码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'openBankProv',title:'开户行省份编码',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bizType',title:'业务类型',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bizObjType',title:'业务对象类型',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'token',title:'令牌信息',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bussTransDate',title:'业务系统交易日期',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'bussTransSeqno',title:'业务系统交易流水号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'batDetailId',title:'自扣明细ID',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'batId',title:'自扣批次ID',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'notifyCtsFlag',title:'通知核心标识',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'queryCount',title:'交易查询次数',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'version',title:'版本号',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'createDatetime',title:'交易日期时间',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
				{field:'updateDatetime',title:'更新日期时间',width:100,align:'center',
					formatter: function(value,row){
						return value;
					}
				},
		        {field:'operation',title:'操作',width:500,align:'left',
					formatter:function(value,rec){
						var query =""

						query = '<a href="javascript:void(0)" style="color:blue;margin-left:10px"  onclick="edit(\''+rec.id+'\');">修改</a>';

						query += '<a href="javascript:void(0)" style="color:blue;margin-left:10px"  onclick="deleteAc(\''+rec.id+'\');">删除</a>';

						return query;
					}
				}
		    ]],
	        striped:true,//设置为true将交替显示行背景
	        singleSelect:true,//设置为true将只允许选择一行
	        checkOnSelect:false,//如果设置为 true，当用户点击一行的时候 checkbox checked(选择)/unchecked(取消选择)。 如果为false，当用户点击刚好在checkbox的时候，checkbox checked(选择)/unchecked(取消选择)
		    selectOnCheck:true,
	        rownumbers:true, //设置为true将显示行数
		    pagination:true, //设置true将在数据表格底部显示分页工具栏
		    pageNumber:1,//当设置分页属性时，初始化分页码
		    pageSize:20,//当设置分页属性时，初始化每页记录数
		    pageList:[20,40] //当设置分页属性时，初始化每页记录数列表
		});

	});

	//查询列表
	function searchForm(){
		$('#dataList').datagrid({
		   url:'<%=basePath %>trxRealtimeTransInfo/queryList',
	       loadMsg : "正在加载，请稍等...",
		   queryParams:  {
			      "transSeqno" : $("#transSeqno_Qry").combobox('getValue'),
			      "orgTransSeqno" : $("#orgTransSeqno_Qry").combobox('getValue'),
			      "custNo" : $("#custNo_Qry").combobox('getValue'),
			      "bankCardNo" : $("#bankCardNo_Qry").combobox('getValue'),
			      "bankCardType" : $("#bankCardType_Qry").combobox('getValue'),
			      "currency" : $("#currency_Qry").combobox('getValue'),
			      "transAmt" : $("#transAmt_Qry").combobox('getValue'),
			      "transType" : $("#transType_Qry").combobox('getValue'),
			      "transFrom" : $("#transFrom_Qry").combobox('getValue'),
			      "transDesc" : $("#transDesc_Qry").combobox('getValue'),
			      "remark" : $("#remark_Qry").combobox('getValue'),
			      "validCode" : $("#validCode_Qry").combobox('getValue'),
			      "storablePan" : $("#storablePan_Qry").combobox('getValue'),
			      "transDate" : $("#transDate_Qry").combobox('getValue'),
			      "transTime" : $("#transTime_Qry").combobox('getValue'),
			      "settleDate" : $("#settleDate_Qry").combobox('getValue'),
			      "status" : $("#status_Qry").combobox('getValue'),
			      "thirdTransStatus" : $("#thirdTransStatus_Qry").combobox('getValue'),
			      "returnCode" : $("#returnCode_Qry").combobox('getValue'),
			      "returnMsg" : $("#returnMsg_Qry").combobox('getValue'),
			      "balStatus" : $("#balStatus_Qry").combobox('getValue'),
			      "balResult" : $("#balResult_Qry").combobox('getValue'),
			      "taskId" : $("#taskId_Qry").combobox('getValue'),
			      "custName" : $("#custName_Qry").combobox('getValue'),
			      "idType" : $("#idType_Qry").combobox('getValue'),
			      "idNo" : $("#idNo_Qry").combobox('getValue'),
			      "mobileNo" : $("#mobileNo_Qry").combobox('getValue'),
			      "realtimeThirdPartyCode" : $("#realtimeThirdPartyCode_Qry").combobox('getValue'),
			      "openBankName" : $("#openBankName_Qry").combobox('getValue'),
			      "bankCode" : $("#bankCode_Qry").combobox('getValue'),
			      "openBankProv" : $("#openBankProv_Qry").combobox('getValue'),
			      "bizType" : $("#bizType_Qry").combobox('getValue'),
			      "bizObjType" : $("#bizObjType_Qry").combobox('getValue'),
			      "token" : $("#token_Qry").combobox('getValue'),
			      "bussTransDate" : $("#bussTransDate_Qry").combobox('getValue'),
			      "bussTransSeqno" : $("#bussTransSeqno_Qry").combobox('getValue'),
			      "batDetailId" : $("#batDetailId_Qry").combobox('getValue'),
			      "batId" : $("#batId_Qry").combobox('getValue'),
			      "notifyCtsFlag" : $("#notifyCtsFlag_Qry").combobox('getValue'),
			      "queryCount" : $("#queryCount_Qry").combobox('getValue'),
			      "version" : $("#version_Qry").combobox('getValue'),
			      "createDatetime" : $("#createDatetime_Qry").combobox('getValue'),
			      "updateDatetime" : $("#updateDatetime_Qry").combobox('getValue'),
			   }
		});

	}

	//新增
	function add(){
		var addr = "<%=basePath %>trxRealtimeTransInfo/add";
		 $('#addDlg').dialog({
			closed: false,
  	    	cache: false,
  	    	height: 260,
  	    	href: addr
  		});
	}
	
	//修改
	function edit(id){
		var addr = "<%=basePath %>trxRealtimeTransInfo/edit?id="+id;
		 $('#editDlg').dialog({
			closed: false,
   	    	cache: false,
   	    	height:260,
   	    	href: addr
   		});
	}

	//删除
	function deleteAc(id){
		$.messager.confirm("提示","确定删除配置信息",function (data) {
            if (data) {
            	$.ajax({
    				url:'<%=basePath %>trxRealtimeTransInfo/deleteAc?id='+id,
    				type:"GET",
    				dataType:"json",
    				success:function(data){
    					if (data!=null&&data.code=="200"){
    						$.messager.alert("返回信息","删除配置成功");
    						$("#dataList").datagrid("reload");
    					}else{
    						$.messager.alert('返回信息',data.message);
    					}
    				}
    			});
            }

		});
	}
	</script>
</html>
