package be.intecbrussel.xml;

import org.json.JSONObject;
import org.json.XML;

public class JSONDemo {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Robert");
        jsonObject.put("ID", 1);
        jsonObject.put("Fees", new Double(1000.21));
        jsonObject.put("Active", new Boolean(true));
        jsonObject.put("Details", JSONObject.NULL);

        //Convert a JSONObject to XML
        String xmlText = XML.toString(jsonObject);
        System.out.println(xmlText);

        //Convert an XML to JSONObject
        System.out.println(XML.toJSONObject(xmlText));
    }
}
