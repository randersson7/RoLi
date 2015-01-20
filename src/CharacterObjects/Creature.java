package CharacterObjects;

import net.slashie.libjcsi.CSIColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ItemObjects.Item;

/**
 * Created by randersson on 2015-01-05.
 */
public abstract class Creature {
    protected int HP = 100;
    protected int MP = 10;
    protected int moveRange = 3;
    protected int attackRange = 1;
    protected int attackPower = 5;
    protected int armor = 5;
    protected boolean isVisible;
    protected int[] xyPos = new int[2];
    protected List<Item> inventory;
    protected char symbol;
    protected String background;
    protected CSIColor color;
    
    private ArrayList<Integer> stats = new ArrayList<>();
    public ArrayList<Integer> getStats(){
    	stats.add(HP);
    	stats.add(MP);
    	stats.add(moveRange);
    	stats.add(attackPower);
    	stats.add(armor);
    	return stats;
    }
    
    /**
     * Constructor
     */
    public Creature() {
        inventory = new ArrayList<Item>();
    }

    /**
     * @param target Target to be attacked;
     * 
     */
    boolean Attack(Creature target){
    	//Hit Chance
    	if(Math.random()<100/(100+target.armor)){
    		//Damage
    		target.HP -= this.attackPower*(100/(100+target.armor));
    		return true;
    	}
    	return false;
    }
    
    
    /**
     * @param xy new position
     */
    public boolean Move(int[] xy){
    	if((xyPos[0]-xy[0])+(xyPos[1]-xy[1])<=moveRange){
    		xyPos = xy;
    		return true;
    	}
    	return false;
    	
    }
    
    /**
     * @return check if object is visible.
     */
    public boolean isVisible() {
        return isVisible;
    }
    
    /**
     * @return Color of objects
     */
    public CSIColor getColor() {
        return color;
    }

    /**
     * @return get object symbol character.
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * @return The first position parameter on the x-axis.
     */
    public int getXPos() {
        return getXyPos()[0];
    }

    /**
     * @return The second position parameter on the y-axis. 
     */
    public int getYPos() {
        return getXyPos()[1];
    }

    /**
     * @param deltaX amount to move object on x-axis.
     */
    public void MoveXPos(int deltaX){
        getXyPos()[0]+=deltaX;
    }
    
    /**
     * @param deltaY amount to move object on y-axis.
     */
    public void MoveYPos(int deltaY){
        getXyPos()[1]+=deltaY;
    }

	/**
	 * @return get x and y coordinates as an array.
	 */
	public int[] getXyPos() {
		return xyPos;
	}

	/**
	 * @param xyPos set new x and y coordinates as an array.
	 */
	public void setXyPos(int[] xyPos) {
		this.xyPos = xyPos;
	}
}
