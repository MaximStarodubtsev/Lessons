package Lesson6;

class MainClass{
    public static void main(String args[]){
        TimeClass timeClass = new TimeClass(5,6,5);
        timeClass.printTime();
    }
}

public class TimeClass {
    private int minutes;
    private int hours;
    private int seconds;
    private int totalSeconds;

    public int getMinutes() {
        return minutes;
    }
    public int getHours(){return hours;}
    public int getSeconds(){return seconds;}
    public int getTotalSeconds(){
        return totalSeconds;
    }

    public TimeClass(int seconds, int minutes, int hours){
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
    }
    public TimeClass(int totalSeconds){
        this.totalSeconds = totalSeconds;
    }
    public void printTime(){System.out.println("Time now: " + hours+ ":"+minutes +":"+ seconds);}

}
