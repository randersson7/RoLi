package objects;

import net.slashie.libjcsi.CSIColor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by randersson on 2015-01-05.
 */
class Creature {
    int HP = 100;
    int MP = 10;
    int attackPower = 5;

    public boolean isVisible() {
        return isVisible;
    }

    boolean isVisible;

    int xPos = 0;
    int yPos = 0;
    int zPos = 0;

    List inventory;
    char symbol;
    String background;
    CSIColor color;

    public Creature() {
        inventory = new ArrayList();
    }

    public CSIColor getColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void MoveXPos(int deltaX){
        xPos+=deltaX;
    }
    
    public void MoveYPos(int deltaY){
        yPos+=deltaY;
    }

}
