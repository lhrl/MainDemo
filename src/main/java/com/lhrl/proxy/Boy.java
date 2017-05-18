package com.lhrl.proxy;

public class Boy implements GiveGift{

	private BeautifulGirl girl;
	
	
	public Boy(BeautifulGirl girl) {
		this.girl = girl;
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl.getName()+",送你一束花");
	}

	@Override
	public void giveBook() {
		System.out.println(girl.getName()+",送你一本书");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl.getName()+",送你一盒巧克力");
	}

}
