package CharacterObjects;

import net.slashie.libjcsi.CSIColor;

import java.util.ArrayList;
import java.util.List;

import ItemObjects.Item;

/**
 * Created by randersson on 2015-01-05.
 */
abstract class Creature {
    protected int HP = 100;
    protected int MP = 10;
    protected int attackPower = 5;
    protected boolean isVisible;
    protected int[] xyPos = new int[2];
    protected List<Item> inventory;
    protected char symbol;
    protected String background;
    protected CSIColor color;

    public Creature() {
        inventory = new ArrayList<Item>();
    }

    abstract void Attack();
    abstract void Move();
    
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
