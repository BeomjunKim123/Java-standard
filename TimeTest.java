package 자바의정석;

class Time {
    private int hour; //0~23사이의 값을 가져야함.
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;;

        this.hour = hour;
    }

    //매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {return hour;};
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
      // t.hour = -100;
        t.setHour(21); //hour의 값을 21로 변경
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());

    }
}
