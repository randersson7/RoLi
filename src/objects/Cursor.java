package objects;

/**
 * Created by randersson on 2015-01-08.
 */
public class Cursor {
    char symbol;
    int xPos;
    int yPos;

    public Cursor(int x, int y) {
        symbol = 'O';
        xPos=x;
        yPos=y;
    }

    public void DeltaX(int deltaX){
        xPos+=deltaX;
    }

    public void DeltaY(int deltaY){
        yPos+=deltaY;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public char getSymbol() {
        return symbol;
    }

}
