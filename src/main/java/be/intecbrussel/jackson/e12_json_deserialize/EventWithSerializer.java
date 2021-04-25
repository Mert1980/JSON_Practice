package be.intecbrussel.jackson.e12_json_deserialize;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;

public class EventWithSerializer {
    public String name;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public Date eventDate;

    public EventWithSerializer() {
    }

    public EventWithSerializer(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }
}
