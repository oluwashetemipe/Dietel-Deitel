package Chap5;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++){
            System.out.print("On the " + i);
            switch (i){
                case 1:
                    System.out.print("st");
                    break;
                case 2:
                    System.out.print("nd");
                    break;
                case 3:
                    System.out.print("rd");
                    break;
                default:
                    System.out.print("th");
            }
            System.out.println(" days of Christmas my true love said to me");

            switch (i){
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a milking,");
                case 7:
                    System.out.println("Seven swans swimming,");
                case 6:
                    System.out.println("Six geese a laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three french hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                default:
                    System.out.println("A partridge in a pear tree.");
            }
            System.out.println();
        }
    }
}
