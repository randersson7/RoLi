package CharacterObjects;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by randersson on 2015-01-08.
 */
public class Cursor {
	private char symbol;
	private int xPos;
	private int yPos;
	private boolean isVisible;

	Timer toggleVisibility;

	public Cursor(int x, int y) {
		symbol = 'O';
		xPos=x;
		yPos=y;
		isVisible = true;
		toggleVisibility = new Timer();
		toggleVisibility.schedule(new TimerTask() {

			@Override
			public void run() {
				while(true){
					isVisible = !isVisible;
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		}, 100);
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
