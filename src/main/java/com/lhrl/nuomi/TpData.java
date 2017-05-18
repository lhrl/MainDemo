package com.lhrl.nuomi;

import java.io.Serializable;

public class TpData implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1364493460326751687L;

	private String appKey;
	
	private String tpOrderId;
	
	private String dealId;
	
	private String rsaSign;
	
	private String totalAmount;
	
	private String  payResultUrl;
	
	private ReturnData  returnData;
	
	private DisplayData displayData;
	
	private String dealTitle;
	
	private String dealSubTitle;
	
	private String dealThumbView;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getTpOrderId() {
		return tpOrderId;
	}

	public void setTpOrderId(String tpOrderId) {
		this.tpOrderId = tpOrderId;
	}

	public String getDealId() {
		return dealId;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public String getRsaSign() {
		return rsaSign;
	}

	public void setRsaSign(String rsaSign) {
		this.rsaSign = rsaSign;
	}

	

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPayResultUrl() {
		return payResultUrl;
	}

	public void setPayResultUrl(String payResultUrl) {
		this.payResultUrl = payResultUrl;
	}

	public ReturnData getReturnData() {
		return returnData;
	}

	public void setReturnData(ReturnData returnData) {
		this.returnData = returnData;
	}

	public DisplayData getDisplayData() {
		return displayData;
	}

	public void setDisplayData(DisplayData displayData) {
		this.displayData = displayData;
	}

	public String getDealTitle() {
		return dealTitle;
	}

	public void setDealTitle(String dealTitle) {
		this.dealTitle = dealTitle;
	}

	public String getDealSubTitle() {
		return dealSubTitle;
	}

	public void setDealSubTitle(String dealSubTitle) {
		this.dealSubTitle = dealSubTitle;
	}

	public String getDealThumbView() {
		return dealThumbView;
	}

	public void setDealThumbView(String dealThumbView) {
		this.dealThumbView = dealThumbView;
	}

	@Override
	public String toString() {
		return "TpData [appKey=" + appKey + ", tpOrderId=" + tpOrderId
				+ ", dealId=" + dealId + ", rsaSign=" + rsaSign
				+ ", totalAmount=" + totalAmount + ", payResultUrl="
				+ payResultUrl + ", displayData=" + displayData
				+ ", dealTitle=" + dealTitle + ", dealSubTitle=" + dealSubTitle
				+ ", dealThumbView=" + dealThumbView + "]";
	}

	
	
	
}
