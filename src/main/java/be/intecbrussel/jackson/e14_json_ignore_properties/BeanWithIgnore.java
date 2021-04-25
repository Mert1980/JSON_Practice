package be.intecbrussel.jackson.e14_json_ignore_properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "id" })
public class BeanWithIgnore {
    public int id;
    public String name;

    public BeanWithIgnore(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
