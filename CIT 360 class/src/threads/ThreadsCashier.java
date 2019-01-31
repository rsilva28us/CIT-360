/*
 * The ThreadsCashier
 * Objective of this class is to show an exemple of threads
 * Author: Ronald Silva
 * Date last modified: Jan 29 2019
 */
package threads;

/**
 *
 * @author ronsilva
 */
public class ThreadsCashier extends Thread {

	private String name;    

	private Customer customer;

	private long initialTime;


	public ThreadsCashier () {
	}

	public ThreadsCashier (String name, Customer customer, long initialTime) {
		this.name = name;
		this.customer = customer;
		this.initialTime = initialTime;
	}

	public String SetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void run() {

		System.out.println("The cashier " + this.name + " BEGINS TO PROCESS THE CUSTOMER'S PURCHASE " 
					+ this.customer.getName() + " At the time: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "sec");

		for (int i = 0; i < this.customer.getShoppingCart().length; i++) {
                            // The order is processed in per seconds
			this.waitTimePerSecond(customer.getShoppingCart()[i]);
			System.out.println("Processed the product" + (i + 1) 
						+ " of the customer " + this.customer.getName() + "->Time: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "sec");
		}

		System.out.println("The cashier " + this.name + " IT HAS FINISHED PROCESSING " 
						+ this.customer.getName() + " At the time: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "sec");
	}

	private void waitTimePerSecond(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}

