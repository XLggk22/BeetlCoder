package com.smy.pcs.domain;

import com.smy.framework.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * 代收付交易流水表 
 * @author guoyunfeng
 *
 */
public class TrxRealtimeTransInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
	
	/**
	 * colunmDesc:交易流水号 
	 */
	private String transSeqno;
	/**
	 * colunmDesc:第三方机构交易流水号 
	 */
	private String orgTransSeqno;
	/**
	 * colunmDesc:客户号 
	 */
	private String custNo;
	/**
	 * colunmDesc:银行卡号 
	 */
	private String bankCardNo;
	/**
	 * colunmDesc:银行卡类型 
	 */
	private String bankCardType;
	/**
	 * colunmDesc:币种 
	 */
	private String currency;
	/**
	 * colunmDesc:交易金额 
	 */
	private BigDecimal transAmt;
	/**
	 * colunmDesc:交易类型 
	 */
	private String transType;
	/**
	 * colunmDesc:交易来源 
	 */
	private String transFrom;
	/**
	 * colunmDesc:交易描述 
	 */
	private String transDesc;
	/**
	 * colunmDesc:交易备注 
	 */
	private String remark;
	/**
	 * colunmDesc:短信验证码 
	 */
	private String validCode;
	/**
	 * colunmDesc:缩略卡号 
	 */
	private String storablePan;
	/**
	 * colunmDesc:支付机构处理日期 
	 */
	private Integer transDate;
	/**
	 * colunmDesc:支付机构处理时间 
	 */
	private String transTime;
	/**
	 * colunmDesc:对账日期 
	 */
	private Integer settleDate;
	/**
	 * colunmDesc:交易状态 
	 */
	private String status;
	/**
	 * colunmDesc:交易返回状态 
	 */
	private String thirdTransStatus;
	/**
	 * colunmDesc:交易返回码 
	 */
	private String returnCode;
	/**
	 * colunmDesc:交易返回码信息 
	 */
	private String returnMsg;
	/**
	 * colunmDesc:对账状态 
	 */
	private String balStatus;
	/**
	 * colunmDesc:对账结果 
	 */
	private String balResult;
	/**
	 * colunmDesc:对账任务编号 
	 */
	private String taskId;
	/**
	 * colunmDesc:客户姓名 
	 */
	private String custName;
	/**
	 * colunmDesc:证件类型 
	 */
	private String idType;
	/**
	 * colunmDesc:证件号码 
	 */
	private String idNo;
	/**
	 * colunmDesc:手机号码 
	 */
	private String mobileNo;
	/**
	 * colunmDesc:实时交易机构代码 
	 */
	private String realtimeThirdPartyCode;
	/**
	 * colunmDesc:开户行名 
	 */
	private String openBankName;
	/**
	 * colunmDesc:开户行编码 
	 */
	private String bankCode;
	/**
	 * colunmDesc:开户行省份编码 
	 */
	private String openBankProv;
	/**
	 * colunmDesc:业务类型 
	 */
	private String bizType;
	/**
	 * colunmDesc:业务对象类型 
	 */
	private String bizObjType;
	/**
	 * colunmDesc:令牌信息 
	 */
	private String token;
	/**
	 * colunmDesc:业务系统交易日期 
	 */
	private Integer bussTransDate;
	/**
	 * colunmDesc:业务系统交易流水号 
	 */
	private String bussTransSeqno;
	/**
	 * colunmDesc:自扣明细ID 
	 */
	private String batDetailId;
	/**
	 * colunmDesc:自扣批次ID 
	 */
	private String batId;
	/**
	 * colunmDesc:通知核心标识 
	 */
	private String notifyCtsFlag;
	/**
	 * colunmDesc:交易查询次数 
	 */
	private Integer queryCount;
	/**
	 * colunmDesc:版本号 
	 */
	private Integer version;
	/**
	 * colunmDesc:交易日期时间 
	 */
	private Timestamp createDatetime;
	/**
	 * colunmDesc:更新日期时间 
	 */
	private Timestamp updateDatetime;

	
	/**
	 * 获取交易流水号
	 * @param transSeqno 交易流水号
	 */
	public void setTransSeqno(String transSeqno){
		this.transSeqno = transSeqno;
	}
	/**
	 * 获取交易流水号
	 * @return 交易流水号
	 */
	public String getTransSeqno() {
		return transSeqno;
	}
	
	
	/**
	 * 获取第三方机构交易流水号
	 * @param orgTransSeqno 第三方机构交易流水号
	 */
	public void setOrgTransSeqno(String orgTransSeqno){
		this.orgTransSeqno = orgTransSeqno;
	}
	/**
	 * 获取第三方机构交易流水号
	 * @return 第三方机构交易流水号
	 */
	public String getOrgTransSeqno() {
		return orgTransSeqno;
	}
	
	
	/**
	 * 获取客户号
	 * @param custNo 客户号
	 */
	public void setCustNo(String custNo){
		this.custNo = custNo;
	}
	/**
	 * 获取客户号
	 * @return 客户号
	 */
	public String getCustNo() {
		return custNo;
	}
	
	
	/**
	 * 获取银行卡号
	 * @param bankCardNo 银行卡号
	 */
	public void setBankCardNo(String bankCardNo){
		this.bankCardNo = bankCardNo;
	}
	/**
	 * 获取银行卡号
	 * @return 银行卡号
	 */
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	
	/**
	 * 获取银行卡类型
	 * @param bankCardType 银行卡类型
	 */
	public void setBankCardType(String bankCardType){
		this.bankCardType = bankCardType;
	}
	/**
	 * 获取银行卡类型
	 * @return 银行卡类型
	 */
	public String getBankCardType() {
		return bankCardType;
	}
	
	
	/**
	 * 获取币种
	 * @param currency 币种
	 */
	public void setCurrency(String currency){
		this.currency = currency;
	}
	/**
	 * 获取币种
	 * @return 币种
	 */
	public String getCurrency() {
		return currency;
	}
	
	
	/**
	 * 获取交易金额
	 * @param transAmt 交易金额
	 */
	public void setTransAmt(BigDecimal transAmt){
		this.transAmt = transAmt;
	}
	/**
	 * 获取交易金额
	 * @return 交易金额
	 */
	public BigDecimal getTransAmt() {
		return transAmt;
	}
	
	
	/**
	 * 获取交易类型
	 * @param transType 交易类型
	 */
	public void setTransType(String transType){
		this.transType = transType;
	}
	/**
	 * 获取交易类型
	 * @return 交易类型
	 */
	public String getTransType() {
		return transType;
	}
	
	
	/**
	 * 获取交易来源
	 * @param transFrom 交易来源
	 */
	public void setTransFrom(String transFrom){
		this.transFrom = transFrom;
	}
	/**
	 * 获取交易来源
	 * @return 交易来源
	 */
	public String getTransFrom() {
		return transFrom;
	}
	
	
	/**
	 * 获取交易描述
	 * @param transDesc 交易描述
	 */
	public void setTransDesc(String transDesc){
		this.transDesc = transDesc;
	}
	/**
	 * 获取交易描述
	 * @return 交易描述
	 */
	public String getTransDesc() {
		return transDesc;
	}
	
	
	/**
	 * 获取交易备注
	 * @param remark 交易备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 * 获取交易备注
	 * @return 交易备注
	 */
	public String getRemark() {
		return remark;
	}
	
	
	/**
	 * 获取短信验证码
	 * @param validCode 短信验证码
	 */
	public void setValidCode(String validCode){
		this.validCode = validCode;
	}
	/**
	 * 获取短信验证码
	 * @return 短信验证码
	 */
	public String getValidCode() {
		return validCode;
	}
	
	
	/**
	 * 获取缩略卡号
	 * @param storablePan 缩略卡号
	 */
	public void setStorablePan(String storablePan){
		this.storablePan = storablePan;
	}
	/**
	 * 获取缩略卡号
	 * @return 缩略卡号
	 */
	public String getStorablePan() {
		return storablePan;
	}
	
	
	/**
	 * 获取支付机构处理日期
	 * @param transDate 支付机构处理日期
	 */
	public void setTransDate(Integer transDate){
		this.transDate = transDate;
	}
	/**
	 * 获取支付机构处理日期
	 * @return 支付机构处理日期
	 */
	public Integer getTransDate() {
		return transDate;
	}
	
	
	/**
	 * 获取支付机构处理时间
	 * @param transTime 支付机构处理时间
	 */
	public void setTransTime(String transTime){
		this.transTime = transTime;
	}
	/**
	 * 获取支付机构处理时间
	 * @return 支付机构处理时间
	 */
	public String getTransTime() {
		return transTime;
	}
	
	
	/**
	 * 获取对账日期
	 * @param settleDate 对账日期
	 */
	public void setSettleDate(Integer settleDate){
		this.settleDate = settleDate;
	}
	/**
	 * 获取对账日期
	 * @return 对账日期
	 */
	public Integer getSettleDate() {
		return settleDate;
	}
	
	
	/**
	 * 获取交易状态
	 * @param status 交易状态
	 */
	public void setStatus(String status){
		this.status = status;
	}
	/**
	 * 获取交易状态
	 * @return 交易状态
	 */
	public String getStatus() {
		return status;
	}
	
	
	/**
	 * 获取交易返回状态
	 * @param thirdTransStatus 交易返回状态
	 */
	public void setThirdTransStatus(String thirdTransStatus){
		this.thirdTransStatus = thirdTransStatus;
	}
	/**
	 * 获取交易返回状态
	 * @return 交易返回状态
	 */
	public String getThirdTransStatus() {
		return thirdTransStatus;
	}
	
	
	/**
	 * 获取交易返回码
	 * @param returnCode 交易返回码
	 */
	public void setReturnCode(String returnCode){
		this.returnCode = returnCode;
	}
	/**
	 * 获取交易返回码
	 * @return 交易返回码
	 */
	public String getReturnCode() {
		return returnCode;
	}
	
	
	/**
	 * 获取交易返回码信息
	 * @param returnMsg 交易返回码信息
	 */
	public void setReturnMsg(String returnMsg){
		this.returnMsg = returnMsg;
	}
	/**
	 * 获取交易返回码信息
	 * @return 交易返回码信息
	 */
	public String getReturnMsg() {
		return returnMsg;
	}
	
	
	/**
	 * 获取对账状态
	 * @param balStatus 对账状态
	 */
	public void setBalStatus(String balStatus){
		this.balStatus = balStatus;
	}
	/**
	 * 获取对账状态
	 * @return 对账状态
	 */
	public String getBalStatus() {
		return balStatus;
	}
	
	
	/**
	 * 获取对账结果
	 * @param balResult 对账结果
	 */
	public void setBalResult(String balResult){
		this.balResult = balResult;
	}
	/**
	 * 获取对账结果
	 * @return 对账结果
	 */
	public String getBalResult() {
		return balResult;
	}
	
	
	/**
	 * 获取对账任务编号
	 * @param taskId 对账任务编号
	 */
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}
	/**
	 * 获取对账任务编号
	 * @return 对账任务编号
	 */
	public String getTaskId() {
		return taskId;
	}
	
	
	/**
	 * 获取客户姓名
	 * @param custName 客户姓名
	 */
	public void setCustName(String custName){
		this.custName = custName;
	}
	/**
	 * 获取客户姓名
	 * @return 客户姓名
	 */
	public String getCustName() {
		return custName;
	}
	
	
	/**
	 * 获取证件类型
	 * @param idType 证件类型
	 */
	public void setIdType(String idType){
		this.idType = idType;
	}
	/**
	 * 获取证件类型
	 * @return 证件类型
	 */
	public String getIdType() {
		return idType;
	}
	
	
	/**
	 * 获取证件号码
	 * @param idNo 证件号码
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}
	/**
	 * 获取证件号码
	 * @return 证件号码
	 */
	public String getIdNo() {
		return idNo;
	}
	
	
	/**
	 * 获取手机号码
	 * @param mobileNo 手机号码
	 */
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}
	/**
	 * 获取手机号码
	 * @return 手机号码
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	
	
	/**
	 * 获取实时交易机构代码
	 * @param realtimeThirdPartyCode 实时交易机构代码
	 */
	public void setRealtimeThirdPartyCode(String realtimeThirdPartyCode){
		this.realtimeThirdPartyCode = realtimeThirdPartyCode;
	}
	/**
	 * 获取实时交易机构代码
	 * @return 实时交易机构代码
	 */
	public String getRealtimeThirdPartyCode() {
		return realtimeThirdPartyCode;
	}
	
	
	/**
	 * 获取开户行名
	 * @param openBankName 开户行名
	 */
	public void setOpenBankName(String openBankName){
		this.openBankName = openBankName;
	}
	/**
	 * 获取开户行名
	 * @return 开户行名
	 */
	public String getOpenBankName() {
		return openBankName;
	}
	
	
	/**
	 * 获取开户行编码
	 * @param bankCode 开户行编码
	 */
	public void setBankCode(String bankCode){
		this.bankCode = bankCode;
	}
	/**
	 * 获取开户行编码
	 * @return 开户行编码
	 */
	public String getBankCode() {
		return bankCode;
	}
	
	
	/**
	 * 获取开户行省份编码
	 * @param openBankProv 开户行省份编码
	 */
	public void setOpenBankProv(String openBankProv){
		this.openBankProv = openBankProv;
	}
	/**
	 * 获取开户行省份编码
	 * @return 开户行省份编码
	 */
	public String getOpenBankProv() {
		return openBankProv;
	}
	
	
	/**
	 * 获取业务类型
	 * @param bizType 业务类型
	 */
	public void setBizType(String bizType){
		this.bizType = bizType;
	}
	/**
	 * 获取业务类型
	 * @return 业务类型
	 */
	public String getBizType() {
		return bizType;
	}
	
	
	/**
	 * 获取业务对象类型
	 * @param bizObjType 业务对象类型
	 */
	public void setBizObjType(String bizObjType){
		this.bizObjType = bizObjType;
	}
	/**
	 * 获取业务对象类型
	 * @return 业务对象类型
	 */
	public String getBizObjType() {
		return bizObjType;
	}
	
	
	/**
	 * 获取令牌信息
	 * @param token 令牌信息
	 */
	public void setToken(String token){
		this.token = token;
	}
	/**
	 * 获取令牌信息
	 * @return 令牌信息
	 */
	public String getToken() {
		return token;
	}
	
	
	/**
	 * 获取业务系统交易日期
	 * @param bussTransDate 业务系统交易日期
	 */
	public void setBussTransDate(Integer bussTransDate){
		this.bussTransDate = bussTransDate;
	}
	/**
	 * 获取业务系统交易日期
	 * @return 业务系统交易日期
	 */
	public Integer getBussTransDate() {
		return bussTransDate;
	}
	
	
	/**
	 * 获取业务系统交易流水号
	 * @param bussTransSeqno 业务系统交易流水号
	 */
	public void setBussTransSeqno(String bussTransSeqno){
		this.bussTransSeqno = bussTransSeqno;
	}
	/**
	 * 获取业务系统交易流水号
	 * @return 业务系统交易流水号
	 */
	public String getBussTransSeqno() {
		return bussTransSeqno;
	}
	
	
	/**
	 * 获取自扣明细ID
	 * @param batDetailId 自扣明细ID
	 */
	public void setBatDetailId(String batDetailId){
		this.batDetailId = batDetailId;
	}
	/**
	 * 获取自扣明细ID
	 * @return 自扣明细ID
	 */
	public String getBatDetailId() {
		return batDetailId;
	}
	
	
	/**
	 * 获取自扣批次ID
	 * @param batId 自扣批次ID
	 */
	public void setBatId(String batId){
		this.batId = batId;
	}
	/**
	 * 获取自扣批次ID
	 * @return 自扣批次ID
	 */
	public String getBatId() {
		return batId;
	}
	
	
	/**
	 * 获取通知核心标识
	 * @param notifyCtsFlag 通知核心标识
	 */
	public void setNotifyCtsFlag(String notifyCtsFlag){
		this.notifyCtsFlag = notifyCtsFlag;
	}
	/**
	 * 获取通知核心标识
	 * @return 通知核心标识
	 */
	public String getNotifyCtsFlag() {
		return notifyCtsFlag;
	}
	
	
	/**
	 * 获取交易查询次数
	 * @param queryCount 交易查询次数
	 */
	public void setQueryCount(Integer queryCount){
		this.queryCount = queryCount;
	}
	/**
	 * 获取交易查询次数
	 * @return 交易查询次数
	 */
	public Integer getQueryCount() {
		return queryCount;
	}
	
	
	/**
	 * 获取版本号
	 * @param version 版本号
	 */
	public void setVersion(Integer version){
		this.version = version;
	}
	/**
	 * 获取版本号
	 * @return 版本号
	 */
	public Integer getVersion() {
		return version;
	}
	
	
	/**
	 * 获取交易日期时间
	 * @param createDatetime 交易日期时间
	 */
	public void setCreateDatetime(Timestamp createDatetime){
		this.createDatetime = createDatetime;
	}
	/**
	 * 获取交易日期时间
	 * @return 交易日期时间
	 */
	public Timestamp getCreateDatetime() {
		return createDatetime;
	}
	
	
	/**
	 * 获取更新日期时间
	 * @param updateDatetime 更新日期时间
	 */
	public void setUpdateDatetime(Timestamp updateDatetime){
		this.updateDatetime = updateDatetime;
	}
	/**
	 * 获取更新日期时间
	 * @return 更新日期时间
	 */
	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}
	
}
