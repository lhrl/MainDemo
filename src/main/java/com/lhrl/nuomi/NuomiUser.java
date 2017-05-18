package com.lhrl.nuomi;

import java.io.Serializable;

public class NuomiUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7736405006937855545L;

	
	private String mobile;
	
	private String siteId;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	@Override
	public String toString() {
		return "NuomiUser [mobile=" + mobile + ", siteId=" + siteId + "]";
	}
	
	
}
