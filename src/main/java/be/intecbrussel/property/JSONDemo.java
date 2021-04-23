package be.intecbrussel.property;

import java.util.Properties;
import org.json.JSONObject;
import org.json.Property;

public class JSONDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("title", "This is a title text");
        properties.put("subtitle", "This is a subtitle text");

        System.out.println("Properties to JSON");
        JSONObject jsonObject = Property.toJSONObject(properties);
        System.out.println(jsonObject);

        System.out.println("JSON to properties");
        System.out.println(Property.toProperties(jsonObject));
    }
}
