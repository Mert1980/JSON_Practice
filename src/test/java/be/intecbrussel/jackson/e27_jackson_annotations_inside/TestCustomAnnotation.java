package be.intecbrussel.jackson.e27_jackson_annotations_inside;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCustomAnnotation {
    @Test
    public void whenSerializingUsingCustomAnnotation_thenCorrect()
            throws JsonProcessingException {
        BeanWithCustomAnnotation bean
                = new BeanWithCustomAnnotation(1, "My bean", null);

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result); // {"name":"My bean","id":1}

        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));
        assertThat(result, not(containsString("dateCreated")));
    }
}
