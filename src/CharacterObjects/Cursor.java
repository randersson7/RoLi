package CharacterObjects;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by randersson on 2015-01-08.
 */
public class Cursor {
	private char symbol;
	private int[] xyPos;
	
	private boolean isVisible;

	Timer toggleVisibility;
	Creature selectedCreature;

	public Cursor(int x, int y) {
		symbol = 'O';
		setXyPos(new int[] {x, y});
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
		getXyPos()[0]+=deltaX;

	}

	public void DeltaY(int deltaY){
		getXyPos()[1]+=deltaY;
	}

	public int xPos() {
		return getXyPos()[0];
	}

	public int yPos() {
		return getXyPos()[1];
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

	public int[] getXyPos() {
		return xyPos;
	}

	public void setXyPos(int[] xyPos) {
		this.xyPos = xyPos;
	}
}
