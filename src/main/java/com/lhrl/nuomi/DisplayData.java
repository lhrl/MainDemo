package com.lhrl.nuomi;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class DisplayData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4490028167423817249L;
	private List<List<CashierTopBlock>>listCashers;
	
	public List<List<CashierTopBlock>> getListCashers() {
		return listCashers;
	}
	public void setListCashers(List<List<CashierTopBlock>> listCashers) {
		this.listCashers = listCashers;
	}
	@Override
	public String toString() {
		return "DisplayData [listCashers=" + listCashers + "]";
	}

	
	
	
}
