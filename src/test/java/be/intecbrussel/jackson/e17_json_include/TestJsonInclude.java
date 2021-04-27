package be.intecbrussel.jackson.e17_json_include;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestJsonInclude {
    @Test
    public void whenSerializingUsingJsonInclude_thenCorrect()
            throws JsonProcessingException {

        MyBean bean = new MyBean(1, null);

        String result = new ObjectMapper()
                .writeValueAsString(bean);
        System.out.println(result);

        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("name")));
    }
}
