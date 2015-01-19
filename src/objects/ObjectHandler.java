package objects;


import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;

import java.util.ArrayList;



import CharacterObjects.Creature;
import CharacterObjects.Cursor;
import CharacterObjects.Enemy;
import CharacterObjects.Player;
import EnvironmentObjects.RogueMap;


/**
 * Created by randersson on 2015-01-09.
 */
public class ObjectHandler{
    private ArrayList<Player> playerList;
    private ArrayList<Enemy> enemyList;

    private RogueMap Maps;

    private Cursor cursor;
    private int currentFloor = 0;
    private MenuHolder menuHolder;
    private Creature selectedCreature;
    
    public ObjectHandler() {
    	menuHolder = new MenuHolder();
        Maps = new RogueMap();

        playerList = new ArrayList<Player>();
        int[] spawnPoint = Maps.GetMap(currentFloor).getSpawnPoint();
        playerList.add(new Player('@', spawnPoint[0]+playerList.size(), spawnPoint[1]+1, CSIColor.WHITE));
        playerList.add(new Player('@', spawnPoint[0]+playerList.size(), spawnPoint[1]+1, CSIColor.AMARANTH));

        enemyList = new ArrayList<Enemy>();
        cursor = new Cursor(spawnPoint[0]+1, spawnPoint[1]);
        
    }
    
    public void cursorSelect(int[] xyPos){
    	for (Enemy enemy : enemyList) {
			if(enemy.getXyPos() == xyPos){
				menuHolder.addMenu(enemy);
				selectedCreature = enemy;
				return;
			}
		}
    	
    	for (Player player : playerList) {
			if(player.getXyPos() == xyPos){
				menuHolder.addMenu(player);
				selectedCreature = player;
				return;
			}
		}
    	
    	selectedCreature = null;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public RogueMap getMaps() {
        return Maps;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public boolean Controller(CharKey dir){
    	Move(dir);
        if(dir.code == CharKey.ENTER){
            cursorSelect(cursor.getXyPos());
        }
        else if(dir.code == CharKey.I){
            //tbd
        }
        else if(dir.code == CharKey.Q){
            //Quit
            return true;
        }
        return false;
    }
    
    void Move(CharKey dir){
        if(dir.isUpArrow() || dir.code==CharKey.k && (cursor.yPos()-1>=0)){
            if(Maps.FreeSquare(cursor.xPos(), cursor.yPos()-1, currentFloor))
                cursor.DeltaY(-1);
        }
        else if(dir.isDownArrow() || dir.code==CharKey.j && (cursor.yPos()+1< 25)){
            if(Maps.FreeSquare(cursor.xPos(), cursor.yPos()+1, currentFloor))
                cursor.DeltaY(1);
        }
        else if(dir.isLeftArrow() || dir.code==CharKey.h && (cursor.xPos()-1>=0)){
            if(Maps.FreeSquare(cursor.xPos()-1, cursor.yPos(), currentFloor))
                cursor.DeltaX(-1);
        }
        else if(dir.isRightArrow() || dir.code==CharKey.l && (cursor.xPos()+1<80)){
            if(Maps.FreeSquare(cursor.xPos()+1, cursor.yPos(), currentFloor))
                cursor.DeltaX(1);
        }
        else if(dir.code==CharKey.y && cursor.xPos()-1>=0 && cursor.yPos()-1>=0){
            if(Maps.FreeSquare(cursor.xPos()-1, cursor.yPos()-1, currentFloor)) {
                cursor.DeltaX(-1);
                cursor.DeltaY(-1);
            }
        }
        else if(dir.code==CharKey.u && cursor.xPos()+1<80 && cursor.yPos()-1>=0){
            if(Maps.FreeSquare(cursor.xPos()+1, cursor.yPos()-1, currentFloor)) {
                cursor.DeltaX(1);
                cursor.DeltaY(-1);
            }
        }else if(dir.code==CharKey.b && cursor.xPos()-1>=0 && cursor.yPos()+1<25){
            if(Maps.FreeSquare(cursor.xPos()-1, cursor.yPos()+1, currentFloor)) {
                cursor.DeltaX(-1);
                cursor.DeltaY(1);
            }
        }else if(dir.code==CharKey.n && cursor.xPos()+1<80 && cursor.yPos()+1<25){
            if(Maps.FreeSquare(cursor.xPos()+1, cursor.yPos()+1, currentFloor)) {
                cursor.DeltaX(1);
                cursor.DeltaY(1);
            }
        }
    }
}
