public class Time {
    
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        hour = ((hour>=0 && hour<24)? hour:0);
        minute = ((minute>=0 && minute<60 ? minute: 0));
        second = ((second>=0 && second<60 ? second:0));
    }
}
    public String toString(){
        return String.format("%d:%02d:%02d", hour, minute,second);
    }

    public int getHour(){

    }

    public int getMinute(){

    }

    public int getSecond(){

    }
    public void setHour(int hour){

    }
    public void setMinute(int minute){

    }

    public void setSecond(int second){

    }

    public void setTime(int hour, int minute, int second){

    }
    public Time nextSecond(){

    }
    public Time prevSecond(){
        
    }

    