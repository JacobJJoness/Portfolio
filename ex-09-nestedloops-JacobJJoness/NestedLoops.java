/**
 * The NestedLoops program demonstrates my
 * understanding of how to use nested loops
 * to generate interesting patterns.
 * 
 * @author My Name
 * @since 10-16-2019
 */

public class NestedLoops {

    /**
     * This method will display a rectangle
     * made of stars (*) with the given dimensions.
     * @param row
     * @param col
     * @return Nothing
     */
    public static void box(int row, int col) {
        for( int r = 0; r < row; r++){
            for( int c = 0; c < col ; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Fill this in
     * @param args
     */
    public static void triangle(int side) {
        for ( int r = 0; r <= side; r++){
            for( int c = 0 ; c <= r; c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     * Fill this in
     * @param args
     */
    public static void reverseTri(int side) {
        for( int r = 0; r < side; r++){
            for( int c = side - 1; c > r; c--){
                System.out.print(" ");
            }
            for( int c = 0; c <= r; c++ ){
                System.out.print("*");
            }
            System.out.println();



        }
    }

    /**
     * Fill this in
     * @param args
     */
    public static void pyramid(int side) {
        for( int r = 0; r < side; r++){
            for( int c = side - 1; c > r; c--){
                System.out.print(" ");
            }
            for( int c = 0; c <= 2*r; c++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Fill this in
     * @param args
     */
    public static void invertedPyramid(int side) {
        for( int r = side-1; r >= 0; r--){
            for( int c = side - 1; c > r; c--){
                System.out.print(" ");
            }
            for( int c = 0; c <= r*2; c++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Fill this in
     * @param args
     */
    public static void hollowBox(int row, int col) {
         for( int r = 0; r < row; r++){
            for( int c = 0; c < col ; c++){
                if(r==0 || c==0 || r==row-1 || c==col-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
           
        }
                
    }

    /**
     * Fill this in
     * @param args
     */
    public static void checkers(int row, int col) {
        for( int r = 0; r < row; r++){
            for( int c = 0; c < col ; c++){
                if((r+c)%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
           
        }

    }

    // Create the remaining methods and JavaDocs below

    /**
     * This is the main method which I used
     * for testing each of the above methods.
     * @return Nothing.
     */

    public static void hollowDiamond(int side){
        for( int r = 0; r < 2*side-1; r++){
            for( int c = 0; c < 2*side-1; c++){
                if((r+c)%(2*(side-1)) == side -1 || (Math.abs(r-c) == side-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
           
    }
}


    public static void main(String[] args) {
        //pyramid(4);
        //invertedPyramid(8);
        //box(4,5);
        //triangle(3);
        //reverseTri(4);
        //hollowBox(3, 4);
        hollowDiamond(5);
        checkers(4, 3);
        
    }
}