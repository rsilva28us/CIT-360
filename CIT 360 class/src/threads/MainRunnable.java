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
public class MainRunnable implements Runnable{
	
	private Customer customer;
	private Cashier cashier;
	private long initialTime;
	
	public MainRunnable (Customer customer, Cashier cashier, long initialTime){
		this.cashier = cashier;
		this.customer = customer;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Customer 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Customer customer2 = new Customer("Customer 2", new int[] { 1, 3, 5, 1, 1 });
		
		Cashier cashier1 = new Cashier("Cashier 1");
		Cashier cashier2 = new Cashier("Cashier 2");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable process1 = new MainRunnable(customer1, cashier1, initialTime);
		Runnable process2 = new MainRunnable(customer2, cashier2, initialTime);
		
		new Thread(process1).start();
		new Thread(process2).start();

	}

	@Override
	public void run() {
		this.cashier.processPurchase(this.customer, this.initialTime);
	}


    
}
