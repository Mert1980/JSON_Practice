package be.intecbrussel.json_exception_handling;

import org.json.JSONException;
import org.json.XML;

public class JSONDemo {
    public static void main(String[] args) {
        try{
            //XML tag name should not have space.
            String xmlText = "<Other Details>null</Other Details>";
            System.out.println(xmlText);

            //Convert an XML to JSONObject
            System.out.println(XML.toJSONObject(xmlText));
        } catch(JSONException e){
            System.out.println(e.getMessage());
        }
    }
}
