
public class MenuItems {
	
	String taconame;
	String description;
	float price;
	public MenuItems(String taconame, String description, float price) {
		
		this.taconame= taconame;
		this.description = description;
		this.price = price;
		
	}
	public String getTaconame() {
		return taconame;
	}
	public void setTaconame(String taconame) {
		this.taconame = taconame;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItems [taconame=" + taconame + ", description=" + description + ", price=" + price + "]";
	} 
	
	

}
