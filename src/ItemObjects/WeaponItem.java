package ItemObjects;

public class WeaponItem extends Item{
	private int attackPWR;
	
	public WeaponItem(char symbol) {
		this.setSymbol(symbol);
	}
	public int getAttackPWR() {
		return attackPWR;
	}
	public void setAttackPWR(int attackPWR) {
		this.attackPWR = attackPWR;
	}

}
