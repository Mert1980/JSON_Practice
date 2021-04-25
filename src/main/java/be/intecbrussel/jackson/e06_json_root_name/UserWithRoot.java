package be.intecbrussel.jackson.e06_json_root_name;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employee")
public class UserWithRoot {
    public int id;
    public String name;

    public UserWithRoot(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


