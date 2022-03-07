package Chap3;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month,int day,int year) {
        if (month > 0 && month < 13){
            this.month = month;
        }
        if (day > 0 && day < 32){
            this.day = day;
        }
        if (year > 1500 && year < 5000){
            this.year = year;
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13){
            this.month = month;
        }    }
    public void setYear(int year) {
        if (year > 1500 && year < 5000){
            this.year = year;
        }
    }
    public void setDay(int day) {
        if (day > 0 && day < 32){
            this.day = day;
        }
    }
    public int getYear() {
        return year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public void displayDate(){
        System.out.printf("\n%d/%d/%d", month,day,year);
    }
}
