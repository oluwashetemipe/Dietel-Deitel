package Chap8;

public class DateAndTime {
    private int month;
    private int day;
    private int year;
    private int seconds;
    private int minute;
    private int hour;
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public DateAndTime(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if (year < 1900 || year > 3000 ) throw new IllegalArgumentException("year (" + year + ") out-of-range for the specified year");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void nextDay(){
        if (day < daysPerMonth[month]){
            day++;
        }
        if (day == daysPerMonth[month]){
            setDay(1);
            month++;
        }
        if (month == 12 && day == daysPerMonth[month]){
            setDay(1);
            setMonth(1);
            year++;
        }
    }
    public void incrementHour(){
        if (hour < 23){
            setSeconds(0);
            setMinute(0);
            hour++;
        }
        if (hour == 23 && minute == 59 && seconds == 59){
            nextDay();
        }
    }
    @Override
    public String toString() {
        return String.format("%d/%d/%d %02d:%02d:%02d",month,day,year,hour,minute,seconds);
    }
    public String toUniversalString(){
        return String.format("%d/%d/%d %02d:%02d:%02d", month,day,year,getHour(), getMinute(), getSeconds());
    }
}
