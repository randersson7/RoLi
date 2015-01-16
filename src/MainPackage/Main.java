package MainPackage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import net.slashie.libjcsi.CharKey;
import objects.*;

public class Main {

    public static void main(String[] args) {

        ViewHandler view = new ViewHandler();
        ObjectHandler objectHandler = new ObjectHandler();

        Timer timer = new Timer(1000/60, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.DrawStuff(objectHandler);
				
			}
		});
        timer.start();
        
        boolean stop = false;
        while(!stop){
        	//view.DrawStuff(objectHandler);

            CharKey dir = view.inKey();
            stop=objectHandler.Controller(dir);
        }
        System.exit(0);
	}
}
