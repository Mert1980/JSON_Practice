package be.intecbrussel.jackson.e29_disable_jackson_annotations;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestDisableJacksonAnnotations {
    @Test
    public void whenDisablingAllAnnotations_thenAllDisabled()
            throws IOException {
        MyBean bean = new MyBean(1, null);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        String result = mapper.writeValueAsString(bean);
        System.out.println(result); // {"id":1,"name":null}

        assertThat(result, containsString("1"));
        assertThat(result, containsString("name"));
    }
}
