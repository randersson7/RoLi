package objects;

import java.util.ArrayList;
import CharacterObjects.*;

public class MenuItem {
	
	private String[] creatureStats;
	private int[] xyPos;
	public MenuItem() {
		
	}
	
	public MenuItem(Creature creature){
		creatureStats = createTextView(creature);
		setXyPos(menuItemPos(creature));
	}

	private int[] menuItemPos(Creature creature) {
		
		if ( (creature instanceof Player) )
		{
			return new int[] {0, 15};
		}
		else if ( (creature instanceof Enemy) ) {
			return new int[] {60, 15};
		}
		
		else {
			return new int[0]; 
		}
				
	}
	
	private String[] createTextView(Creature creature) {
		return creature.getStats();
		            
		
	}
	
	public String[] getCreatureStats() {
		return creatureStats;
	}

	public int[] getXyPos() {
		return xyPos;
	}

	public void setXyPos(int[] xyPos) {
		this.xyPos = xyPos;
	}
	

}
