public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{   
        int speed = 10;
		for ( int i=0; i<150; i++ )
		{
			if ( i%24 == 0 )
				System.out.print("  Mr.Mitchell is cool. \r");
			else if ( i%24 == 1 )
				System.out.print("  Mr.Mitchell is cool \r");
			else if ( i%24 == 2 )
				System.out.print(".  Mr.Mitchell is coo \r");
			else if ( i%24 == 3 )
				System.out.print(" l.  Mr.Mitchell is co \r");
			else if ( i%24 == 4 )
				System.out.print(" ol.  Mr.Mitchell is c \r");
			else if ( i%24 == 5 )
				System.out.print(" ool.  Mr.Mitchell is \r");
			else if ( i%24 == 6 )
				System.out.print(" cool.  Mr.Mitchell i \r");
			else if ( i%24 == 7 )
				System.out.print(" s cool.  Mr.Mitchell  \r");
			else if ( i%24 == 8 )
				System.out.print(" is cool.  Mr.Mitchell \r");
			else if ( i%24 == 9 )
				System.out.print("  is cool.   Mr.Mitchel \r");
            else if ( i%24 == 10 )
				System.out.print(" l is cool.   Mr.Mitche \r");
            else if ( i%24 == 11 )
				System.out.print(" ll is cool.   Mr.Mitch \r");
            else if ( i%24 == 12 )
				System.out.print(" ell is cool.   Mr.Mitc \r");
            else if ( i%24 == 13 )
				System.out.print(" hell is cool.   Mr.Mit \r");
            else if ( i%24 == 14 )
				System.out.print(" chell is cool.   Mr.Mi \r");
            else if ( i%24 == 15 )
				System.out.print(" tchell is cool.   Mr.M \r");
            else if ( i%24 == 16 )
				System.out.print(" itchell is cool.   Mr. \r");
            else if ( i%24 == 17 )
				System.out.print(" Mitchell is cool.   Mr \r");
            else if ( i%24 == 18 )
				System.out.print(" .Mitchell is cool.   M \r");
            else if ( i%24 == 19 )
				System.out.print(" r.Mitchell is cool.    \r");
            else if ( i%24 == 20 )
				System.out.print(" Mr.Mitchell is cool.    \r");
            else if ( i%24 == 21 )
				System.out.print("  Mr.Mitchell is cool.   \r");
            else if ( i%24 == 22 )
				System.out.print("  Mr.Mitchell is cool.  \r");
            else if ( i%24 == 23 )
				System.out.print("  Mr.Mitchell is cool.\r");
       

			Thread.sleep(1000/speed);
		}
		
	}
}