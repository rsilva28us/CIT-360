/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ronsilva
 */


public class ListItem {
    
    private String name;
    private String year;
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;        
    }
    
    public void setYear(String year){
       this.year = year;
    }
}