// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
//import java.util.*;
//
//// Main class
//class GFG3{
//
//    // Main driver method
//    public static void main(String args[])
//    {
//        // Creating an empty HashMap
//        Map<String, Integer> hm
//                = new TreeMap<>();
//
//        // Inserting pairs in above Map
//        // using put() method
//        hm.put("a",(100));
//        hm.put("b", (500));
//        hm.put("c", (300));
//        hm.put("d", (200));
//
//        // Traversing through Map using for-each loop
//        for (Map.Entry<String, Integer> me :
//                hm.entrySet()) {
//
//            // Printing keys
//            System.out.println(me.getKey() + " : " + me.getValue());
//            //System.out.println(me.getValue());
//        }
//    }
//}

import java.util.*;
class GFG4 {
    public static void main(String args[])
    {
        // Default Initialization of a
        // Map
        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put((1), "Geeks");
        hm2.put((2), "For");
        hm2.put((3), "Geeks");

        System.out.println(hm1);
        System.out.println(hm2);
    }
}
