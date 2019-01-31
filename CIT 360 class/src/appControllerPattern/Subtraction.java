/*
 * The Subtraction
 * Objective of this class is to show an exemple of Application Controller Pattern
 * Author: Ronald Silva
 * Date last modified: Jan 30 2019
 */
package appControllerPattern;

/**
 *
 * @author ronsilva
 */
public class Subtraction implements Maths {
	public void execute(Integer input1, Integer input2){
		Integer subtraction = input1 - input2;
		System.out.println(subtraction);
	}
	public int subtraction(int i, int j) {
		return i - j;
	}
}
