/*
 * The Cashier
 * Objective of this class is to show an exemple of threads
 * Author: Ronald Silva
 * Date last modified: Jan 29 2019
 */
package threads;

/**
 *
 * @author ronsilva
 */
public class Cashier {
    
    private String name;

	public Cashier() {
	}

	public Cashier(String name) {
		this.name = name;   
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void processPurchase(Customer customer, long timeStamp) {

		System.out.println("The cashier " + this.name + 
				" BEGINS TO PROCESS THE CUSTOMER'S PURCHASE " + customer.getName() + 
				" At the time: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"sec");

		for (int i = 0; i < customer.getShoppingCart().length; i++) {
			this.waitTimePerSecond(customer.getShoppingCart()[i]);
			System.out.println("Processed the product " + (i + 1) + 
					" ->Time: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
					"sec");
		}

		System.out.println("The cashier " + this.name + " IT HAS FINISHED PROCESSING " + 
							customer.getName() + " At the time: " + 
							(System.currentTimeMillis() - timeStamp) / 1000 + "sec");

	}

	private void waitTimePerSecond(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
