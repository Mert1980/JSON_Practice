package be.intecbrussel.jackson.json_getter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class MyBean {
    public int id;
    private String name;

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonGetter("name")
    public String getTheName() {
        return name;
    }
}
