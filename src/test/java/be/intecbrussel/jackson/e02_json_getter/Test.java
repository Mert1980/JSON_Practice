package be.intecbrussel.jackson.e02_json_getter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test {
    @org.junit.Test
    public void whenSerializingUsingJsonGetter_thenCorrect()
            throws JsonProcessingException {

        MyBean bean = new MyBean(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result); // {"id":1,"name":"My bean"} with @JsonGetter("name")
                                    // {"id":1,"theName":"My bean"} without @JsonGetter("name")
        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));
    }
}
