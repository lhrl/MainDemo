package com.lhrl.proxy;

public class Boy implements GiveGift{

	private BeautifulGirl girl;
	
	
	public Boy(BeautifulGirl girl) {
		this.girl = girl;
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl.getName()+",����һ����");
	}

	@Override
	public void giveBook() {
		System.out.println(girl.getName()+",����һ����");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl.getName()+",����һ���ɿ���");
	}

}
