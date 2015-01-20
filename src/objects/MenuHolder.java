package objects;
import CharacterObjects.*;
import java.util.ArrayList;
import java.util.List;


public class MenuHolder {
	List<Menu> menuList = new ArrayList<Menu>();
	

	
	public MenuHolder() {
		
	}
	
	public void addMenu(Creature creature) {
		menuList.add(new Menu(creature));
	}
	
	
	
	
	public void removeMenuItem(Menu item) {
		menuList.remove(menuList.indexOf(item));
	}
	
	public ArrayList<MenuItem> getMenuItemList() {
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		for( Menu menu  : menuList ) {
			menuItemList.addAll(menu.getMenuItemList());
		}
		return menuItemList;
	}
	
	
	
}