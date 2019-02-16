/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlHttpConnection;

import java.net.*;
import java.io.*;

/**
 *
 * @author ronsilva
 */
public class UrlHttpConnectionReading {

    public static void main(String[] args) throws Exception {
        URL netbeans = new URL("https://github.com/rsilva28us/CIT-360");
        URLConnection yc = netbeans.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}

