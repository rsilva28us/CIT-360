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
public class Main {
    
    public static void main(String[] args){
       
        Thread list = new ThreadsExamples ("thread 1");
        Thread list2 = new ThreadsExamples ("thread 2");
        
        list.start();
        list2.start();
    }
    
}
