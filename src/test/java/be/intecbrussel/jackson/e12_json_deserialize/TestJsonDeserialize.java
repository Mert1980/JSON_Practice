package be.intecbrussel.jackson.e12_json_deserialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import java.io.IOException;
import java.text.SimpleDateFormat;
import static org.junit.Assert.assertEquals;

public class TestJsonDeserialize {
    @Test
    public void whenDeserializingUsingJsonDeserialize_thenCorrect()
            throws IOException {

        String json
                = "{\"name\":\"party\",\"eventDate\":\"20-12-2014 02:30:00\"}";

        SimpleDateFormat df
                = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        EventWithSerializer event = new ObjectMapper()
                .readerFor(EventWithSerializer.class)
                .readValue(json);

        assertEquals(
                "20-12-2014 02:30:00", df.format(event.eventDate));
    }
}
