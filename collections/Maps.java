package collections; /**
 * Created by matiasmikkola on 1/13/16.
 */

import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

            TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();

            map1.put("hello", 1);
            map1.put("bye", 2);
            map1.put("whatsup", 3);

        System.out.println(map1);

            // Nasty Path

            TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();

            map2.put("hey", 2);
            map2.put("whatsup", 6);
            map2.put("hello", null);

            System.out.println(map2);

    }

}
