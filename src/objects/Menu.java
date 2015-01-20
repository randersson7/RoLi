package objects;

import java.util.ArrayList;
import java.util.List;

import net.slashie.libjcsi.CSIColor;
import CharacterObjects.Creature;
import CharacterObjects.Player;


public class Menu {
	List<MenuItem> menu = new ArrayList<MenuItem>();
	int[] menuPosXY = new int[2];
	

	public Menu(Creature creature) {
		addMenuItem(creature);
	}
	
	public Menu() {
		addMenuItem(new Player('Q', 20, 20, CSIColor.ATOMIC_TANGERINE));
	}
	
	public void addMenuItem(Creature creature) {
		menu.add(new MenuItem(creature));
	}
	public void removeMenuItem(MenuItem item) {
		menu.remove(menu.indexOf(item));
	}
	
	public List<MenuItem> getMenuItemList() {
		return menu;
	}
	
	
}
