package objects;

import java.util.ArrayList;
import java.util.List;

public class RogueMap{

    List<FloorMap> mapCollection;
    public RogueMap() {
        mapCollection = new ArrayList<FloorMap>();
        AddFloor();
    }

    public boolean FreeSquare(int x, int y, int floor){
        if(x>0 && x<mapCollection.get(floor).getCurrMap().length && y>0 && y<mapCollection.get(floor).getCurrMap()[0].length) {
            if (mapCollection.get(floor).getCurrMap()[x][y] == ' ') {
                return true;
            }
        }
        return false;
    }

    public void AddFloor(){
        mapCollection.add((new FloorMap()));
    }

    public FloorMap GetMap(int index){
        return mapCollection.get(index);
    }
}
