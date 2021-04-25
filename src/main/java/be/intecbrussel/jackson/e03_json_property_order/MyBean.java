package be.intecbrussel.jackson.e03_json_property_order;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "name", "id" })
public class MyBean {
    public int id;
    public String name;

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
