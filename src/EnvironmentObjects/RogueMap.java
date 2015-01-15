package EnvironmentObjects;

import java.util.ArrayList;
import java.util.List;

import ItemObjects.ContainerItem;
import MainPackage.SymbolCollection;

public class RogueMap{

    List<FloorMap> mapCollection;
    private List<ContainerItem> itemCollection;
    public RogueMap() {
        mapCollection = new ArrayList<FloorMap>();
        setItemCollection(new ArrayList<ContainerItem>());
        AddFloor();
        AddItem();
        
    }

    public boolean FreeSquare(int x, int y, int floor){
        if(x>0 && x<mapCollection.get(floor).getCurrMap().length && y>0 && y<mapCollection.get(floor).getCurrMap()[0].length) {
            if (mapCollection.get(floor).getCurrMap()[x][y] == ' ') {
                return true;
            }
        }
        return false;
    }

    public void AddItem(){
    	getItemCollection().add(new ContainerItem(SymbolCollection.chest, 50, 19));
    }
    
    public void AddFloor(){
        mapCollection.add((new FloorMap()));
    }

    public FloorMap GetMap(int index){
        return mapCollection.get(index);
    }

	public List<ContainerItem> getItemCollection() {
		return itemCollection;
	}

	public void setItemCollection(List<ContainerItem> itemCollection) {
		this.itemCollection = itemCollection;
	}
}
