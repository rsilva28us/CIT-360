/*
 * The Application Controller
 * Objective of this class is to show an exemple of Application Controller Pattern
 * Author: Ronald Silva
 * Date last modified: Jan 30 2019
 */
package appControllerPattern;

/**
 *
 * @author ronsilva
 */
import java.util.Scanner;
        
public class ApplicationController {
    
    public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			Controller calculate = new Controller();
			Integer input1;
			Integer input2;
		
			String operator;
		
			System.out.println("Enter a number ");
			input1 = Integer.parseInt(input.nextLine());
		
			System.out.println("Enter the math you would like to do (+, -, *, /) ");
			operator = input.nextLine();
		
			System.out.println("Enter a number ");
			input2 = Integer.parseInt(input.nextLine());
		
			System.out.println("The result is");
		
			calculate.handleOperator(operator,input1,input2);	
		
		}catch (NumberFormatException ex) {
			System.out.println(" ");
			System.out.println("Please Enter Valid Numbers");
	    	System.out.println(" ");
	    	Scanner input = new Scanner(System.in);
			Controller calculate = new Controller();
			Integer input1;
			Integer input2;
		
			String operator;
		
			System.out.println("Enter a number ");
			input1 = Integer.parseInt(input.nextLine());
		
			System.out.println("Enter the math operation (+, -, *, /) ");
			operator = input.nextLine();
		
			System.out.println("Enter a number ");
			input2 = Integer.parseInt(input.nextLine());
		
			System.out.println("The result is");
		
			calculate.handleOperator(operator,input1,input2);
		}
	}
}
