package be.intecbrussel.jackson.e28_json_mixin;

import be.intecbrussel.jackson.e28_jackson_mixin.Item;
import be.intecbrussel.jackson.e28_jackson_mixin.MyMixInForIgnoreType;
import be.intecbrussel.jackson.e28_jackson_mixin.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class TestJsonMixin {
    @Test
    public void whenSerializingUsingMixInAnnotation_thenCorrect()
            throws JsonProcessingException {
        Item item = new Item(1, "book", null);

        String result = new ObjectMapper().writeValueAsString(item);
        assertThat(result, containsString("owner"));
        System.out.println(result); // {"id":1,"itemName":"book","owner":null}

        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(User.class, MyMixInForIgnoreType.class);

        result = mapper.writeValueAsString(item);
        System.out.println(result); // {"id":1,"itemName":"book"}
        assertThat(result, not(containsString("owner")));
    }
}
