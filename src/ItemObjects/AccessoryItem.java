package ItemObjects;

public class AccessoryItem extends Item {
	private int evasion = 0;
	private int attackPWR = 0;
	private int armor = 0;
	
	
	public AccessoryItem(char symbol) {
		this.setSymbol(symbol);
	}


	public int getEvasion() {
		return evasion;
	}

	public int getAttackPWR() {
		return attackPWR;
	}


	public int getArmor() {
		return armor;
	}
}
