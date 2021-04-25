package be.intecbrussel.jackson.e13_json_alias;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AliasBean {
    @JsonAlias({ "fName", "f_name" })
    private String firstName;
    @JsonAlias({ "surname" })
    private String lastName;

    public AliasBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AliasBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
