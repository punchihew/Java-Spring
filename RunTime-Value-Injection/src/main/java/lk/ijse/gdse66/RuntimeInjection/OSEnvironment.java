package lk.ijse.gdse66.RuntimeInjection;

import java.util.Map;
import java.util.Properties;

public class OSEnvironment {
    public static void main(String[] args) {

        // made with Spring Environment !
        // os environment + JRE environment + Resource Bundle = Spring Environment
        // environmet made using key value pairs
        //application common resources = resources bundle

        System.out.println("========================================");
        Map<String, String> map = System.getenv(); // os environment



        /*
        System.out.println(map);
         */
        for (String keys : map.keySet()) {
            System.out.println(keys + "=" + map.get(keys));
        }

        System.out.println("========================================");
        Properties properties = System.getProperties(); // JRE environment
        /*
        System.out.println(properties);
        */
        properties.put("city", "Galle");
        for (Object keys : properties.keySet()) {
            System.out.println(keys + "=" + properties.get(keys));
        }
    }
}
