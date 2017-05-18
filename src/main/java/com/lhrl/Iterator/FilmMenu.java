package com.lhrl.Iterator;

public class FilmMenu implements TelevisionMenu{
	private static final int MAX_ITEMS=5; 
	private MenuItem[] menuItems;
	int numberofItems=0;
	public FilmMenu() {
		menuItems=new MenuItem[MAX_ITEMS];
		addItem(1, "�������", "���ǲ�³˹����˹���ݵ�...");
        addItem(2, "���������", "��������ϲ���ĵ�Ӱ֮һ...");
        addItem(3, "�ڿ͵۹�123", "��֪�����ܹ�������???");
        addItem(4, "�ҵ�Ů���ǻ�����", "һ���Ҳ����еľ��䰮���Ӱ...");
        addItem(5, "Ф��˵ľ���", "���ɣ��Ҹ��������ж�Զ");
	}
	@Override
	public void addItem(int channe, String name, String description) {
		MenuItem menuItem=new MenuItem(name, description, channe);
		if(numberofItems>MAX_ITEMS){
			System.out.println("������˼,�˵�����");
		}else{
			menuItems[numberofItems]=menuItem;
			numberofItems++;
		}
	}
	
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	
	
}
