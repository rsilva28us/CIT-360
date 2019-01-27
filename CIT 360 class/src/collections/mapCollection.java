/*
 * The Map collection
 * Objective of this class is to show an exemple of Map collection
 * Author: Ronald Silva
 * Date last modified: Jan 26 2019
 */
package collections;

/**
 *
 * @author ronsilva
 */

import java.util.*;

public class mapCollection {
    
    public static void main(String args[]) {
        Map marvelMoviesYear = new HashMap();
        
         marvelMoviesYear.put("Iron Man", "2008");   
         marvelMoviesYear.put("The Incredible Hulk", "2008");
         marvelMoviesYear.put("Iron Man 2", "2010");
         marvelMoviesYear.put("Thor", "2011");
         marvelMoviesYear.put("Captain America: The First Avenger", "2011");
         marvelMoviesYear.put("Marvel's The Avengers", "2012");
         marvelMoviesYear.put("Iron Man 3", "2013");
         marvelMoviesYear.put("Thor: The Dark World", "2013");
         marvelMoviesYear.put("Captain America: The Winter Soldier", "2014");
         marvelMoviesYear.put("Guardians of the Galaxy", "2014");
         marvelMoviesYear.put("Avengers: Age of Ultron", "2015");
         marvelMoviesYear.put("Ant-Man", "2015");
         marvelMoviesYear.put("Captain America: Civil War", "2016");
         marvelMoviesYear.put("Doctor Strange", "2016");
         marvelMoviesYear.put("Guardians of the Galaxy Vol. 2", "2017");
         marvelMoviesYear.put("Spider-Man: Homecoming", "2017");
         marvelMoviesYear.put("Thor: Ragnarok", "2017");
         marvelMoviesYear.put("Black Panther", "2018");
         marvelMoviesYear.put("Avengers: Infinity War", "2018");
         marvelMoviesYear.put("Ant-Man and the Wasp", "2018");
        
            System.out.println(" Map Elements");
            System.out.print("\t" + marvelMoviesYear);
         
         
    }
    
}
    