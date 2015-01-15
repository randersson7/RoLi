package ItemObjects;

public class AccessoryItem extends Item {
	private int evasion = 0;
	private int attackPWR = 0;
	private int armor = 0;
	
	
	public AccessoryItem(char symbol) {
	// TODO Auto-generated constructor stub
		this.setSymbol(symbol);
	}


	public int getEvasion() {
		return evasion;
	}


	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}


	public int getAttackPWR() {
		return attackPWR;
	}


	public void setAttackPWR(int attackPWR) {
		this.attackPWR = attackPWR;
	}


	public int getArmor() {
		return armor;
	}


	public void setArmor(int armor) {
		this.armor = armor;
	}
}
