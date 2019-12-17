/**
 * The Date class will display today's date in American and European formats
 */
public class Date {
    public static void main(String[] args) {
        String month = "August";
        String day = "Wednesday";
        int year = 2019;
        int date = 28;
        System.out.println("American Version");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European Version");
        System.out.println(day + ", " + date + " " + month + " " + year );
        
    }
}