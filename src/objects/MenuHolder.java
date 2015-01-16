package objects;
import CharacterObjects.*;
import java.util.ArrayList;
import java.util.List;


public class MenuHolder {
	List<Menu> menu = new ArrayList<Menu>();

	
	public MenuHolder() {
		
	}
	
	public void addMenu(Creature creature) {
		menu.add(new Menu(creature));
	}
	
	
	
	
	public void removeMenuItem(Menu item) {
		menu.remove(menu.indexOf(item));
	}
	
	
}