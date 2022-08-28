package Chap8;

import Chap8.Rectangle8_4;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle8_4 rectangle8_4 = new Rectangle8_4();
        rectangle8_4.setLength(2);
        rectangle8_4.setWidth(5);
        System.out.println(rectangle8_4.area(rectangle8_4));
        System.out.println(rectangle8_4.perimeter(rectangle8_4));
    }
}
