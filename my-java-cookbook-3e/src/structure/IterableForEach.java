package structure;

import java.util.Arrays;
import java.util.Collection;

/**
 * 7.7 迭代器的使用方式
 */
public class IterableForEach {
    public static void main(String[] args) {
        // 循环语句
        String[] data = {"One", "Two", "Three"};
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        int i = 0;
        while (i < data.length) {
            System.out.println(data[i]);
            i++;
        }
        // 迭代器
        Collection<String> c = Arrays.asList(data);
        // Java 8
        c.forEach(s -> System.out.println(s));
        // Java 5
        for (String s : c) {
            System.out.println(s);
        }
    }
}