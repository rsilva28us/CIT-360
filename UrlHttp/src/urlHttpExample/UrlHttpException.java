/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlHttpExample;

import java.io.*;
import java.net.*;
/**
 *
 * @author ronsilva
 */
public class UrlHttpException {
    
     public static void main(String[] args) {
        try {
            // Read from a website
            URL url = new URL("https://github.com/rsilva28us/CIT-360");
            URLConnection urlCon = url.openConnection(); // Create URL connection object
            urlCon.setDoOutput(true); // Use to write to a connection
            urlCon.connect(); // Use connect() method to connect to URL
            
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlCon.getInputStream()));
            
            // Read each line as long as line is not null
            String line = "";
           while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
          inputStream.close(); // close the stream
            
            // Use an exception in case there's an error
        } catch(MalformedURLException e) {
            System.out.println("Bad URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

