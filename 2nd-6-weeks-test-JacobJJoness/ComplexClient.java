

public class ComplexClient {
    Complex c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

    public void testConstructors() {
        System.out.println("Testing constructors...");
        c1 = new Complex();
        c2 = new Complex(2, 3);
        c3 = new Complex(3, -5);
        c4 = new Complex(-6, 2);
        c5 = new Complex(-1,-1);
        c6 = new Complex(2,1);
        c7 = new Complex(0,5);
        c8 = new Complex(0,-5);
        c9 = new Complex(4,0);
        c10 = new Complex(3, -5);
        System.out.println("No errors.");
    }

    public void testToString() {
        System.out.println("Testing toString()");
    
        System.out.println("Expected: 0         Got: " + c1);
        System.out.println("Expected: 2 + 3i    Got: " + c2);
        System.out.println("Expected: 3 - 5i    Got: " + c3);
        System.out.println("Expected: -6 + 2i   Got: " + c4);
        System.out.println("Expected: -1 - i    Got: " + c5);
        System.out.println("Expected: 2 + i     Got: " + c6);
        System.out.println("Expected: 5i        Got: " + c7);
        System.out.println("Expected: -5i       Got: " + c8);
        System.out.println("Expected: 4         Got: " + c9);
    }

    public void testEquals() {
        System.out.println("Testing equals()");
        System.out.println("Expecting: false    Got: " + c1.equals(c2));
        System.out.println("Expecting: true     Got: " + c1.equals(c1));
        System.out.println("Expecting: true     Got: " + c10.equals(c3));
        System.out.println("Expecting: false    Got: " + c5.equals(c6));
        Complex c11 = new Complex(2,1);
        System.out.println("Expecting: true     Got: " + c11.equals(c6));
    }

    public void testConjugate() {
        System.out.println("Testing conjugate()");
        System.out.println("Expecting: 2 - 3i   Got: " + c2.conjugate());
        System.out.println("Expecting: 2 + 3i   Got: " + c2);
        System.out.println("Expecting: 3 + 5i   Got: " + c3.conjugate());
        System.out.println("Expecting: 3 - 5i   Got: " + c3);
        System.out.println("Expecting: -6 - 2i  Got: " + c4.conjugate());
        System.out.println("Expecting: -6 + 2i  Got: " + c4);
        System.out.println("Expecting: -1 + i   Got: " + c5.conjugate());
        System.out.println("Expecting: -1 - i   Got: " + c5);
        System.out.println("Expecting: -5i      Got: " + c7.conjugate());
        System.out.println("Expecting: 5i       Got: " + c7);
        System.out.println("Expecting: 5i       Got: " + c8.conjugate());
        System.out.println("Expecting: -5i      Got: " + c8);
        System.out.println("Expecting: 4        Got: " + c9.conjugate());

    }

    public void testAdd() {
        System.out.println("Testing add()");
        System.out.println("Expecting: 5 - 2i   Got: " + Complex.add(c2,c3));
        System.out.println("Expecting: -4 - 5i  Got: " + Complex.add(c2,c4));
        System.out.println("Expecting: -7 + i   Got: " + Complex.add(c4,c5));
        System.out.println("Expecting: 4 + 5i   Got: " + Complex.add(c7,c9));
        System.out.println("Expecting: -3 - 3i  Got: " + Complex.add(c4,c3));
    }

    public void testSubtract() {
        System.out.println("Testing subtract()");
        System.out.println("Expecting: -1 + 8i  Got: " + Complex.subtract(c2,c3));
        System.out.println("Expecting: 9 - 7i   Got: " + Complex.subtract(c3,c4));
        System.out.println("Expecting: 1 - 8i   Got: " + Complex.subtract(c3,c2));
        System.out.println("Expecting: -9 + 7i  Got: " + Complex.subtract(c4,c3));
        System.out.println("Expecting: 4 + 5i   Got: " + Complex.subtract(c9,c8));
    }

    public void testMultiply() {
        System.out.println("Testing multiply()");
        c2.multiply(c3);
        System.out.println("Expecting: 21 - i   Got: " + c2);
        c3.multiply(c4);
        System.out.println("Expecting: -8 + 36i Got: " + c3);
        c4.multiply(c5);
        System.out.println("Expecting: 8 + 4i   Got: " + c4);
        c1.multiply(c2);
        System.out.println("Expecting: 0        Got: " + c1);
        c7.multiply(c8);
        System.out.println("Expecting: 25       Got: " + c7);

    }

    public void testPow() {
        c2 = new Complex(2, 3);
        c3 = new Complex(3, -5);
        c5 = new Complex(-1,-1);
        c7 = new Complex(0,5);
        System.out.println("Testing pow()");
        System.out.println("Expecting: -25          Got: " + Complex.pow(c7,2));
        System.out.println("Expecting: -125i        Got: " + Complex.pow(c7,3));
        System.out.println("Expecting: 1            Got: " + Complex.pow(c2,0));
        System.out.println("Expecting: -46 + 9i     Got: " + Complex.pow(c2,3));
        System.out.println("Expecting: 2 - 2i       Got: " + Complex.pow(c5,3));
        System.out.println("Expecting: -8i          Got: " + Complex.pow(c5,6));
        System.out.println("Expecting: -119 - 120i  Got: " + Complex.pow(c2,4));
        System.out.println("Expecting: 2868 + 6100i Got: " + Complex.pow(c3,5));
    }

    
    public static void main(String[] args) {
        ComplexClient client = new ComplexClient();

        client.testConstructors(); // don't comment this one out!
        System.out.println();
        

        // uncomment each of the following to test
        //client.testToString(); 
        //System.out.println();

        //client.testEquals();
        //System.out.println();

        //client.testConjugate();
        //System.out.println();
        
        //client.testAdd();
        //System.out.println();

        //client.testSubtract();
        //System.out.println();
        
        //client.testMultiply(); 
        //System.out.println();  
        
        //client.testPow();
        //System.out.println();

        

    }
}