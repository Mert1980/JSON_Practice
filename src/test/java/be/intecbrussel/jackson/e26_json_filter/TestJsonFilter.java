package be.intecbrussel.jackson.e26_json_filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestJsonFilter {
    @Test
    public void whenSerializingUsingJsonFilter_thenCorrect()
            throws JsonProcessingException {
        BeanWithFilter bean = new BeanWithFilter(1, "My bean");

        FilterProvider filters
                = new SimpleFilterProvider().addFilter(
                "myFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("name"));

        String result = new ObjectMapper()
                .writer(filters)
                .writeValueAsString(bean);

        System.out.println(result); // {"name":"My bean"}
        assertThat(result, containsString("My bean"));
        assertThat(result, not(containsString("id")));
    }
}
