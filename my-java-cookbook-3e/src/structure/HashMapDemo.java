package structure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 7.11 HashMap
 */
public class HashMapDemo {

    public static void main(String[] argv) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Adobe", "Mountain View, CA");
        map.put("IBM", "White Plains, NY");
        map.put("Learning Tree", "Los Angeles, CA");
        map.put("Microsoft", "Redmond, WA");
        map.put("Netscape", "Mountain View, CA");
        map.put("O'Reilly", "Sebastopol, CA");
        map.put("Sun", "Mountain View, CA");

        System.out.println("---- 读取某个键对应的值 ----");
        String queryString = "O'Reilly";
        System.out.println("You asked about " + queryString + ".");
        String resultString = map.get(queryString);
        System.out.println("They are located in: " + resultString);

        System.out.println("---- 遍历键 ----");
        for (String key : map.keySet()) {
            // 遍历时删除会抛出异常 ConcurrentModificationException
            /*if (key.equals("Sun")) {
                map.remove("Sun");
                continue;
            }*/
            System.out.println("Key: " + key +
                    ", Value " + map.get(key));
        }

        System.out.println("---- 遍历条目 ----");
        map.entrySet().forEach(mE ->
                System.out.println("Key:" + mE.getKey() +
                        ", Value: " + mE.getValue()));

        // 使用 Iterator 遍历时删除条目，在循环内操作会抛出异常。
        System.out.println("---- 遍历时删除 ----");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.equals("Sun")) {
                it.remove();
                continue;
            }
            System.out.println("Company " + key + "; " +
                    "Address " + map.get(key));
        }
    }
}