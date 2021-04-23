package be.intecbrussel.json_nml;

import org.json.JSONArray;
import org.json.JSONML;
import org.json.JSONObject;

public class JSONDemo {
    public static void main(String[] args) {
        JSONArray list = new JSONArray();
        list.put("name");
        list.put("Robert");

        System.out.println("XML from a JSONArray: ");
        String xml = JSONML.toString(list);
        System.out.println(xml);

        System.out.println("JSONArray from a XML: ");
        list = JSONML.toJSONArray(xml);
        System.out.println(list);

        System.out.println("JSONObject from a XML: ");
        JSONObject object = JSONML.toJSONObject(xml);
        System.out.println(object);

        System.out.println("XML from a JSONObject: ");
        xml = JSONML.toString(object);
        System.out.println(xml);
    }
}
