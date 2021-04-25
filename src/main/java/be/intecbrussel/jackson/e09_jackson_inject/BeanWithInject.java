package be.intecbrussel.jackson.e09_jackson_inject;

import com.fasterxml.jackson.annotation.JacksonInject;

public class BeanWithInject {
    @JacksonInject
    public int id;
    public String name;
}
