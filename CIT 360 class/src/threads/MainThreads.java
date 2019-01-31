/*
 * The Main Threads
 * Objective of this class is to show an exemple of threads
 * Author: Ronald Silva
 * Date last modified: Jan 29 2019
 */
package threads;

/**
 *
 * @author ronsilva
 */
public class MainThreads {
    
    public static void main(String[] args) {

                Customer customer1 = new Customer("Customer 1", new int[] { 2, 2, 1, 5, 2, 3 });
                Customer customer2 = new Customer("Customer 2", new int[] { 1, 3, 5, 1, 1 });

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		ThreadsCashier cashier1 = new ThreadsCashier ("Cashier 1", customer1, initialTime);
		ThreadsCashier cashier2 = new ThreadsCashier ("Cashier 2", customer2, initialTime);

		cashier1.start();
		cashier2.start();
	}
}
