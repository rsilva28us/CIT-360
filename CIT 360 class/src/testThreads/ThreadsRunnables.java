/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testThreads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author ronsilva
 */
public class ThreadsRunnables {

public static void main(String[] args) {
    ExecutorService executor= Executors.newFixedThreadPool(5);
    for(int i = 1; i<=10; i++){
    executor.execute(new Thread(){
        
        @Override
        public void run(){
            
        try {
                System.out.println("Movie 1");
                Thread.currentThread().sleep(1000);
                System.out.println("Movie 2");
                Thread.currentThread().sleep(1000);
                
        }catch (InterruptedException e){
            
            System.out.println("Interuppted.");
        } 
        System.out.println("Finished all threads");
            }
         });
    }
}
    
}