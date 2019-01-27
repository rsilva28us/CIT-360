/*
 * The Set collection
 * Objective of this class is to show an exemple of set collection
 * Author: Ronald Silva
 * Date last modified: Jan 19 2019
 */
package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ronsilva
 */
public class setCollection {

    public static void main(String args[]) {
        int count[] = {2, 4, 5, 9};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 4; i++) {
                set.add(count[i]);
            }

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("my youngest child's age is: "
                    + (Integer) sortedSet.first());
            System.out.println("my oldest child's age is: "
                    + (Integer) sortedSet.last());
        } catch (Exception e) {
        }
    }
}
