package structure;

import java.util.HashSet;
import java.util.Set;

/**
 * 7.8 使用 Set 避免元素重复存储
 */
public class SetDemo {
    public static void main(String[] argv) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("One"); // DUPLICATE
        hashSet.add("Three");
        hashSet.forEach(s -> System.out.println(s));
    }
}