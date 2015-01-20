package MainPackage;
import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;
import objects.MenuItem;
import objects.ObjectHandler;


import CharacterObjects.Enemy;
import CharacterObjects.Player;
import ItemObjects.ContainerItem;

/**
 * Created by randersson on 2015-01-09.
 */
public class ViewHandler {

	private WSwingConsoleInterface csi;

	public ViewHandler(){

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
		
		//csi.cls();
		
		for (int i = 0; i < objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap().length; i++) {
			for (int j = 0; j < objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap()[i].length; j++) {
				csi.print(i,j,objectHandler.getMaps().GetMap(objectHandler.getCurrentFloor()).getCurrMap()[i][j], CSIColor.WHITE);
			}
		}

		for (ContainerItem containerItem : objectHandler.getMaps().getItemCollection()) {
			csi.print(containerItem.getxPos(), containerItem.getyPos(), containerItem.getSymbol(), CSIColor.CHESTNUT);
		}

		for(Player tmpP: objectHandler.getPlayerList()){
			if(tmpP.isVisible())
				csi.print(tmpP.getXPos(), tmpP.getYPos(), tmpP.getSymbol(), tmpP.getColor());
				csi.print(9, 9, (tmpP.getXPos() + " " + tmpP.getYPos()).toString(), tmpP.getColor());
		}

		for(Enemy tmpE: objectHandler.getEnemyList()){
			if(tmpE.isVisible())
				csi.print(tmpE.getXPos(), tmpE.getYPos(), tmpE.getSymbol(), tmpE.getColor());
		}

		if(objectHandler.getCursor().isVisible())
			csi.print(objectHandler.getCursor().xPos(), objectHandler.getCursor().yPos(),
					objectHandler.getCursor().getSymbol(), CSIColor.WHITE);
		
		for(MenuItem item : objectHandler.getMenuHolder().getMenuItemList()) {
			int i = 0;
			for( String stat : item.getCreatureStats() ) {
				csi.print(item.getXyPos()[0], item.getXyPos()[1]+i, stat, CSIColor.WHITE);
				i++;
			}
		}
		csi.print(10, 10, objectHandler.getCursor().getXyPos()[0] + " " + objectHandler.getCursor().getXyPos()[1]);
		
		csi.refresh();
	}
}
