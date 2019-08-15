package com.smy.pcs.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import com.smy.pcs.dao.TrxRealtimeTransInfoDao;
import com.smy.pcs.domain.TrxRealtimeTransInfo;
import com.smy.pcs.domain.TrxRealtimeTransInfoCriteria;
import com.smy.pcs.domain.TrxRealtimeTransInfoCriteria.Criteria;
import com.smy.pcs.enums.TableIdCode;
import com.smy.pcs.service.TrxRealtimeTransInfoService;
import com.smy.framework.core.exception.CommonErrorCode;
import com.smy.framework.core.exception.ServiceException;
import com.smy.framework.core.util.SequenceUtil;
import org.springframework.util.StringUtils;
import com.smy.framework.base.IPage;
import com.smy.framework.core.page.PageHelper;

/**
 * 代收付交易流水表 ServiceImpl
 * @author zhangguoguang
 *
 */
@Service
public class TrxRealtimeTransInfoServiceImpl implements TrxRealtimeTransInfoService {
	@Resource
	private TrxRealtimeTransInfoDao trxRealtimeTransInfoDao;

	@Override
	public String create(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		if(StringUtils.isEmpty(trxRealtimeTransInfo.getId())){
			String id = SequenceUtil.getId(TableIdCode.ID_trx_realtime_trans_info);
			trxRealtimeTransInfo.setId(id);
		}	
		trxRealtimeTransInfo.setCreateDatetime(new Date());
		try {
			trxRealtimeTransInfoDao.insertSelective(trxRealtimeTransInfo);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_INSERT, e, new String[] { "代收付交易流水表" });
		}
		return id;
	}

	@Override
	public void updateById(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		if(StringUtils.isEmpty(trxRealtimeTransInfo.getId())){
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "ID" });
		}
		trxRealtimeTransInfo.setUpdateDatetime(new Date());
		try {
			trxRealtimeTransInfoDao.updateByPrimaryKeySelective( trxRealtimeTransInfo);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_UPDATE, e, new String[] { "TrxRealtimeTransInfo" }, "更新失败, ID：" + trxRealtimeTransInfo.getId());
		}
	}

	@Override
	public void deleteById(String id) {
		if(StringUtils.isEmpty(id)){
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "ID" });
		}
		try {
			trxRealtimeTransInfoDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_UPDATE, e, new String[] { "TrxRealtimeTransInfo" }, "删除失败, ID：" + id);
		}
	}

	@Override
	public IPage<TrxRealtimeTransInfo> findPageList(TrxRealtimeTransInfo trxRealtimeTransInfo, int pageNo, int pageSize) {
	
		if (null ==  trxRealtimeTransInfo) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		
		TrxRealtimeTransInfoCriteria criteria = this.createCriteria(trxRealtimeTransInfo);
		int count = trxRealtimeTransInfoDao.countByCriteria(criteria);
		PageHelper<TrxRealtimeTransInfo> helper = new PageHelper<TrxRealtimeTransInfo>(pageNo,pageSize,count);
		criteria.setLimitStart(helper.getCurrentPageFirstElementNo());
		criteria.setPageSize(pageSize);
		criteria.setOrderByClause("");
		List<TrxRealtimeTransInfo> list = null;
		
		try {
			list = trxRealtimeTransInfoDao.selectByCriteria(criteria);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "查询TrxRealtimeTransInfo List 失败 ");
		}
		
		return helper.buildPageEntity(list);
	}

	@Override
	public Integer findTotalNum(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		if (null == trxRealtimeTransInfo) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		try {
			TrxRealtimeTransInfoCriteria criteria = this.createCriteria(trxRealtimeTransInfo);
			return trxRealtimeTransInfoDao.countByCriteria(criteria);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo" }, "findTotalNum失败 ");
		}
	}

	@Override
	public TrxRealtimeTransInfo findById(String id) {
		if(StringUtils.isEmpty(id)){
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "ID" });
		}
		try {
			return trxRealtimeTransInfoDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "findById失败,ID：" + id );
		}
		
	}

	@Override
	public List<TrxRealtimeTransInfo> findListByMap(Map<String, Object> paramMap) {
		if (null == paramMap || paramMap.isEmpty()) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		
		TrxRealtimeTransInfoCriteria criteria = this.createCriteria(paramMap);
		
		try {
			return	trxRealtimeTransInfoDao.selectByCriteria(criteria);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "findListByMap查询失败 ");
		}
	}

	@Override
	public List<TrxRealtimeTransInfo> findListByExample(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		if (null ==  trxRealtimeTransInfo) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		
		TrxRealtimeTransInfoCriteria criteria = this.createCriteria(trxRealtimeTransInfo);
		
		try {
			return	trxRealtimeTransInfoDao.selectByCriteria(criteria);
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "findListByExample查询失败 ");
		}
	}

	@Override
	public TrxRealtimeTransInfo findOneByMap(Map<String, Object> param) {
		if (null == param || param.isEmpty()) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		TrxRealtimeTransInfoCriteria criteria = this.createCriteria(param);
		try {	
			List<TrxRealtimeTransInfo> trxRealtimeTransInfoList = trxRealtimeTransInfoDao.selectByCriteria(criteria);
			if (CollectionUtils.isNotEmpty(trxRealtimeTransInfoList)) {
				trxRealtimeTransInfoList.get(0);
			}
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "findOneByMap查询失败 ");
		}

		return null;
	}

	@Override
	public TrxRealtimeTransInfo findOneByExample(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		if (null ==  trxRealtimeTransInfo) {
			throw new ServiceException(CommonErrorCode.NULL_PROPERTIES, new String[] { "请求对象" });
		}
		try {	
			TrxRealtimeTransInfoCriteria criteria = this.createCriteria(trxRealtimeTransInfo);
			List<TrxRealtimeTransInfo> trxRealtimeTransInfoList = trxRealtimeTransInfoDao.selectByCriteria(criteria);
			if (CollectionUtils.isNotEmpty(trxRealtimeTransInfoList)) {
				return trxRealtimeTransInfoList.get(0);
			}
		} catch (Exception e) {
			throw new ServiceException(CommonErrorCode.ERROR_TABLE_QUERY, e, new String[] { "TrxRealtimeTransInfo"  }, "findOneByExample查询失败 ");
		}
		
		return null;
	}


	private TrxRealtimeTransInfoCriteria createCriteria(TrxRealtimeTransInfo trxRealtimeTransInfo) {
		TrxRealtimeTransInfoCriteria criteria = new TrxRealtimeTransInfoCriteria();
		Criteria c = criteria.createCriteria();
		if (trxRealtimeTransInfo != null) {
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransSeqno())){
				c.andTransSeqnoEqualTo(trxRealtimeTransInfo.getTransSeqno());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getOrgTransSeqno())){
				c.andOrgTransSeqnoEqualTo(trxRealtimeTransInfo.getOrgTransSeqno());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getCustNo())){
				c.andCustNoEqualTo(trxRealtimeTransInfo.getCustNo());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBankCardNo())){
				c.andBankCardNoEqualTo(trxRealtimeTransInfo.getBankCardNo());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBankCardType())){
				c.andBankCardTypeEqualTo(trxRealtimeTransInfo.getBankCardType());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getCurrency())){
				c.andCurrencyEqualTo(trxRealtimeTransInfo.getCurrency());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransAmt())){
				c.andTransAmtEqualTo(trxRealtimeTransInfo.getTransAmt());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransType())){
				c.andTransTypeEqualTo(trxRealtimeTransInfo.getTransType());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransFrom())){
				c.andTransFromEqualTo(trxRealtimeTransInfo.getTransFrom());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransDesc())){
				c.andTransDescEqualTo(trxRealtimeTransInfo.getTransDesc());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getRemark())){
				c.andRemarkEqualTo(trxRealtimeTransInfo.getRemark());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getValidCode())){
				c.andValidCodeEqualTo(trxRealtimeTransInfo.getValidCode());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getStorablePan())){
				c.andStorablePanEqualTo(trxRealtimeTransInfo.getStorablePan());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransDate())){
				c.andTransDateEqualTo(trxRealtimeTransInfo.getTransDate());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTransTime())){
				c.andTransTimeEqualTo(trxRealtimeTransInfo.getTransTime());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getSettleDate())){
				c.andSettleDateEqualTo(trxRealtimeTransInfo.getSettleDate());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getStatus())){
				c.andStatusEqualTo(trxRealtimeTransInfo.getStatus());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getThirdTransStatus())){
				c.andThirdTransStatusEqualTo(trxRealtimeTransInfo.getThirdTransStatus());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getReturnCode())){
				c.andReturnCodeEqualTo(trxRealtimeTransInfo.getReturnCode());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getReturnMsg())){
				c.andReturnMsgEqualTo(trxRealtimeTransInfo.getReturnMsg());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBalStatus())){
				c.andBalStatusEqualTo(trxRealtimeTransInfo.getBalStatus());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBalResult())){
				c.andBalResultEqualTo(trxRealtimeTransInfo.getBalResult());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getTaskId())){
				c.andTaskIdEqualTo(trxRealtimeTransInfo.getTaskId());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getCustName())){
				c.andCustNameEqualTo(trxRealtimeTransInfo.getCustName());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getIdType())){
				c.andIdTypeEqualTo(trxRealtimeTransInfo.getIdType());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getIdNo())){
				c.andIdNoEqualTo(trxRealtimeTransInfo.getIdNo());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getMobileNo())){
				c.andMobileNoEqualTo(trxRealtimeTransInfo.getMobileNo());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getRealtimeThirdPartyCode())){
				c.andRealtimeThirdPartyCodeEqualTo(trxRealtimeTransInfo.getRealtimeThirdPartyCode());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getOpenBankName())){
				c.andOpenBankNameEqualTo(trxRealtimeTransInfo.getOpenBankName());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBankCode())){
				c.andBankCodeEqualTo(trxRealtimeTransInfo.getBankCode());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getOpenBankProv())){
				c.andOpenBankProvEqualTo(trxRealtimeTransInfo.getOpenBankProv());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBizType())){
				c.andBizTypeEqualTo(trxRealtimeTransInfo.getBizType());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBizObjType())){
				c.andBizObjTypeEqualTo(trxRealtimeTransInfo.getBizObjType());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getToken())){
				c.andTokenEqualTo(trxRealtimeTransInfo.getToken());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBussTransDate())){
				c.andBussTransDateEqualTo(trxRealtimeTransInfo.getBussTransDate());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBussTransSeqno())){
				c.andBussTransSeqnoEqualTo(trxRealtimeTransInfo.getBussTransSeqno());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBatDetailId())){
				c.andBatDetailIdEqualTo(trxRealtimeTransInfo.getBatDetailId());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getBatId())){
				c.andBatIdEqualTo(trxRealtimeTransInfo.getBatId());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getNotifyCtsFlag())){
				c.andNotifyCtsFlagEqualTo(trxRealtimeTransInfo.getNotifyCtsFlag());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getQueryCount())){
				c.andQueryCountEqualTo(trxRealtimeTransInfo.getQueryCount());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getVersion())){
				c.andVersionEqualTo(trxRealtimeTransInfo.getVersion());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getCreateDatetime())){
				c.andCreateDatetimeEqualTo(trxRealtimeTransInfo.getCreateDatetime());
			}
			if(!StringUtils.isEmpty(trxRealtimeTransInfo.getUpdateDatetime())){
				c.andUpdateDatetimeEqualTo(trxRealtimeTransInfo.getUpdateDatetime());
			}
		}
		return criteria;
	}


	private TrxRealtimeTransInfoCriteria createCriteria(Map<String, Object> paramMap) {
		TrxRealtimeTransInfoCriteria criteria = new TrxRealtimeTransInfoCriteria();
		Criteria c = criteria.createCriteria();
		if (paramMap != null) {
			if (!StringUtils.isEmpty(paramMap.get("id"))) {
				c.andIdEqualTo((String) paramMap.get("id"));
			}
			if (!StringUtils.isEmpty(paramMap.get("order"))) {
				criteria.setOrderByClause((String) paramMap.get("order"));
			}
		}
		return criteria;
	}
}
