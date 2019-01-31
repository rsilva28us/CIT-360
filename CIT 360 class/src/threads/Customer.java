/*
 * The Customer
 * Objective of this class is to show an exemple of threads
 * Author: Ronald Silva
 * Date last modified: Jan 29 2019
 */
package threads;

/**
 *
 * @author ronsilva
 */
public class Customer {
    
    private String name;
	private int[] shoppingCart;

	public Customer() {
	}

	public Customer(String name, int[] shoppingCart) {
		this.name = name;
		this.shoppingCart = shoppingCart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(int[] shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
}
