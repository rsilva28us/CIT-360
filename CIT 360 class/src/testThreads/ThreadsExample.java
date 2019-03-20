/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testThreads;

/**
 *
 * @author ronsilva
 */

public class  ThreadsExample {
    
    public static void main (String[] args) {
     
        Cashier cashier1 = new Cashier("Cashier 1");
        cashier1.start();
        cashier1.run();
        
        Cashier cashier2  = new Cashier("Cashier 2");
        cashier2.start();
    }
    
    
}

class Cashier implements Runnable {
    private Thread thread;
    private String customer;
    
    Cashier( String name){
        customer = name;
        System.out.println("BEGINS TO PROCESS THE CUSTOMER'S PURCHASE " + customer );
    }
    
    public void run() {
        System.out.println("Processed the product of the customer " + customer);
        try {
            for(int i = 1; i < 4; i++){
                System.out.println(customer + ", Customer " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(customer + " interuppted.");
        } 
        System.out.println("The " + this.customer +  " IT HAS FINISHED PROCESSING"); 
    }
 
    public void start ()
    {
        System.out.println("Starting " + customer);
        if (thread == null){
            thread = new Thread (this, customer);
            thread.start ();
            
        }
        
    }
    
}


