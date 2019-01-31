/*
 * The Division
 * Objective of this class is to show an exemple of Application Controller Pattern
 * Author: Ronald Silva
 * Date last modified: Jan 30 2019
 */
package appControllerPattern;

/**
 *
 * @author ronsilva
 */
public class Division implements Maths{
	public void execute(Integer input1, Integer input2){
		Integer division = input1 / input2;
		System.out.println(division);
	}
	
	public int division(int i, int j) {
		return i / j;
	}
}
