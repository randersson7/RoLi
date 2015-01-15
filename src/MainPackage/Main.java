package MainPackage;
import net.slashie.libjcsi.CharKey;
import objects.*;

public class Main {

    public static void main(String[] args) {

        ViewHandler view = new ViewHandler();
        ObjectHandler objectHandler = new ObjectHandler();

        boolean stop = false;
        while(!stop){
            view.DrawStuff(objectHandler);

            CharKey dir = view.inKey();
            stop=objectHandler.Controller(dir);
        }
        System.exit(0);
	}
}
