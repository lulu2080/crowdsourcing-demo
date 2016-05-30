package com.funci.demo.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.ouyeel.xplat.common.mapper.JsonMapper;

public class JsonMapperTest {
	private final static Logger logger = LoggerFactory.getLogger(JsonMapperTest.class);	
	@Test
	public void test() {
		QueryStockResponseModel qm=new QueryStockResponseModel();
		qm.setDeptId("12345");
		
		List<PackList> packList = new ArrayList<PackList>();
		PackList pl=new PackList();
		pl.setBarcode("990098");
		packList.add(pl);		
		qm.setPackList(packList);		
		
		String toJson = JsonMapper.getInstance().toJsonString(qm);
		toJson = "{\"deptId\":\"0301\",\"wProviderId\":\"\",\"ownerId\":\"KH92774\",\"ownerName\":\"上海怡百信息科技有限公司\",\"recordCounts\":\"1\",\"packCounts\":\"1\",\"packList\":[{\"goodsId\":\"db30618391e242aab4cb36fcafc26903\",\"packNum\":\"GFD74590\",\"ownerResourceNum\":\"\",\"resourceNum\":\"HJ54154\",\"inDateOwner\":\"20150624114839\",\"inDateFirst\":\"2015-06-24\",\"ownerOrderNo\":\"\",\"transportType\":\"\",\"vehicleCode\":\"\",\"kindNo\":\"PZ001001014\",\"kindName\":\"不锈钢板\",\"shopsignName\":\"MR T-4CA\",\"spec\":\"11*12*13\",\"specThick\":\"11\",\"specWidth\":\"12\",\"specLength\":\"13\",\"prodAreaId\":\"CD000019\",\"prodAreaName\":\"本钢\",\"qty\":\"2\",\"netWeight\":\"11\",\"grossWeight\":\"11\",\"singleWeight\":\"0\",\"weightType\":\"\",\"weightUnit\":\"吨\",\"quantityUnit\":\"件\",\"packLocation\":\"1\",\"floor\":\"0\",\"barcode\":\"无条码\",\"packMemo\":\"\",\"cardNum\":\"\",\"selfNo\":\"\",\"parameter1\":\"\",\"parameter2\":\"\",\"parameter3\":\"\",\"parameter4\":\"\",\"parameter5\":\"\"}],\"parameter1\":\"\",\"parameter2\":\"\",\"parameter3\":\"\",\"parameter4\":\"\",\"parameter5\":\"\"}";
		logger.info(toJson);
		QueryStockResponseModel qsm=JsonMapper.getInstance().fromJson(toJson, QueryStockResponseModel.class);
		logger.info(qsm.getDeptId());
	}

}

