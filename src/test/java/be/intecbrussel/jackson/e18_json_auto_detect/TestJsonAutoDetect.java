package be.intecbrussel.jackson.e18_json_auto_detect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestJsonAutoDetect {
    @Test
    public void whenSerializingUsingJsonAutoDetect_thenCorrect()
            throws JsonProcessingException {

        PrivateBean bean = new PrivateBean(1, "My bean");

        String result = new ObjectMapper()
                .writeValueAsString(bean);
        System.out.println(result); // {"id":1,"name":"My bean"}


        assertThat(result, containsString("1"));
        assertThat(result, containsString("My bean"));
    }
}
