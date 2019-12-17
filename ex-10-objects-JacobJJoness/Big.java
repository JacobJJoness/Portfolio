import java.math.BigInteger;
public class Big {

    public static BigInteger factorial(int n) {
        BigInteger ans =BigInteger.valueOf(n);
        for(int i = n-1 ; i >0; i--){
            ans= ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
       

    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);

        BigInteger result = BigInteger.valueOf(1);
        for(int i = 0; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(x));
        }
        return result;
    }
    public static void main(String[] args) {
        for(int i = 0; i <=30; i++){
            System.out.println(i+"! =" + factorial(i));
        }

        System.out.println(pow(10000,100));

    }
}