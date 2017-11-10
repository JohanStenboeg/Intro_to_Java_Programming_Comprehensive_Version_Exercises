package Chapter10.Opg10_1;

public class Time {
    //Deklareing the different variables im going to use.
    private int hour;
    private int minute;
    private int second;

    //Making a constructor, with 3 arguments. This will be called on when making a new class of time.
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //Making a getter method, for getting current time.
    public String getCTime(){ //GetcTime = get current time.
        double cTime = System.currentTimeMillis();
        long second = (int) (cTime / ( 1000 ) % 60 );
        long minute = (int) ((cTime / ( 1000 * 60)) % 60 );
        long hour =  (int) ((cTime / ( 1000 * 60 * 60 ))%24+2); //+2 because we are in Denmark, ants its GMT+2.

        return "The current time is " + hour + ":" + minute + ":" + second;


    }
    //Making a getter method for getting specific elapsed time.
    public long getSETime(long hour, long minute, long second){ //GetSETime = get specific elapsed time.
        java.util.Date date = new java.util.Date(); //importing java.date class and making a new object from it.
        long timeInMili = (((((hour * 60) + minute) * 60) + second) * 1000);
        date.setTime(timeInMili);
        System.out.println(toString());
        return timeInMili;
    }
    //Making a new method for getting specific time.
    public String getSTime(int hour, int minute, int second ){ //GetSETime = get specific time.

        return  hour + ":" + minute + ":" + second;
    }
    //Displaying the time, if you want only hour, or only minut or only second.
    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}

    //Making method for setting a new time.
    public String settingTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        return hour + " : " + minute + " : " + second;


    }

}

