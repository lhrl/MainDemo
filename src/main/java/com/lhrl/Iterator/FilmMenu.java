package com.lhrl.Iterator;

public class FilmMenu implements TelevisionMenu{
	private static final int MAX_ITEMS=5; 
	private MenuItem[] menuItems;
	int numberofItems=0;
	public FilmMenu() {
		menuItems=new MenuItem[MAX_ITEMS];
		addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
	}
	@Override
	public void addItem(int channe, String name, String description) {
		MenuItem menuItem=new MenuItem(name, description, channe);
		if(numberofItems>MAX_ITEMS){
			System.out.println("不好意思,菜单已满");
		}else{
			menuItems[numberofItems]=menuItem;
			numberofItems++;
		}
	}
	
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	
	
}
