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

    //public List<int> getStats(){
    //	return Arrays.asList(HP, MP, moveRange, attackPower, attackRange, armor);
    //}
    
    public Creature() {
        inventory = new ArrayList<Item>();
    }

    void Attack(Creature target){
    	target.HP -= this.attackPower*(100/(100+target.armor));
    }
    
    
    void Move(int[] xy){
    	this.xyPos = xy;
    }
    
    public boolean isVisible() {
        return isVisible;
    }
    
    public CSIColor getColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getXPos() {
        return getXyPos()[0];
    }

    public int getYPos() {
        return getXyPos()[1];
    }

    public void MoveXPos(int deltaX){
        getXyPos()[0]+=deltaX;
    }
    
    public void MoveYPos(int deltaY){
        getXyPos()[1]+=deltaY;
    }

	public int[] getXyPos() {
		return xyPos;
	}

	public void setXyPos(int[] xyPos) {
		this.xyPos = xyPos;
	}
}
