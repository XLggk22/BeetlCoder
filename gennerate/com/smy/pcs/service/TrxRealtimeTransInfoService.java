package com.smy.pcs.service;


import java.util.List;
import java.util.Map;
import com.smy.framework.base.IPage;

import com.smy.pcs.domain.TrxRealtimeTransInfo;

/**
 * 代收付交易流水表 Service
 * @author zhangguguang
 * @Date 20170220
 */
public interface TrxRealtimeTransInfoService {
	/** 增加 **/
	public String create(TrxRealtimeTransInfo trxRealtimeTransInfo);

	/** 修改 **/
	public void updateById(TrxRealtimeTransInfo trxRealtimeTransInfo);

	/** 删除 **/
	public void deleteById(String id);

	/** 查询翻页数据 **/
	public IPage<TrxRealtimeTransInfo> findPageList(TrxRealtimeTransInfo trxRealtimeTransInfo, int pageNo, int pageSize);

	/** 查询记录总数 **/
	public Integer findTotalNum(TrxRealtimeTransInfo trxRealtimeTransInfo);

	/** 根据id获取 **/
	public TrxRealtimeTransInfo findById(String id);

	/** 根据条件获取List **/
	public List<TrxRealtimeTransInfo> findListByMap(Map<String, Object> trxRealtimeTransInfoMap);

	/** 根据条件获取List **/
	public List<TrxRealtimeTransInfo> findListByExample(TrxRealtimeTransInfo trxRealtimeTransInfo);

	/** 根据条件获取Object**/
	public TrxRealtimeTransInfo findOneByMap(Map<String, Object> trxRealtimeTransInfoMap);

	/** 根据条件获取Object**/
	public TrxRealtimeTransInfo findOneByExample(TrxRealtimeTransInfo trxRealtimeTransInfo);
	
}
