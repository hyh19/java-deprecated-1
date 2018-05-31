package structure;

import java.util.Arrays;
import java.util.List;

/**
 * 7.4 动态数组列表
 * 普通数组转化为动态数组列表
 */
public class ArraysAsListDemo {
    public static void main(String[] argv) throws Exception {

        List<String> firstNames = Arrays.asList("Robin", "Jaime", "Joey");
        for (int i = 0; i < firstNames.size(); i++) {
            System.out.println(i + " " + firstNames.get(i));
        }

        List<String> lastNames = Arrays.asList(new String[]{"Smith", "Jones", "MacKenzie"});
        for (int i = 0; i < lastNames.size(); i++) {
            System.out.println(i + " " + lastNames.get(i));
        }
    }
}