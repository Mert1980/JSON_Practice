package be.intecbrussel.jackson.e21_json_format;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class TestJsonFormat {
    @Test
    public void whenSerializingUsingJsonFormat_thenCorrect()
            throws JsonProcessingException, ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        EventWithFormat event = new EventWithFormat("party", date);

        String result = new ObjectMapper().writeValueAsString(event);
        System.out.println(result); // {"name":"party","eventDate":"20-12-2014 02:30:00"}
        assertThat(result, containsString(toParse));
    }
}
