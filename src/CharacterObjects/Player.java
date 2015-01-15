package CharacterObjects;

import net.slashie.libjcsi.CSIColor;

/**
 * Created by randersson on 2015-01-05.
 */
public class Player extends Creature {
    int HP = 100;
    public Player(char sym, int x, int y, CSIColor color){
        this.symbol = sym;
        this.color = color;
        xPos=x;
        yPos=y;
        isVisible = true;
    }
}
