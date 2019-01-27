/*
 * The Queue collection
 * Objective of this class is to show an exemple of Queue collection
 * Author: Ronald Silva
 * Date last modified: Jan 26 2019
 */
package collections;

/**
 *
 * @author ronsilva
 */

import java.util.*;

public class QueueCollection {
    public static void main(String args[]) {
        
        Queue<String> queueMovies = new LinkedList<>();
        
        //Adding New Elements to the Queue
    
            queueMovies.add("Iron Man");
            queueMovies.add("The Incredible Hulk");
            queueMovies.add("Iron Man 2");
            queueMovies.add("Thor");
            queueMovies.add("Captain America: The First Avenger");
            queueMovies.add("Marvel's The Avengers");
            queueMovies.add("Iron Man 3");
            queueMovies.add("Thor: The Dark World");
            queueMovies.add("Captain America: The Winter Soldier");
            queueMovies.add("Guardians of the Galaxy");
            queueMovies.add("Avengers: Age of Ultron");
            queueMovies.add("Ant-Man");
            queueMovies.add("Captain America: Civil War");
            queueMovies.add("Doctor Strange");
            queueMovies.add("Guardians of the Galaxy Vol. 2");
            queueMovies.add("Spider-Man: Homecoming");
            queueMovies.add("Thor: Ragnarok");
            queueMovies.add("Black Panther");
            queueMovies.add("Avengers: Infinity War");
            queueMovies.add("Ant-Man and the Wasp");
            
        
            System.out.println(queueMovies);
            
            String first = queueMovies.peek();
            System.out.println("First Movie on the list: " + first);
            
            //Removing elements from the list
            String removeFilm = queueMovies.remove();
            queueMovies.offer("The Incredible Hulk");
            String next = queueMovies.remove();
            System.out.println("Next Movie is: "+ next);
 
            System.out.println("who's next: " + queueMovies.poll());
 

            System.out.println("who's next: " + queueMovies.peek());

           
         System.out.println(queueMovies);
    }
    
}
