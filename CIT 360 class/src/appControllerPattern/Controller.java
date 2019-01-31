/*
 * The Controller
 * Objective of this class is to show an exemple of Application Controller Pattern
 * Author: Ronald Silva
 * Date last modified: Jan 30 2019
 */
package appControllerPattern;

/**
 *
 * @author ronsilva
 */
import java.util.HashMap;

public class Controller {
    
    
   	public static HashMap<String, Maths> key = new HashMap <String, Maths>();
	
	public void Controller(){
		
	}
	
	public static void handleOperator(String operator, Integer input1, Integer input2){
		key.put("+", new Addition());
		key.put("-", new Subtraction());
		key.put("/", new Division());
		key.put("*", new Multiplication());
		
		Maths handler = key.get(operator);
		handler.execute(input1, input2);
	}
}
