package CharacterObjects;

import net.slashie.libjcsi.CSIColor;

/**
 * Created by randersson on 2015-01-07.
 */
public class Enemy extends Creature {
    public Enemy(int backgroundIndex){
        setBackground(backgroundIndex);
        isVisible = true;
    }

    void setBackground(int bgIndex){

        if(bgIndex==0){
            background = "Goblin";
            setStats(100, 0, 5, CSIColor.BRONZE);
        }
        else if(bgIndex == 1){
            background = "Ogre";
            setStats(300, 0, 10, CSIColor.AMBER);
        }
    }

    void setStats(int hp, int mp, int attackPower, CSIColor color1){
        HP=hp;
        MP=mp;
        color=color1;
    }
    
    public void Attack(){
    	
    }
    public void Move(){
    	
    }
}
