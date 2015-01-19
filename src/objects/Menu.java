package objects;

import java.util.ArrayList;
import java.util.List;
import CharacterObjects.Creature;


public class Menu {
	List<MenuItem> menu = new ArrayList<MenuItem>();
	int[] menuPosXY = new int[2];
	
	public Menu() {
		
	}
	
	public Menu(Creature creature) {
		addMenuItem(creature);
	}
	
	public void addMenuItem(Creature creature) {
		menu.add(new MenuItem(creature));
	}
	public void removeMenuItem(MenuItem item) {
		menu.remove(menu.indexOf(item));
	}
	
	
}
