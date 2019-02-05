/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonTest;

/**
 *
 * @author ronsilva
 */
        
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
  
      
public class WriteJSON {
 

    public static void main(String[] args) throws FileNotFoundException  
    { 
        // creating JSONObject 
        JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("firstName", "Ron"); 
        jo.put("lastName", "Silva"); 
        jo.put("age", 37); 
          
        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "165n 300 w"); 
        m.put("city", "Provo"); 
        m.put("state", "UT"); 
        m.put("postalCode", 84601); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "801-9194865"); 
          
        // adding map to list 
        ja.add(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "CellPhone"); 
        m.put("number", "801-9194865"); 
          
        // adding map to list 
        ja.add(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter("JSONExample.json"); 
        pw.write(jo.toJSONString()); 
          
        pw.flush(); 
        pw.close(); 
    } 
} 

