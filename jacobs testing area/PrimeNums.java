

public class PrimeNums{
    

    int num;
    public PrimeNums(int n){
        num = n;
    }
    public Boolean isPrime(PrimeNums n){
        Boolean prime = false;
        for(int i = 2; i<=9; i++){
            if( n.num == 0 || n.num ==1){
                prime = false;
                i = 9;
            }
            else if(n.num % i == 0){
                prime = false;
                i = 9;
            }else{
                prime = true;
            }
        }
        return prime;     
        }

















    public static void main(String[] args) {
        PrimeNums tester = new PrimeNums(5);
        PrimeNums tester2 = new PrimeNums(19);
        PrimeNums tester3 = new PrimeNums(17);
        PrimeNums tester4 = new PrimeNums(16);
        System.out.println(tester.isPrime(tester));
        System.out.println(tester2.isPrime(tester2));
        System.out.println(tester3.isPrime(tester3));
        System.out.println(tester4.isPrime(tester4));
    }


}