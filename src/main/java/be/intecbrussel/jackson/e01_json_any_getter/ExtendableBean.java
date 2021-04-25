package be.intecbrussel.jackson.e01_json_any_getter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.HashMap;
import java.util.Map;

public class ExtendableBean {
    public String name;
    private Map<String, String> properties;

    public ExtendableBean(String name) {
        this.properties = new HashMap<>();
        this.name = name;
    }

    @JsonAnyGetter(enabled = false)
    public Map<String, String> getProperties() {
        return properties;
    }

    public void add(String attr1, String val1) {
        properties.put(attr1, val1);
    }
}
