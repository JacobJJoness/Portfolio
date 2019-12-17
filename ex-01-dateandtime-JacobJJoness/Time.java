
public class Time {
    public static void main(String[] args) {
        int hour= 5 ;
        int minute= 38 ;
        int second= 32 ;
        int secondsAmt = hour*3600 + minute*60 + second;
        int secondsLeft =  86400 - secondsAmt ; 

        int endMinute = 22 ;
        int endSecond = 48;
        int endHour = 12 ;
        int secondsAmtTwo = endHour*3600 + endMinute*60 + endSecond;
        
        int totalTime = secondsAmtTwo - secondsAmt ;
        int elaspedHour = totalTime/3600;
        totalTime = totalTime - elaspedHour * 3600 ;
        int elaspedMin = totalTime/ 60;
        totalTime = totalTime - elaspedMin * 60;
        double secondsPercentage = (1.0*secondsAmt/ 86400)*100;
        System.out.printf(" Seconds since midnight %d \n",secondsAmt);
        System.out.printf(" Seconds left in the day %d \n",secondsLeft);
        System.out.printf(" Percentage of day elasped %.2f%% \n",secondsPercentage);
        System.out.printf("To finish the assignment I took %d hours %d , minutes and, %d seconds \n",elaspedHour,elaspedMin,totalTime);
        



        


    }

}