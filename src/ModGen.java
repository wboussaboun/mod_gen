

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ModGen {
	//116 TABLAS 
	//93 VISTAS
	static Robot r;

	public static void main(String[] args) throws InterruptedException {
		
		try {
			r = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("bot.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray instructions = (JSONArray) obj;
            System.out.println(instructions);
            
			//Iterate over employee array
            Thread.sleep(3000);
            instructions.forEach(instruction -> executeAction((JSONObject) instruction));
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	        
			

	}

	private static void executeAction(JSONObject instruction) {
		// TODO Auto-generated method stub
		JSONObject instructionObject = (JSONObject) instruction.get("instruction");
		
		pressKey(getKey(instructionObject.get("key")), (Long) instructionObject.get("duration"), (Long) instructionObject.get("delay"));
		
	}

	private static int getKey(Object object) {
		String key = object.toString();
		switch (key) {
		case"q":return KeyEvent.VK_Q;
		case"w":return KeyEvent.VK_W;
		case"e":return KeyEvent.VK_E;
		case"r":return KeyEvent.VK_R;
		case"t":return KeyEvent.VK_T;
		case"y":return KeyEvent.VK_Y;
		case"u":return KeyEvent.VK_U;
		case"i":return KeyEvent.VK_I;
		case"o":return KeyEvent.VK_O;
		case"p":return KeyEvent.VK_P;
		case"a":return KeyEvent.VK_A;
		case"s":return KeyEvent.VK_S;
		case"d":return KeyEvent.VK_D;
		case"f":return KeyEvent.VK_F;
		case"g":return KeyEvent.VK_G;
		case"h":return KeyEvent.VK_H;
		case"j":return KeyEvent.VK_J;
		case"k":return KeyEvent.VK_K;
		case"l":return KeyEvent.VK_L;
		case"z":return KeyEvent.VK_Z;
		case"x":return KeyEvent.VK_X;
		case"c":return KeyEvent.VK_C;
		case"v":return KeyEvent.VK_V;
		case"b":return KeyEvent.VK_B;
		case"n":return KeyEvent.VK_N;
		case"m":return KeyEvent.VK_M;
		}
		return 0;
	}

	private static void pressKey(int vk, Long duration, Long delay) {
		r.keyPress(vk);
		r.delay(duration.intValue());
		r.keyRelease(vk);
		r.delay(delay.intValue());
	}
} 
