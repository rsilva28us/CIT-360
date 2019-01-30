/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author ronsilva
 

public class ThreadsExamples extends Thread{
    
    public ThreadsExamples (String msg){
        
        super (msg);
    }
    //implementing Runnable 
    public void run(){
        
        for(int i=0; i<=20;i++)
            System.out.println(this.getName());
    }
    
 
}
        */
