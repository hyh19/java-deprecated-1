package structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 7.9 使用迭代器或枚举
 */
public class IteratorDemo {
    public static void main(String[] argv) {
        List<String> l = new ArrayList<>();
        l.add("pig");
        l.add("dog");
        l.add("tiger");

        int i = 0;
        Iterator it = l.iterator();
        // Process the data structure using an iterator.
        // This part of the code does not know or care
        // if the data is an an array, a List, a Vector, or whatever.
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println("Element " + i++ + " = " + o);
        }
    }
}
