package MainPackage;

import java.util.TimerTask;

import objects.ObjectHandler;

public class ViewTimer extends TimerTask {
	ViewHandler view;
	ObjectHandler oh;
	
	public ViewTimer(ViewHandler view, ObjectHandler oh) {
		this.view = view;
		this.oh = oh;
	}
	
	public void run(){
		while(true){
			try {
				view.DrawStuff(oh);
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
