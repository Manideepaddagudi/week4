import java.awt.MenuItem;

public class TacoMenuIterator implements OwnIterator {
	MenuItems [] items;
	
	int position = 0;
	
	
	
	public  TacoMenuIterator(MenuItems [] items) {
		this.items = items;
	}
	

	@Override
	public boolean hasnext() {
		if(position >= items.length || items[position]== null ) {
			return false;
		}else{
			return true;
		}
		
	}

	@Override
	public Object next() {
		MenuItems menu  = items[position];
		position = position +1;
		return menu;
	}

}
