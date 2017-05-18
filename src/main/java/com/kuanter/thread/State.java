package com.kuanter.thread;

public enum State implements BaseState {

	ASKPRICE
	{
		@Override
		public void askprice() {
			System.out.println("ִ��askprice");
		}

		@Override
		public void say() {
			System.out.println("�ҵ�״̬��askprice");
		}
		
	},PAID{
		@Override
		public void paid() {
			System.out.println("ִ��paid");
		}

		@Override
		public void say() {
			System.out.println("�ҵ�״̬��paid");
		}
	},
	END{
		@Override
		public void end() {
			System.out.println("ִ��end");
		}

		@Override
		public void say() {
			System.out.println("�ҵ�״̬��end");
		}
	};
	
	public void askprice(){
		throw new RuntimeException("error state");
	}
	
	public void paid(){
		throw new RuntimeException("error state");
	}
	
	public void end(){
		throw new RuntimeException("error state");
	}
	
	public static void main(String[] args) {
		State.ASKPRICE.askprice();
		State.END.say();
	}
}
