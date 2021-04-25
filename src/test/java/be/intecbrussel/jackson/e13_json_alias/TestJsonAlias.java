package be.intecbrussel.jackson.e13_json_alias;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class TestJsonAlias {
    @Test
    public void whenDeserializingUsingJsonAlias_thenCorrect() throws IOException {
        String json = "{\"fName\": \"John\", \"surname\": \"Green\"}";
        AliasBean aliasBean = new ObjectMapper().readerFor(AliasBean.class).readValue(json);
        assertEquals("John", aliasBean.getFirstName());
    }
}
