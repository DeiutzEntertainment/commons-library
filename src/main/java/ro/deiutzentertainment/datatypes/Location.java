package ro.deiutzentertainment.datatypes;

public class Location {

    public final float lat, lang, speed;

    public Location(float lat, float lang, float speed) {
        this.lat = lat;
        this.lang = lang;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Location{" +
                "lat=" + lat +
                ", lang=" + lang +
                ", speed=" + speed +
                '}';
    }
}