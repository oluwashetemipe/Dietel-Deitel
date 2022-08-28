package Chap8;

import Chap8.DateTime;

public class DateTimeTest {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(3,29,2000);

        for (int i = 0; i < 7;i++){
            dateTime.nextDay();
            System.out.println(dateTime.toString());
        }
    }
}
