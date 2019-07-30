package mod_gen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ModGen {
	//116 TABLAS 
	//93 VISTAS
	// asdasdasdasdad
	
	public static void main(String[] args) throws InterruptedException {
		try {
	        Robot r = new Robot();
	        r.delay(3000);
	        int actions = 0;
	        int limit = 93;
	        // Simulate a  key press
	        while (actions  < limit){
	        	// 
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
 
 	private static void gather(Robot r, int i, int j) {
 		r.mouseMove(i, j);
 		rightClick(r);
 		r.delay(4000);
 		r.mouseMove(850, 205);
 		leftClick(r);
 		r.delay(500);
 	}
 
 	private static void leftClick(Robot r) {
 		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
 		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
 	}
 
 	private static void rightClick(Robot r) {
 		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
 		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
 	}
 
} 
