package Chap8;

public enum TrafficLightEnum {
    RED("30 seconds"),
    YELLOW("5 seconds"),
    GREEN("90 seconds");

    private final String duration;


    TrafficLightEnum(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }
}
