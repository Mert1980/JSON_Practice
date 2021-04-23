package be.intecbrussel.json_stringer;

import org.json.JSONStringer;

public class JSONDemo {
    public static void main(String[] args) {
        String jsonText = new JSONStringer()
                .object()
                .key("Name")
                .value("Robert")
                .endObject()
                .toString();
        System.out.println(jsonText);

        jsonText = new JSONStringer()
                .array()
                .value("Robert")
                .value("Julia")
                .value("Dan")
                .endArray()
                .toString();
        System.out.println(jsonText);

        jsonText = new JSONStringer()
                .array()
                .value("Robert")
                .value("Julia")
                .value("Dan")
                .object()
                .key("Name")
                .value("Robert")
                .endObject()
                .endArray()
                .toString();
        System.out.println(jsonText);
    }
}
