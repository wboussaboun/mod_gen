package mod_gen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ModGen {
	//116 TABLAS 
	//93 VISTAS
	
	public static void main(String[] args) throws InterruptedException {
		try {
	        Robot r = new Robot();
	        r.delay(3000); //wait 3 seconds to launch
	        int actions = 0;
	        int limit = 93;// number of times to execute the action
	        
	        while (actions  < limit){
	        	// Simulate a  key press
	        	r.keyPress(KeyEvent.VK_DOWN);
	        	r.keyRelease(KeyEvent.VK_DOWN);
	        	r.delay(10);
	        	r.keyPress(KeyEvent.VK_SPACE);
	        	r.keyRelease(KeyEvent.VK_SPACE);
	        	r.delay(100);
	        	actions++;
	        } 
	         
	 	} catch (AWTException e) {
	 	        e.printStackTrace();
	 	}
 	}
} 
