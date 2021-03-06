package lib.libjcsi.distro.usage_examples.net.slashie.libjcsi.examples;

import lib.libjcsi.src.net.slashie.libjcsi.ConsoleSystemInterface;
import lib.libjcsi.src.net.slashie.libjcsi.jcurses.JCursesConsoleInterface;

/**
 * This shows a basic console interface using the JCurses implementation.
 * @author Santiago Zapata
 */
public class JCursesExample {
	public static void main(String[] args) {
		ConsoleSystemInterface csi = null;
		try{
			csi = new JCursesConsoleInterface();
		}
        catch (ExceptionInInitializerError eiie){
        	System.out.println("Fatal Error Initializing JCurses");
        	eiie.printStackTrace();
            System.exit(-1);
        }
        csi.cls();
        csi.print(1,1,"Hello, Hello");
        csi.print(2,3,"This is printed using the CSI lib, JCurses Implementation!");
	}
}
