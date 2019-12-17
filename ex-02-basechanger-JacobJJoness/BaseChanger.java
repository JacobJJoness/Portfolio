/**
 * Name:  
 * 
 * The BaseChanger class will have static methods that can
 * be used to convert between Decimal and Binary numbers
 */
public class BaseChanger {

    /** 
    * returns a String representation of the binary value of 
    * the decimal number argument
    *
    * @param decNum the decimal value to be converted
    */
    public String decToBin(int decNum) {
        String solution = "";
        if(decNum == 0){
            return "0";
        }
        
        while ( decNum !=0 ){
            int leftover = decNum%2;
            solution = leftover + solution;
            decNum = decNum/2;
        }
           
        return solution;


        
    }

    /** 
     * returns a the decimal value of 
     * the binary number argument
     *
     * @param binNum the binary value to be converted
     */
    public int binToDec(int binNum) {
        int pos = 1 ;
        int answer = 0;
        while(binNum !=0){
            int posVal = binNum % 10;
            int decNumb = posVal * pos;
            binNum = binNum / 10;
            pos *=2;
            answer+= decNumb;






        }
        return answer;
    }







































    public static void main(String[] args) {
        // You should not need to change this code!
        
        // instantiate a BaseChanger object called "changer"
        BaseChanger changer = new BaseChanger();
        
        // Test decToBin
        System.out.print("Decimal Number: 25");
        System.out.print("\t\tExpected: 11001");
        System.out.println("\t\tGot: " + changer.decToBin(25));
        System.out.print("Decimal Number: 64");
        System.out.print("\t\tExpected: 1000000");
        System.out.println("\tGot: " + changer.decToBin(64));
        System.out.print("Decimal Number: 1");
        System.out.print("\t\tExpected: 1");
        System.out.println("\t\tGot: " + changer.decToBin(1));
        System.out.print("Decimal Number: 15");
        System.out.print("\t\tExpected: 1111");
        System.out.println("\t\tGot: " + changer.decToBin(15));
        System.out.print("Decimal Number: 0");
        System.out.print("\t\tExpected: 0");
        System.out.println("\t\tGot: " + changer.decToBin(0));

        System.out.println();

        // Test binToDec
        System.out.print("Binary Number: 101");
        System.out.print("\t\tExpected: 5");
        System.out.println("\t\tGot: " + changer.binToDec(101));
        System.out.print("Binary Number: 1000");
        System.out.print("\t\tExpected: 8");
        System.out.println("\t\tGot: " + changer.binToDec(1000));
        System.out.print("Binary Number: 1111111");
        System.out.print("\t\tExpected: 127");
        System.out.println("\t\tGot: " + changer.binToDec(1111111));
        System.out.print("Binary Number: 0");
        System.out.print("\t\tExpected: 0");
        System.out.println("\t\tGot: " + changer.binToDec(0));
        System.out.print("Binary Number: 101010");
        System.out.print("\t\tExpected: 42");
        System.out.println("\t\tGot: " + changer.binToDec(101010));
  
    }

}
