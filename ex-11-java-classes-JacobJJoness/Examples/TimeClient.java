public class TimeClient {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(8, 59, 50.0);
        Time time3 = new Time(13, 10, 30.0);
        
        System.out.println("time1: " + time1);
        System.out.println("time2: " + time2);
        System.out.println("time3: " + time3);

        System.out.println("time1.hour = " + time1.getHour());
        System.out.println("time1.minute = " + time1.getMinute());
        System.out.println("time1.second = " + time1.getSecond());

        time1.setHour(6);
        time1.setMinute(15);
        time1.setSecond(23.5);
        System.out.println();
        System.out.println("time1.hour = " + time1.getHour());
        System.out.println("time1.minute = " + time1.getMinute());
        System.out.println("time1.second = " + time1.getSecond());

        Time time4 = time1;
        Time time5 = new Time(6, 15, 23.5);
        System.out.println();
        System.out.println("time1 == time4 is " + (time1==time4));
        System.out.println("time1 == time5 is " + (time1==time5));
        System.out.println("time1.equals(time4) is " + time1.equals(time4));
        System.out.println("time1.equals(time5) is " + time1.equals(time5));

        System.out.println();
        Time time6 = time2.add(time3);
        System.out.println("time2 + time3 = " + time6);

        time1.increment(1250);
        System.out.println("time1 + 1250 seconds = " + time1);

    }
}