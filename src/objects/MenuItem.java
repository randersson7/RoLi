package objects;

import java.util.ArrayList;




import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import sun.security.jca.GetInstance.Instance;
import CharacterObjects.*;

public class MenuItem {
	
	private String creatureStats;
	private int[] xyPos;
	public MenuItem() {
		
	}
	
	public MenuItem(Creature creature){
		creatureStats = createTextView(creature);
		xyPos = menuItemPos(creature);
	}

	private int[] menuItemPos(Creature creature) {
		
		if ( (creature instanceof Player) )
		{
			return new int[] {0, 15};
		}
		else if ( (creature instanceof Enemy) ) {
			return new int[] {60, 15};
		}
		else return new int[0]; 
				
	}
	
	private String createTextView(Creature creature) {
		
		ArrayList<Integer> stats =  creature.getStats();
		
		String array[] = new String[stats.size()];              
		for(int j =0;j<stats.size();j++){
		  array[j] = stats.get(j).toString() + '\n';
		}
		
		return array.toString();
		
	}
	
	public String getCreatureStats() {
		return creatureStats;
	}
	

}
