package com.smy.pcs.oms.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smy.framework.base.IPage;
import com.smy.framework.core.exception.ServiceException;
import com.smy.pcs.domain.TrxRealtimeTransInfo;
import com.smy.pcs.oms.common.JsonPage;
import com.smy.pcs.oms.common.SuperWebController;
import com.smy.pcs.service.TrxRealtimeTransInfoService;

/**
 * 
 * @author 
 *
 */
@Controller
@RequestMapping("/trxRealtimeTransInfo/")
public class TrxRealtimeTransInfoController extends SuperWebController{
	
	@Autowired
	private TrxRealtimeTransInfoService trxRealtimeTransInfoService;

	
	/**
	 * 列表界面
	 * @return
	 */
	@RequestMapping("list")
	public String list(){
		return "trxRealtimeTransInfo/trxRealtimeTransInfoList";
	}
	
	/**
	 * 添加界面
	 * @return
	 */
	@RequestMapping("add")
	public String add(){
		return "trxRealtimeTransInfo/trxRealtimeTransInfoAdd";
	}
	
	/**
	 * 修改界面
	 * @param trxRealtimeTransInfo
	 * @return
	 */
	@RequestMapping("edit")
	public ModelAndView edit(TrxRealtimeTransInfo trxRealtimeTransInfo){
		ModelAndView model = new ModelAndView();
		try{
			//根据主键获取实时交易对象
			TrxRealtimeTransInfo info = trxRealtimeTransInfoService.findById(trxRealtimeTransInfo.getId());
			model.addObject("info", info);
		} catch (Exception e) {
			model.addObject("message", e.getMessage());
		}
		model.setViewName("trxRealtimeTransInfo/trxRealtimeTransInfoEdit");
		return model;
	}

	/**
	 * 分页查询
	 * @param trxRealtimeTransInfo
	 * @return
	 */
	@RequestMapping("queryList")
	@ResponseBody
	public Object queryList(TrxRealtimeTransInfo trxRealtimeTransInfo){
	    //打印日志
		formatLog(formatObj(trxRealtimeTransInfo));
		//页码
		String pageNo = request.getParameter("page");
		if(StringUtils.isBlank(pageNo)){
			pageNo = "1";
		}
		//每页条数
		String pageSize=request.getParameter("rows");
		if(StringUtils.isBlank(pageSize)){
			pageSize = "20";
		}
		IPage<TrxRealtimeTransInfo> page = trxRealtimeTransInfoService.findPageList(trxRealtimeTransInfo, Integer.valueOf(pageNo), Integer.valueOf(pageSize));
		JsonPage<TrxRealtimeTransInfo> jsonPage=new JsonPage<TrxRealtimeTransInfo>();
		jsonPage.setTotal(page.getTotalRecordCount());
		jsonPage.setRows(page.getData());
		return jsonPage;
	}

	/**
	 * 新增、更新数据
	 * @param trxRealtimeTransInfo
	 * @return
	 */
	@RequestMapping(value="save", method = RequestMethod.POST)
	@ResponseBody
	public Object save(TrxRealtimeTransInfo trxRealtimeTransInfo){
	    //打印日志
		formatLog(formatObj(trxRealtimeTransInfo));
		try {
		    Object opFaild = opFaild("存在同一个发卡机构，同一卡片类型，同一验卡机构、同一优先级的记录!");
		    
            if(StringUtils.isBlank(trxRealtimeTransInfo.getId())){
			    //新增记录
				trxRealtimeTransInfo.setId(Strings.getUUID());
				trxRealtimeTransInfoService.create(trxRealtimeTransInfo);
			}else{
			    //修改记录
				trxRealtimeTransInfoService.updateById(trxRealtimeTransInfo);
			}
			return opSuccess();
		}
		catch(ServiceException e){
			return opFaild(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			return opSuccess();
		}
	}

	/**
	 * 删除操作
	 * @param trxRealtimeTransInfo
	 * @return
	 */
	@RequestMapping("deleteAc")
	@ResponseBody
	public Object deleteAc(TrxRealtimeTransInfo trxRealtimeTransInfo){
	    //打印日志
		formatLog(formatObj(trxRealtimeTransInfo));
		try {
			trxRealtimeTransInfoService.deleteById(trxRealtimeTransInfo.getId());
			return opSuccess();
		}
		catch(ServiceException e){
			return opFaild(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			return opFaild();
		}
	}
}
