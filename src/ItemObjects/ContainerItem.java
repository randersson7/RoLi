package ItemObjects;

import java.util.ArrayList;
import java.util.List;
import MainPackage.*; 


public class ContainerItem extends Item{
	private List<Item> itemList;
	private int xPos;
	private int yPos;
	boolean isVisible;
	
	public ContainerItem(char symbol, int xPos, int yPos) {
		// TODO Auto-generated constructor stub
		this.setSymbol(symbol);
		itemList = new ArrayList<Item>();
		this.setxPos(xPos);
		this.setyPos(yPos);
		
	}
	
	public void addItem(char symbol) {
		if(symbol==SymbolCollection.sword)
			itemList.add(new WeaponItem(SymbolCollection.sword));
		if(symbol==SymbolCollection.armor)
			itemList.add(new ArmorItem(SymbolCollection.armor));
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
