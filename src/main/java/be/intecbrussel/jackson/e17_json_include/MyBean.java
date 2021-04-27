package be.intecbrussel.jackson.e17_json_include;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyBean {
    public int id;
    public String name;

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
