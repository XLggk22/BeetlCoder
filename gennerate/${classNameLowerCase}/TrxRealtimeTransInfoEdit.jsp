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
	  	<form id="edit_queryParameters" class="easyui-form" method="post" data-options="novalidate:true">
		  	<table style="line-height: 40px;margin: 20px;" >
		  		<tr>
		  			<td class="title">交易流水号:</td>
		  			<td class="input">
		  				<input id="edit_transSeqno" name="transSeqno" value="${transSeqno}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">第三方机构交易流水号:</td>
		  			<td class="input">
		  				<input id="edit_orgTransSeqno" name="orgTransSeqno" value="${orgTransSeqno}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">客户号:</td>
		  			<td class="input">
		  				<input id="edit_custNo" name="custNo" value="${custNo}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">银行卡号:</td>
		  			<td class="input">
		  				<input id="edit_bankCardNo" name="bankCardNo" value="${bankCardNo}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">银行卡类型:</td>
		  			<td class="input">
		  				<input id="edit_bankCardType" name="bankCardType" value="${bankCardType}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">币种:</td>
		  			<td class="input">
		  				<input id="edit_currency" name="currency" value="${currency}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易金额:</td>
		  			<td class="input">
		  				<input id="edit_transAmt" name="transAmt" value="${transAmt}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易类型:</td>
		  			<td class="input">
		  				<input id="edit_transType" name="transType" value="${transType}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易来源:</td>
		  			<td class="input">
		  				<input id="edit_transFrom" name="transFrom" value="${transFrom}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易描述:</td>
		  			<td class="input">
		  				<input id="edit_transDesc" name="transDesc" value="${transDesc}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易备注:</td>
		  			<td class="input">
		  				<input id="edit_remark" name="remark" value="${remark}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">短信验证码:</td>
		  			<td class="input">
		  				<input id="edit_validCode" name="validCode" value="${validCode}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">缩略卡号:</td>
		  			<td class="input">
		  				<input id="edit_storablePan" name="storablePan" value="${storablePan}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">支付机构处理日期:</td>
		  			<td class="input">
		  				<input id="edit_transDate" name="transDate" value="${transDate}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">支付机构处理时间:</td>
		  			<td class="input">
		  				<input id="edit_transTime" name="transTime" value="${transTime}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账日期:</td>
		  			<td class="input">
		  				<input id="edit_settleDate" name="settleDate" value="${settleDate}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易状态:</td>
		  			<td class="input">
		  				<input id="edit_status" name="status" value="${status}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回状态:</td>
		  			<td class="input">
		  				<input id="edit_thirdTransStatus" name="thirdTransStatus" value="${thirdTransStatus}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回码:</td>
		  			<td class="input">
		  				<input id="edit_returnCode" name="returnCode" value="${returnCode}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易返回码信息:</td>
		  			<td class="input">
		  				<input id="edit_returnMsg" name="returnMsg" value="${returnMsg}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账状态:</td>
		  			<td class="input">
		  				<input id="edit_balStatus" name="balStatus" value="${balStatus}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账结果:</td>
		  			<td class="input">
		  				<input id="edit_balResult" name="balResult" value="${balResult}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">对账任务编号:</td>
		  			<td class="input">
		  				<input id="edit_taskId" name="taskId" value="${taskId}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">客户姓名:</td>
		  			<td class="input">
		  				<input id="edit_custName" name="custName" value="${custName}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">证件类型:</td>
		  			<td class="input">
		  				<input id="edit_idType" name="idType" value="${idType}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">证件号码:</td>
		  			<td class="input">
		  				<input id="edit_idNo" name="idNo" value="${idNo}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">手机号码:</td>
		  			<td class="input">
		  				<input id="edit_mobileNo" name="mobileNo" value="${mobileNo}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">实时交易机构代码:</td>
		  			<td class="input">
		  				<input id="edit_realtimeThirdPartyCode" name="realtimeThirdPartyCode" value="${realtimeThirdPartyCode}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行名:</td>
		  			<td class="input">
		  				<input id="edit_openBankName" name="openBankName" value="${openBankName}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行编码:</td>
		  			<td class="input">
		  				<input id="edit_bankCode" name="bankCode" value="${bankCode}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">开户行省份编码:</td>
		  			<td class="input">
		  				<input id="edit_openBankProv" name="openBankProv" value="${openBankProv}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务类型:</td>
		  			<td class="input">
		  				<input id="edit_bizType" name="bizType" value="${bizType}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务对象类型:</td>
		  			<td class="input">
		  				<input id="edit_bizObjType" name="bizObjType" value="${bizObjType}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">令牌信息:</td>
		  			<td class="input">
		  				<input id="edit_token" name="token" value="${token}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务系统交易日期:</td>
		  			<td class="input">
		  				<input id="edit_bussTransDate" name="bussTransDate" value="${bussTransDate}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">业务系统交易流水号:</td>
		  			<td class="input">
		  				<input id="edit_bussTransSeqno" name="bussTransSeqno" value="${bussTransSeqno}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">自扣明细ID:</td>
		  			<td class="input">
		  				<input id="edit_batDetailId" name="batDetailId" value="${batDetailId}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">自扣批次ID:</td>
		  			<td class="input">
		  				<input id="edit_batId" name="batId" value="${batId}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">通知核心标识:</td>
		  			<td class="input">
		  				<input id="edit_notifyCtsFlag" name="notifyCtsFlag" value="${notifyCtsFlag}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易查询次数:</td>
		  			<td class="input">
		  				<input id="edit_queryCount" name="queryCount" value="${queryCount}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">版本号:</td>
		  			<td class="input">
		  				<input id="edit_version" name="version" value="${version}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">交易日期时间:</td>
		  			<td class="input">
		  				<input id="edit_createDatetime" name="createDatetime" value="${createDatetime}" class="easyui-textbox" required="true">
		  			</td>
		  			<td class="title">更新日期时间:</td>
		  			<td class="input">
		  				<input id="edit_updateDatetime" name="updateDatetime" value="${updateDatetime}" class="easyui-textbox" required="true">
		  			</td>
		  		</tr>
		  		
		  		<tr>
		  			<td colspan="6" align="center"><input type="button"  style="margin-top: 10px;" class="btn-save" onclick="editSave()" value="保存"/></td>
		  		</tr>
		  	</table>
	  	</form>
  </div>
  </body>
  <script type="text/javascript">
	function editSave(){

		if($("#edit_").combobox('getValue')==""){
			$.messager.alert('提示','');
			return;
		}
		
		$.ajax({
			url:'<%=basePath %>trxRealtimeTransInfo/save',
			type:'POST',
			dataType:"json",
			data:{
					"transSeqno" : $("#edit_transSeqno").combobox('getValue'),
					"orgTransSeqno" : $("#edit_orgTransSeqno").combobox('getValue'),
					"custNo" : $("#edit_custNo").combobox('getValue'),
					"bankCardNo" : $("#edit_bankCardNo").combobox('getValue'),
					"bankCardType" : $("#edit_bankCardType").combobox('getValue'),
					"currency" : $("#edit_currency").combobox('getValue'),
					"transAmt" : $("#edit_transAmt").combobox('getValue'),
					"transType" : $("#edit_transType").combobox('getValue'),
					"transFrom" : $("#edit_transFrom").combobox('getValue'),
					"transDesc" : $("#edit_transDesc").combobox('getValue'),
					"remark" : $("#edit_remark").combobox('getValue'),
					"validCode" : $("#edit_validCode").combobox('getValue'),
					"storablePan" : $("#edit_storablePan").combobox('getValue'),
					"transDate" : $("#edit_transDate").combobox('getValue'),
					"transTime" : $("#edit_transTime").combobox('getValue'),
					"settleDate" : $("#edit_settleDate").combobox('getValue'),
					"status" : $("#edit_status").combobox('getValue'),
					"thirdTransStatus" : $("#edit_thirdTransStatus").combobox('getValue'),
					"returnCode" : $("#edit_returnCode").combobox('getValue'),
					"returnMsg" : $("#edit_returnMsg").combobox('getValue'),
					"balStatus" : $("#edit_balStatus").combobox('getValue'),
					"balResult" : $("#edit_balResult").combobox('getValue'),
					"taskId" : $("#edit_taskId").combobox('getValue'),
					"custName" : $("#edit_custName").combobox('getValue'),
					"idType" : $("#edit_idType").combobox('getValue'),
					"idNo" : $("#edit_idNo").combobox('getValue'),
					"mobileNo" : $("#edit_mobileNo").combobox('getValue'),
					"realtimeThirdPartyCode" : $("#edit_realtimeThirdPartyCode").combobox('getValue'),
					"openBankName" : $("#edit_openBankName").combobox('getValue'),
					"bankCode" : $("#edit_bankCode").combobox('getValue'),
					"openBankProv" : $("#edit_openBankProv").combobox('getValue'),
					"bizType" : $("#edit_bizType").combobox('getValue'),
					"bizObjType" : $("#edit_bizObjType").combobox('getValue'),
					"token" : $("#edit_token").combobox('getValue'),
					"bussTransDate" : $("#edit_bussTransDate").combobox('getValue'),
					"bussTransSeqno" : $("#edit_bussTransSeqno").combobox('getValue'),
					"batDetailId" : $("#edit_batDetailId").combobox('getValue'),
					"batId" : $("#edit_batId").combobox('getValue'),
					"notifyCtsFlag" : $("#edit_notifyCtsFlag").combobox('getValue'),
					"queryCount" : $("#edit_queryCount").combobox('getValue'),
					"version" : $("#edit_version").combobox('getValue'),
					"createDatetime" : $("#edit_createDatetime").combobox('getValue'),
					"updateDatetime" : $("#edit_updateDatetime").combobox('getValue'),
			},
			success:function(data){
		 		if (data!=null&&data.code=="200"){
		 			$('#editDlg').dialog('close');
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
