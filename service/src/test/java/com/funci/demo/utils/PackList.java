package com.funci.demo.utils;

import java.io.Serializable;

public class PackList implements Serializable{
	
	private static final long serialVersionUID = 2691563208940990647L;
	private String goodsId ; //货物主键
	private String packNum ; //捆包号
	private String ownerResourceNum ; //货主资源号
	private String resourceNum ; //钢厂资源号
	private String inDateOwner ; //客户入库日期
	private String inDateFirst ; //首入库日期
	private String ownerOrderNo ; //客户指令单号    计划号、码单号等
	private String transportType ; //运输方式   	10：汽运；20：水（船）运；30：铁运；
	private String vehicleCode ; //车船号			可多填，分号（;）隔开
	private String kindNo ; //品名代码
	private String kindName ; //品名名称
	private String shopsignName ; //材质
	private String spec ; //规格
	private String specThick ; //规格厚
	private String specWidth ; //规格宽
	private String specLength ; //规格长
	private String prodAreaId ; //产地代码
	private String prodAreaName ; //产地名称
	private String qty ; //件数
	private String netWeight ; //净重
	private String grossWeight ; //毛重
	private String singleWeight ; //单件重量
	private String weightType ; //计重方式		磅计、理计等
	private String weightUnit ; //重量单位
	private String quantityUnit ; //数量单位
	private String packLocation ; //库位
	private String floor ; //层号
	private String barcode ; //条形码
	private String packMemo ; //备注
	private String cardNum ; //卡号
	private String selfNo ; //自编号
	private String parameter1 ; //预留字段1
	private String parameter2 ; //预留字段2
	private String parameter3 ; //预留字段3
	private String parameter4 ; //预留字段4
	private String parameter5 ; //预留字段5
	
	public PackList() {
	}

	public PackList(String goodsId, String packNum, String ownerResourceNum, String resourceNum, String inDateOwner,
			String inDateFirst, String ownerOrderNo, String transportType, String vehicleCode, String kindNo,
			String kindName, String shopsignName, String spec, String specThick, String specWidth,
			String specLength, String prodAreaId, String prodAreaName, String qty, String netWeight,
			String grossWeight, String singleWeight, String weightType, String weightUnit, String quantityUnit,
			String packLocation, String floor, String barcode, String packMemo, String cardNum, String selfNo,
			String parameter1, String parameter2, String parameter3, String parameter4, String parameter5) {
		super();
		this.goodsId = goodsId;
		this.packNum = packNum;
		this.ownerResourceNum = ownerResourceNum;
		this.resourceNum = resourceNum;
		this.inDateOwner = inDateOwner;
		this.inDateFirst = inDateFirst;
		this.ownerOrderNo = ownerOrderNo;
		this.transportType = transportType;
		this.vehicleCode = vehicleCode;
		this.kindNo = kindNo;
		this.kindName = kindName;
		this.shopsignName = shopsignName;
		this.spec = spec;
		this.specThick = specThick;
		this.specWidth = specWidth;
		this.specLength = specLength;
		this.prodAreaId = prodAreaId;
		this.prodAreaName = prodAreaName;
		this.qty = qty;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		this.singleWeight = singleWeight;
		this.weightType = weightType;
		this.weightUnit = weightUnit;
		this.quantityUnit = quantityUnit;
		this.packLocation = packLocation;
		this.floor = floor;
		this.barcode = barcode;
		this.packMemo = packMemo;
		this.cardNum = cardNum;
		this.selfNo = selfNo;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getPackNum() {
		return packNum;
	}

	public void setPackNum(String packNum) {
		this.packNum = packNum;
	}

	public String getOwnerResourceNum() {
		return ownerResourceNum;
	}

	public void setOwnerResourceNum(String ownerResourceNum) {
		this.ownerResourceNum = ownerResourceNum;
	}

	public String getResourceNum() {
		return resourceNum;
	}

	public void setResourceNum(String resourceNum) {
		this.resourceNum = resourceNum;
	}

	public String getInDateOwner() {
		return inDateOwner;
	}

	public void setInDateOwner(String inDateOwner) {
		this.inDateOwner = inDateOwner;
	}

	public String getInDateFirst() {
		return inDateFirst;
	}

	public void setInDateFirst(String inDateFirst) {
		this.inDateFirst = inDateFirst;
	}

	public String getOwnerOrderNo() {
		return ownerOrderNo;
	}

	public void setOwnerOrderNo(String ownerOrderNo) {
		this.ownerOrderNo = ownerOrderNo;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public String getKindNo() {
		return kindNo;
	}

	public void setKindNo(String kindNo) {
		this.kindNo = kindNo;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getShopsignName() {
		return shopsignName;
	}

	public void setShopsignName(String shopsignName) {
		this.shopsignName = shopsignName;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSpecThick() {
		return specThick;
	}

	public void setSpecThick(String specThick) {
		this.specThick = specThick;
	}

	public String getSpecWidth() {
		return specWidth;
	}

	public void setSpecWidth(String specWidth) {
		this.specWidth = specWidth;
	}

	public String getSpecLength() {
		return specLength;
	}

	public void setSpecLength(String specLength) {
		this.specLength = specLength;
	}

	public String getProdAreaId() {
		return prodAreaId;
	}

	public void setProdAreaId(String prodAreaId) {
		this.prodAreaId = prodAreaId;
	}

	public String getProdAreaName() {
		return prodAreaName;
	}

	public void setProdAreaName(String prodAreaName) {
		this.prodAreaName = prodAreaName;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}

	public String getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getSingleWeight() {
		return singleWeight;
	}

	public void setSingleWeight(String singleWeight) {
		this.singleWeight = singleWeight;
	}

	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public String getPackLocation() {
		return packLocation;
	}

	public void setPackLocation(String packLocation) {
		this.packLocation = packLocation;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getPackMemo() {
		return packMemo;
	}

	public void setPackMemo(String packMemo) {
		this.packMemo = packMemo;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getSelfNo() {
		return selfNo;
	}

	public void setSelfNo(String selfNo) {
		this.selfNo = selfNo;
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
