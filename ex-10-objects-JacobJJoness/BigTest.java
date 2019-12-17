import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigInteger;

public class BigTest {

    @Test
    public void factorialTest() {
        assertEquals(new BigInteger("3628800"), Big.factorial(10));
        assertEquals(new BigInteger("1307674368000"), Big.factorial(15));
        assertEquals(new BigInteger("2432902008176640000"), Big.factorial(20));
        assertEquals(new BigInteger("15511210043330985984000000"), Big.factorial(25));
        assertEquals(new BigInteger("265252859812191058636308480000000"), Big.factorial(30));
        assertEquals(new BigInteger("10333147966386144929666651337523200000000"), Big.factorial(35));
    }

    @Test
    public void powTest() {
        assertEquals(new BigInteger("341427877364219557396646723584"),Big.pow(22,22));
        assertEquals(new BigInteger("183252712161029662582812243656704"),Big.pow(62,18));
        assertEquals(new BigInteger("19401402493429270772184517882322157792401011763891877258989132067877445707489"),Big.pow(17,62));
        assertEquals(new BigInteger("21035720123168587776"),Big.pow(24,14));
        assertEquals(new BigInteger("1"),Big.pow(99,0));
        assertEquals(new BigInteger("93076495688256089536609610280499"),Big.pow(19,25));
    }

}