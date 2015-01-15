package ItemObjects;

import net.slashie.libjcsi.CSIColor;

public class Item {
	private CSIColor color;
	private char symbol;
	
	public CSIColor getColor() {
		return color;
	}
	public void setColor(CSIColor color) {
		this.color = color;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
