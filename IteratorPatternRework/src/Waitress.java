
public class Waitress {
	
	TacoMenus tacomenu;
	
	
	public Waitress(TacoMenus tacos)
	{
		this.tacomenu = tacos;
	}
	
	public void printmenus()
	{
		OwnIterator tacositerator = this.tacomenu.createIterator();
		while(tacositerator.hasnext())
		{
			MenuItems menus= (MenuItems) tacositerator.next();
			System.out.println("AVAILABE MENUS");
			System.out.println("----------------");
			System.out.println(menus.getTaconame() +"---"+ menus.getDescription() +"---"+ menus.getPrice());
			System.out.println("----------------");
		}
		
	}

}
