package be.intecbrussel.jackson.e04_json_raw_value;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test {
    @org.junit.Test
    public void whenSerializingUsingJsonRawValue_thenCorrect()
            throws JsonProcessingException {

        RawBean bean = new RawBean("My bean", "{\"attr\":false}");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result); // {"name":"My bean","json":{"attr":false}}

        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("{\"attr\":false}"));
    }
}
