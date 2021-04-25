package be.intecbrussel.jackson.e11_json_setter;

import com.fasterxml.jackson.annotation.JsonSetter;

public class MyBean {
    public int id;
    private String theName;

    @JsonSetter("name")
    public void setTheName(String name) {
        this.theName = name;
    }

    public String getTheName() {
        return theName;
    }
}
