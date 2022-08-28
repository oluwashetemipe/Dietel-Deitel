package Chap8;

public class Time {
    private int seconds;
    private int minute;
    private int hour;

    public Time(int seconds, int minute, int hour) {
        if  (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.seconds = seconds;
        this.minute = minute;
        this.hour = hour;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.seconds = seconds;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        this.minute = minute;
    }

    public void setHour(int hour) {
        if  (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.hour = hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void tick(){
        if (seconds < 60){
            seconds++;
        }
    }
    public void incrementMinute(){
        if (minute < 60){
            setSeconds(0);
            minute++;
        }
    }
    public void incrementHour(){
        if (hour < 23){
            setSeconds(0);
            setMinute(0);
            hour++;
        }
        if (hour == 23 && minute == 59 && seconds == 59){
            setSeconds(0);
            setMinute(0);
            setHour(0);
        }
    }
    public String toUniversalString(){
         return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSeconds());
    }
    public String toString(){
         return String.format("%d:%02d:%02d %s",
                 ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                 getMinute(), getSeconds(), (getHour() < 12 ? "AM" : "PM"));
         }
}
