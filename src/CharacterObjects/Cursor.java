package CharacterObjects;

/**
 * Created by randersson on 2015-01-08.
 */
public class Cursor {
    private char symbol;
    private int xPos;
    private int yPos;
    private boolean isVisible;
    

    public Cursor(int x, int y) {
        symbol = 'O';
        xPos=x;
        yPos=y;
        isVisible = true;
    }

    public void DeltaX(int deltaX){
        xPos+=deltaX;
        
    }

    public void DeltaY(int deltaY){
        yPos+=deltaY;
    }

    public int xPos() {
        return xPos;
    }

    public int yPos() {
        return yPos;
    }

    public char getSymbol() {
        return symbol;
    }

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

}
