package Chap8;

public class EnumTypeTest {
    public static void main(String[] args) {
        for (TrafficLightEnum lightEnum: TrafficLightEnum.values()) {
            System.out.printf("%-10s%5s%n", lightEnum,lightEnum.getDuration());
        }
    }
}
