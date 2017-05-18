package com.lhrl.proxy;

public class HerChum implements GiveGift{

	private Boy boy;
	
	public HerChum(BeautifulGirl girl) {
		boy=new Boy(girl);
	}
	@Override
	public void giveFlowers() {
		boy.giveFlowers();
	}

	@Override
	public void giveBook() {
		boy.giveBook();
	}

	@Override
	public void giveChocolate() {
		boy.giveChocolate();
	}

}
