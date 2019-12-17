

public class Complex{
    int a;
    int b;
    public Complex(){
        a = 0;
        b = 0;
    }
    public Complex(int c, int d){
        a = c;
        b = d;
    }
    public String toString(){
        String finlStr = "";
        if( this.a == 0 && this.b==0){
            finlStr = "0";
        }
        else if( this.a == 0){
            finlStr += this.b+"i";
        }
        else if( this.b == 0){
            finlStr += this.a;
        }
        else if(this.b == -1){
            finlStr +=  this.a +" - i";
        }
        else if(this.b == 1){
            finlStr +=  this.a +" + i";
        }else if( b > 0){
            finlStr +=  this.a +" + "+this.b+"i";
        }else if( b < 0){
            finlStr +=  this.a +" - "+this.b*-1+"i";
        }
        return finlStr;
    }
    public boolean equals(Complex that) {
        return this.a == that.a && this.b == that.b;
    }
    public Complex conjugate(){
        Complex newC = new Complex(this.a,this.b*-1);
        return newC;
    }
    public static Complex add(Complex one, Complex two){
        int ones  =  one.a + two.a;
        int twos = one.b + two.b;
        Complex added = new Complex(ones, twos);
        return added;
    }
    public static Complex subtract(Complex one, Complex two){
        int ones  =  one.a - two.a;
        int twos = one.b - two.b;
        Complex subbed = new Complex(ones, twos);
        return subbed;
    }
    public void multiply(Complex newOne){
        int aNum = this.a;
        int bNum = this.b;
        this.a = (aNum * newOne.a - bNum * newOne.b);
        this.b = (aNum * newOne.b + bNum * newOne.a);
    }
    public static Complex pow(Complex c, int n){
        int NumOne = c.a;
        int NumTwo = c.b;
        Complex spare = new Complex(NumOne,NumTwo);
        if(n == 0){
            spare.a = 1;
            spare.b = 0;
            return spare;
        }
        for( int i = 1; i < n ; i++){
            spare.multiply(c);
        }

        return spare;
    }
    
    




























}