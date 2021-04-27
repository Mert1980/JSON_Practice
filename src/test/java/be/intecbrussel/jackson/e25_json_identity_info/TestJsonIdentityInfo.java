package be.intecbrussel.jackson.e25_json_identity_info;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestJsonIdentityInfo {
    @Test
    public void whenSerializingUsingJsonIdentityInfo_thenCorrect()
            throws JsonProcessingException {
        UserWithIdentity user = new UserWithIdentity(1, "John");
        ItemWithIdentity item = new ItemWithIdentity(2, "book", user);
        user.addItem(item);

        String result = new ObjectMapper().writeValueAsString(item);
        System.out.println(result); // {"id":2,"itemName":"book","owner":{"id":1,"name":"John","userItems":[2]}}

        assertThat(result, containsString("book"));
        assertThat(result, containsString("John"));
        assertThat(result, containsString("userItems"));
    }
}
