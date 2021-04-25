package be.intecbrussel.jackson.e16_json_ignore_type;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class User {
    public int id;
    public Name name;

    @JsonIgnoreType
    public static class Name {
        public String firstName;
        public String lastName;

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public User(int id, Name name) {
        this.id = id;
        this.name = name;
    }
}
