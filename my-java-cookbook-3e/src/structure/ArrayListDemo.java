package structure;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 7.4 动态数组列表
 */
public class ArrayListDemo {
    public static void main(String[] argv) throws Exception {
        ArrayList<Date> al = new ArrayList<>();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        al.add(simpleDateFormat.parse("1911-10-10"));
        al.add(simpleDateFormat.parse("1931-09-18"));
        al.add(simpleDateFormat.parse("1945-08-15"));

        System.out.println("Retrieving by index:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Element " + i + " = " + al.get(i));
        }
    }
}