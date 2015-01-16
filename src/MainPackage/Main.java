package MainPackage;

import java.util.Timer;

import net.slashie.libjcsi.CharKey;
import objects.*;

public class Main {

    public static void main(String[] args) {

        ViewHandler view = new ViewHandler();
        ObjectHandler objectHandler = new ObjectHandler();

        Timer timer = new Timer();
        timer.schedule(new ViewTimer(view, objectHandler), 0);
        
        boolean stop = false;
        while(!stop){
        	//view.DrawStuff(objectHandler);

            CharKey dir = view.inKey();
            stop=objectHandler.Controller(dir);
        }
        System.exit(0);
	}
}
