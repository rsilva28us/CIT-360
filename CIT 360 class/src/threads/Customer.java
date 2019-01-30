/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
