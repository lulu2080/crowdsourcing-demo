/*
 * 文件名：QueryStockResponseModel.java
 * 版权：© Copyright 2012-2018 广州宝锶信息技术有限公司
 * 创建人：庞建辉
 * 创建时间：2016年5月18日 上午9:31:13
 * 修改人：
 * 修改时间：
 * 需改内容：
 * 
 */
package com.funci.demo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询资源输出<br>
 * TODO<功能详细描述><br>
 * 
 * @author  庞建辉
 * @version 1.0，2016年5月18日 上午9:31:13
 * @since   oyjt-api1.0
 */
public class QueryStockResponseModel implements Serializable {

	/** 
	 * serialVersionUID: TODO<用一句话描述这个变量表示什么>
	 */
	private static final long serialVersionUID = 1L;
	private String deptId ; //宝盈通仓库
	private String wProviderId ; //寄托仓库代码
	private String ownerId ; //货主单ID
	private String ownerName ; //货主单位名称
	private String recordCounts ; //查询结果总数
	private String packCounts ; //明细捆包记录个数
	private List<PackList> packList = new ArrayList<PackList>() ; //货物详细信息
	private String parameter1 ; //预留字段1
	private String parameter2 ; //预留字段2
	private String parameter3 ; //预留字段3
	private String parameter4 ; //预留字段4
	private String parameter5 ; //预留字段5
	
	public QueryStockResponseModel() {
		super();
	}
	public QueryStockResponseModel(String deptId, String wProviderId, String ownerId, String ownerName,
			String recordCounts, String packCounts, List<PackList> packList, String parameter1, String parameter2,
			String parameter3, String parameter4, String parameter5) {
		super();
		this.deptId = deptId;
		this.wProviderId = wProviderId;
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.recordCounts = recordCounts;
		this.packCounts = packCounts;
		this.packList = packList;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getwProviderId() {
		return wProviderId;
	}

	public void setwProviderId(String wProviderId) {
		this.wProviderId = wProviderId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRecordCounts() {
		return recordCounts;
	}

	public void setRecordCounts(String recordCounts) {
		this.recordCounts = recordCounts;
	}

	public String getPackCounts() {
		return packCounts;
	}

	public void setPackCounts(String packCounts) {
		this.packCounts = packCounts;
	}

	public List<PackList> getPackList() {
		return packList;
	}

	public void setPackList(List<PackList> packList) {
		this.packList = packList;
	}

	public String getParameter1() {
		return parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public String getParameter2() {
		return parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}




	public String getParameter3() {
		return parameter3;
	}




	public void setParameter3(String parameter3) {
		this.parameter3 = parameter3;
	}




	public String getParameter4() {
		return parameter4;
	}


	public void setParameter4(String parameter4) {
		this.parameter4 = parameter4;
	}

	public String getParameter5() {
		return parameter5;
	}

	public void setParameter5(String parameter5) {
		this.parameter5 = parameter5;
	}
	

	
}
