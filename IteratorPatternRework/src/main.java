
public class main {

	public static void main(String[] args) {
			TacoMenus menus = new TacoMenus();
			Waitress waitress = new Waitress(menus);
			waitress.printmenus();
	}
}
