package com.lhrl.jdk;

public enum Color implements Icolor{

	RED{
		private int age=10;
		public  String getName() {
			return "��ɫ";
		}
		
		public void sayHello(){
			System.out.println("hello");
		}

		@Override
		public void getColorName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	
	BLACK{ String getName() {
		return "��ɫ";
	}

	@Override
	public void getColorName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}},
	
	GREEN{
		public String getName() {
			return "��ɫ";
		}

		@Override
		public void getColorName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	
	YELLOW{

		public void getColorName() {
			System.out.println("dasds");
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
		
		
	},
	BLUE{
		public String getName() {
			return "��ɫ";
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
	
	public abstract void test();
	
}
