package com.lhrl.nuomi;

import java.io.Serializable;

public class CashierTopBlock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2142296157122539313L;
	private String leftCol;
	
	private String rightCol;

	public String getLeftCol() {
		return leftCol;
	}

	public void setLeftCol(String leftCol) {
		this.leftCol = leftCol;
	}

	public String getRightCol() {
		return rightCol;
	}

	public void setRightCol(String rightCol) {
		this.rightCol = rightCol;
	}

	@Override
	public String toString() {
		return "CashierTopBlock [leftCol=" + leftCol + ", rightCol=" + rightCol
				+ "]";
	}

	
	
}
