import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;
import objects.Enemy;
import objects.ObjectHandler;
import objects.Player;

import java.util.Properties;

/**
 * Created by randersson on 2015-01-09.
 */
public class ViewHandler {

    private WSwingConsoleInterface csi;

    public ViewHandler(){
        Properties text = new Properties();
        text.setProperty("fontSize", "20");
        text.setProperty("font", "Courier");

        try{
            csi = new WSwingConsoleInterface("My little Java Roguelike", true);
        }
        catch (ExceptionInInitializerError ex){
            System.out.println("*** Error: Swing Console box cannot be initialized ***");
            ex.printStackTrace();
            System.exit(-1);
        }
    }

    public CharKey inKey(){
        return csi.inkey();
    }

    void DrawStuff(ObjectHandler objectHandler){
        csi.cls();
        for (int i = 0; i < objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap().length; i++) {
            for (int j = 0; j < objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap()[i].length; j++) {
                csi.print(i,j,objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap()[i][j], CSIColor.WHITE);
            }
        }
        for(Player tmpP: objectHandler.getPlayerList()){
            if(tmpP.isVisible())
                csi.print(tmpP.getXPos(), tmpP.getYPos(), tmpP.getSymbol(), tmpP.getColor());
        }

        for(Enemy tmpE: objectHandler.getEnemyList()){
            if(tmpE.isVisible())
                csi.print(tmpE.getXPos(), tmpE.getYPos(), tmpE.getSymbol(), tmpE.getColor());
        }

        csi.print(objectHandler.getCursor().getXPos(), objectHandler.getCursor().getYPos(),
                objectHandler.getCursor().getSymbol(), CSIColor.WHITE);
        csi.refresh();
    }
}
