package be.intecbrussel.jackson.e29_disable_jackson_annotations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "id" })
public class MyBean {
    public int id;
    public String name;

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
