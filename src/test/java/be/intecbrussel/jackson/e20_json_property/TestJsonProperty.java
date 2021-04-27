package be.intecbrussel.jackson.e20_json_property;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

public class TestJsonProperty {
    @Test
    public void whenUsingJsonProperty_thenCorrect()
            throws IOException {
        MyBean bean = new MyBean(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result); // {"id":1,"name":"My bean"}

        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));

        MyBean resultBean = new ObjectMapper()
                .readerFor(MyBean.class)
                .readValue(result);
        assertEquals("My bean", resultBean.getTheName());
    }
}
