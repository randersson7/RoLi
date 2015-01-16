package CharacterObjects;

import net.slashie.libjcsi.CSIColor;

/**
 * Created by randersson on 2015-01-05.
 */
public class Player extends Creature {
    
    public Player(char sym, int x, int y, CSIColor color){
        this.symbol = sym;
        this.color = color;
        xyPos = new int[] {x,y};
        isVisible = true;
    }
}
