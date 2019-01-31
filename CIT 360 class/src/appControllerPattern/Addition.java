/*
 * The Addition
 * Objective of this class is to show an exemple of Application Controller Pattern
 * Author: Ronald Silva
 * Date last modified: Jan 30 2019
 */
package appControllerPattern;

/**
 *
 * @author ronsilva
 */
public class Addition implements Maths {
	public void execute(Integer input1, Integer input2){
		Integer addition = input1 + input2;
		System.out.println(addition);
	}
	
	public int addition(int i, int j) {
		return i + j;
	}
}
