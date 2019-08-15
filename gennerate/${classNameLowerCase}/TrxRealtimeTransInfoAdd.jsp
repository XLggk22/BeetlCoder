<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/jquery-easyui-1.4.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/css/button.css">
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/jquery-easyui-1.4.3/datagrid-bufferview.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/artDialog/jquery.artDialog.js?skin=aero"></script>
	<style>
		td{
			padding:10px 10px;
		}
		.input{
	    	width:155px;
	    }
	    .title{
	    	text-align: right;
	    }
	</style>
  </head>

  <body>
  	<div>
	  	<form id="add_queryParameters" class="easyui-form" method="post" data-options="novalidate:true">
		  	<table style="line-height: 40px;margin: 20px;" >
		  		<tr>
		  			<td class="title">交易流水号:</td>
		  			<td class="input">
		  				<input id="add_transSeqno" name="transSeqno" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">第三方机构交易流水号:</td>
		  			<td class="input">
		  				<input id="add_orgTransSeqno" name="orgTransSeqno" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">客户号:</td>
		  			<td class="input">
		  				<input id="add_custNo" name="custNo" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">银行卡号:</td>
		  			<td class="input">
		  				<input id="add_bankCardNo" name="bankCardNo" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">银行卡类型:</td>
		  			<td class="input">
		  				<input id="add_bankCardType" name="bankCardType" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">币种:</td>
		  			<td class="input">
		  				<input id="add_currency" name="currency" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易金额:</td>
		  			<td class="input">
		  				<input id="add_transAmt" name="transAmt" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易类型:</td>
		  			<td class="input">
		  				<input id="add_transType" name="transType" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易来源:</td>
		  			<td class="input">
		  				<input id="add_transFrom" name="transFrom" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易描述:</td>
		  			<td class="input">
		  				<input id="add_transDesc" name="transDesc" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易备注:</td>
		  			<td class="input">
		  				<input id="add_remark" name="remark" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">短信验证码:</td>
		  			<td class="input">
		  				<input id="add_validCode" name="validCode" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">缩略卡号:</td>
		  			<td class="input">
		  				<input id="add_storablePan" name="storablePan" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">支付机构处理日期:</td>
		  			<td class="input">
		  				<input id="add_transDate" name="transDate" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">支付机构处理时间:</td>
		  			<td class="input">
		  				<input id="add_transTime" name="transTime" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账日期:</td>
		  			<td class="input">
		  				<input id="add_settleDate" name="settleDate" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易状态:</td>
		  			<td class="input">
		  				<input id="add_status" name="status" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回状态:</td>
		  			<td class="input">
		  				<input id="add_thirdTransStatus" name="thirdTransStatus" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回码:</td>
		  			<td class="input">
		  				<input id="add_returnCode" name="returnCode" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回码信息:</td>
		  			<td class="input">
		  				<input id="add_returnMsg" name="returnMsg" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账状态:</td>
		  			<td class="input">
		  				<input id="add_balStatus" name="balStatus" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账结果:</td>
		  			<td class="input">
		  				<input id="add_balResult" name="balResult" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账任务编号:</td>
		  			<td class="input">
		  				<input id="add_taskId" name="taskId" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">客户姓名:</td>
		  			<td class="input">
		  				<input id="add_custName" name="custName" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">证件类型:</td>
		  			<td class="input">
		  				<input id="add_idType" name="idType" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">证件号码:</td>
		  			<td class="input">
		  				<input id="add_idNo" name="idNo" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">手机号码:</td>
		  			<td class="input">
		  				<input id="add_mobileNo" name="mobileNo" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">实时交易机构代码:</td>
		  			<td class="input">
		  				<input id="add_realtimeThirdPartyCode" name="realtimeThirdPartyCode" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行名:</td>
		  			<td class="input">
		  				<input id="add_openBankName" name="openBankName" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行编码:</td>
		  			<td class="input">
		  				<input id="add_bankCode" name="bankCode" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行省份编码:</td>
		  			<td class="input">
		  				<input id="add_openBankProv" name="openBankProv" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务类型:</td>
		  			<td class="input">
		  				<input id="add_bizType" name="bizType" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务对象类型:</td>
		  			<td class="input">
		  				<input id="add_bizObjType" name="bizObjType" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">令牌信息:</td>
		  			<td class="input">
		  				<input id="add_token" name="token" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务系统交易日期:</td>
		  			<td class="input">
		  				<input id="add_bussTransDate" name="bussTransDate" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务系统交易流水号:</td>
		  			<td class="input">
		  				<input id="add_bussTransSeqno" name="bussTransSeqno" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">自扣明细ID:</td>
		  			<td class="input">
		  				<input id="add_batDetailId" name="batDetailId" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">自扣批次ID:</td>
		  			<td class="input">
		  				<input id="add_batId" name="batId" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">通知核心标识:</td>
		  			<td class="input">
		  				<input id="add_notifyCtsFlag" name="notifyCtsFlag" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易查询次数:</td>
		  			<td class="input">
		  				<input id="add_queryCount" name="queryCount" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">版本号:</td>
		  			<td class="input">
		  				<input id="add_version" name="version" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易日期时间:</td>
		  			<td class="input">
		  				<input id="add_createDatetime" name="createDatetime" value="" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">更新日期时间:</td>
		  			<td class="input">
		  				<input id="add_updateDatetime" name="updateDatetime" value="" class="easyui-textbox" required="true">
		  			</td>
		  		</tr>
		  		
		  		<tr>
		  			<td colspan="6" align="center"><input type="button"  style="margin-top: 10px;" class="btn-save" onclick="addSave()" value="保存"/></td>
		  		</tr>
		  	</table>
	  	</form>
  </div>
  </body>
  <script type="text/javascript">
	function addSave(){
		if($("#add_").combobox('getValue')==""){
			$.messager.alert('提示','');
			return;
		}
		
		$.ajax({
			url:'<%=basePath %>trxRealtimeTransInfo/save',
			type:'POST',
			dataType:"json",
			data:{
					"transSeqno" : $("#add_transSeqno").combobox('getValue'),
					"orgTransSeqno" : $("#add_orgTransSeqno").combobox('getValue'),
					"custNo" : $("#add_custNo").combobox('getValue'),
					"bankCardNo" : $("#add_bankCardNo").combobox('getValue'),
					"bankCardType" : $("#add_bankCardType").combobox('getValue'),
					"currency" : $("#add_currency").combobox('getValue'),
					"transAmt" : $("#add_transAmt").combobox('getValue'),
					"transType" : $("#add_transType").combobox('getValue'),
					"transFrom" : $("#add_transFrom").combobox('getValue'),
					"transDesc" : $("#add_transDesc").combobox('getValue'),
					"remark" : $("#add_remark").combobox('getValue'),
					"validCode" : $("#add_validCode").combobox('getValue'),
					"storablePan" : $("#add_storablePan").combobox('getValue'),
					"transDate" : $("#add_transDate").combobox('getValue'),
					"transTime" : $("#add_transTime").combobox('getValue'),
					"settleDate" : $("#add_settleDate").combobox('getValue'),
					"status" : $("#add_status").combobox('getValue'),
					"thirdTransStatus" : $("#add_thirdTransStatus").combobox('getValue'),
					"returnCode" : $("#add_returnCode").combobox('getValue'),
					"returnMsg" : $("#add_returnMsg").combobox('getValue'),
					"balStatus" : $("#add_balStatus").combobox('getValue'),
					"balResult" : $("#add_balResult").combobox('getValue'),
					"taskId" : $("#add_taskId").combobox('getValue'),
					"custName" : $("#add_custName").combobox('getValue'),
					"idType" : $("#add_idType").combobox('getValue'),
					"idNo" : $("#add_idNo").combobox('getValue'),
					"mobileNo" : $("#add_mobileNo").combobox('getValue'),
					"realtimeThirdPartyCode" : $("#add_realtimeThirdPartyCode").combobox('getValue'),
					"openBankName" : $("#add_openBankName").combobox('getValue'),
					"bankCode" : $("#add_bankCode").combobox('getValue'),
					"openBankProv" : $("#add_openBankProv").combobox('getValue'),
					"bizType" : $("#add_bizType").combobox('getValue'),
					"bizObjType" : $("#add_bizObjType").combobox('getValue'),
					"token" : $("#add_token").combobox('getValue'),
					"bussTransDate" : $("#add_bussTransDate").combobox('getValue'),
					"bussTransSeqno" : $("#add_bussTransSeqno").combobox('getValue'),
					"batDetailId" : $("#add_batDetailId").combobox('getValue'),
					"batId" : $("#add_batId").combobox('getValue'),
					"notifyCtsFlag" : $("#add_notifyCtsFlag").combobox('getValue'),
					"queryCount" : $("#add_queryCount").combobox('getValue'),
					"version" : $("#add_version").combobox('getValue'),
					"createDatetime" : $("#add_createDatetime").combobox('getValue'),
					"updateDatetime" : $("#add_updateDatetime").combobox('getValue'),
			},
			success:function(data){
		 		if (data!=null&&data.code=="200"){
		 			$('#addDlg').dialog('close');
					$.messager.alert("","操作成功");
					$("#dataList").datagrid("reload");
				}else{
					$.messager.alert('error',data.message);
				}
	
			}
		});
	
	}
  </script>
</html>
