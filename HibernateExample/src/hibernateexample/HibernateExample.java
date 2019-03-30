/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import java.util.*;
/**
 *
 * @author ronsilva
 */
public class HibernateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AutomobileDAO t = AutomobileDAO.getInstance();

        List<Automobile> a = t.getAutomobiles();    
        for (Automobile i : a) {
            System.out.println(i);
        }

        System.out.println(t.getAutomobile(1));
    }
}



