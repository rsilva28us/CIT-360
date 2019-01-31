/*
 * The Main
 * Objective of this class is to show an exemple of threads
 * Author: Ronald Silva
 * Date last modified: Jan 29 2019
 */
package threads;

/**
 *
 * @author ronsilva
 */


public class Main {
    
    public static void main(String[] args){

		Customer customer1 = new Customer("Customer 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Customer customer2 = new Customer("Customer 2", new int[] { 1, 3, 5, 1, 1 });
                
                Cashier cashier1 = new Cashier("Cashier 1");
                Cashier cashier2 = new Cashier("Cashier 2");

		// Initial reference time
                
		long initialTime = System.currentTimeMillis();
		
		cashier1.processPurchase(customer1, initialTime);
		cashier2.processPurchase(customer2, initialTime);
            }
}
            
        
        
    
       
    /*
        Thread list = new ThreadsExamples ("thread 1");
        Thread list2 = new ThreadsExamples ("thread 2");
        
        list.start();
        list2.start();
        
    }
    
}
*/