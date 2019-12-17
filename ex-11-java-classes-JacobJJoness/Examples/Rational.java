public class Rational {
    private int numerator;
    private int denominator;
    


    public Rational(){
        numerator = 0;
        denominator = 1;

    }
    public Rational(int num,int den){
        numerator = num;
        denominator = den;
        if (denominator <0){
            numerator *= -1;
            denominator *=-1;
        }

    }
    public static void invert(Rational r){
        int a = r.numerator;
        int b = r.denominator;
        r.numerator = b;
        r.denominator = a;
    }
    public static void negate(Rational r){
        r.numerator*=-1;  
        
    }
    public double toDouble(){
        return ((double)this.numerator/(double)this.denominator);
    }
    public static void printRational(Rational r){
        System.out.printf("%d/%d\n", r.numerator, r.denominator);
    }
    public String toString() {
        return String.format("%d/%d\n", this.numerator, this.denominator);
    } 
    
    public static int gcd(int a, int b){
        if (a==b){
            return a;
        }

        if (a > b){
            if(b == 0){
                return a;
            }else{
                return gcd(b,a%b);
            }
        }
        if (a < b){
            if(a == 0){
                return b;
            }else{
               return gcd(a,b%a);
            }
        }
        return -1;
    }
    public Rational reduce(Rational r){
        int divisor = gcd(r.numerator,r.denominator);
        r.numerator = r.numerator/divisor ;
        r.denominator = r.denominator/divisor;
        Rational rational = new Rational(r.numerator,r.denominator);
        return rational;
    }
    public Rational add(Rational rational){
        this.numerator += rational.numerator;
        this.denominator += rational.denominator;
        int divisor = gcd(this.numerator,this.denominator);
        int numerator = this.numerator / divisor;
        int denominator = this.denominator / divisor;
        Rational r = new Rational(numerator,denominator);
        return r;
    }




    public static void main(String[] args) {
        Rational rat1= new Rational(-3,4);
        Rational rat2= new Rational(4,32);
        printRational(rat1);
        negate(rat1);
        printRational(rat1);
        invert(rat1);
        printRational(rat1);
        System.out.println(rat1.toDouble());
        System.out.println(rat2.reduce(rat2));
        
    }

}



