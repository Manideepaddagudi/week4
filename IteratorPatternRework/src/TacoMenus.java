import java.util.ArrayList;

public class TacoMenus {
	
	MenuItems[] menulist = new MenuItems[6];
	
	int numberofItems=0;
	
	public TacoMenus(){
		additems("VeggieTacos","Added with Veggie Topping Sauce",10);
		additems("Cheese","Add with Cheese Topping Sauce",20);
	}

	
	public void additems(String taconame, String description, float price)
	{
		MenuItems menu = new MenuItems(taconame,description,price);
		menulist[numberofItems]= menu;
		numberofItems = numberofItems+1;
	}

	
	public OwnIterator createIterator() {
		return new TacoMenuIterator(menulist);
		
	}
	

}
