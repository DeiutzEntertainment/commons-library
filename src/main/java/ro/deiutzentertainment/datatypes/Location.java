package ro.deiutzentertainment.datatypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private  float lat, lang, speed;


    @Override
    public String toString() {
        return "Location{" +
                "lat=" + lat +
                ", lang=" + lang +
                ", speed=" + speed +
                '}';
    }
}