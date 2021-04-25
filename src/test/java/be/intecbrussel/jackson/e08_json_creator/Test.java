package be.intecbrussel.jackson.e08_json_creator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void whenDeserializingUsingJsonCreator_thenCorrect()
            throws IOException {

        String json = "{\"id\":1,\"theName\":\"My bean\"}";

        BeanWithCreator bean = new ObjectMapper()
                .readerFor(BeanWithCreator.class)
                .readValue(json);

        System.out.println(bean); // BeanWithCreator{id=1, name='My bean'}
        assertEquals("My bean", bean.name);
    }
}
