package collectionFramework;

import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.*;

public class CollectionExamples {

    static void arrayListExample(){
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Azad");
        arr.add("Sonu");
        arr.add("GOLU");

        Iterator i1 = arr.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

    }

    static void linkedListExample(){
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);

        l1.addLast(1);
        l1.addLast(2);


        Iterator i1 = l1.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        System.out.println("First Element is : "  + l1.getFirst());
        System.out.println("Last Element is : "  + l1.getLast());

        System.out.println("Last Element Removed "  + l1.removeLast());

        System.out.println("Second Element is : "  + l1.get(2));

    }

    // Cursors : sed to retrieve data from collection object one by one;
    static void enumerationExample(){
        Vector<String> v = new Vector<>();
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");
        System.out.println(v);

        // Enumeration cursor
        Enumeration e1 = v.elements();
        while(e1.hasMoreElements()){
            String s = (String)e1.nextElement();
            System.out.println(s + " Length is "+s.length());
        }
    }

    static void iteratorExample(){
        ArrayList<Integer> arr =  new ArrayList<>();

        for(int i = 1; i<=10; i++){
            arr.add(i);
        }

        // Iterator
        Iterator i1 = arr.iterator();

        while(i1.hasNext()){
            Integer a = (Integer)i1.next();

            if(a>3 && a<9){
                i1.remove(); // remove current accessed element
            }
        }

        System.out.println(arr);
    }

    static void listIteratorExample(){
        ArrayList<Integer> arr =  new ArrayList<>();

        for(int i = 1; i<=10; i++){
            arr.add(i);
        }

        // Iterator
        ListIterator i1 = arr.listIterator();

        while(i1.hasNext()){
            Integer a = (Integer)i1.next();

            if(a>3 && a<9){
                i1.remove(); // remove current accessed element
            }

        }

        System.out.println(arr);
    }

//    static void hashSetExample(){
//
//        HashSet<String> h1 = new HashSet();
//
//        h1.add("First");
//        h1.add("Second");
//        h1.add("Third");
//        h1.add("Fourth");
//
//        System.out.println(h1.add("First"));
//        System.out.println(h1);
//
//    }
    static void treeSetExample(){
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("B");
        t1.add("C");
        t1.add("A");
        t1.add("D");
        t1.add("E");
        System.out.println(t1.add("A"));
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1);
        System.out.println(t1.headSet("C"));  // return a view of the portion of this set strictly lesser elements.
        System.out.println(t1.tailSet("C")); // return a view of the portion of this set greater or equal elements.

    }

    public static void driver(){
        // arrayListExample();
        // linkedListExample();
        // enumerationExample();
        // iteratorExample();
        // listIteratorExample();
        // hashSetExample();
        treeSetExample();

    }
}
