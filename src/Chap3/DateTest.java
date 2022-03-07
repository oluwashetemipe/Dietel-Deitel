package Chap3;

public class DateTest {
    public static void main(String... args){
        Date date = new Date(04,29,2000);
        Date dateOfBirth = new Date(06,30,2060);

        date.displayDate();
        dateOfBirth.displayDate();
    }
}
