package com.kuanter.thread;

public enum State implements BaseState {

	ASKPRICE
	{
		@Override
		public void askprice() {
			System.out.println("执行askprice");
		}

		@Override
		public void say() {
			System.out.println("我的状态是askprice");
		}
		
	},PAID{
		@Override
		public void paid() {
			System.out.println("执行paid");
		}

		@Override
		public void say() {
			System.out.println("我的状态是paid");
		}
	},
	END{
		@Override
		public void end() {
			System.out.println("执行end");
		}

		@Override
		public void say() {
			System.out.println("我的状态是end");
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
