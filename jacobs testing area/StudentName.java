public class StudentName {

    public static String whatStudent(int StudentName) {
        String students = "Alex Rachel Andres Helena Christian Sean Kyle Jacob Aaron Egor Devin Marlena Claudia Wesley";
        int Spaceindex = -1;
        int Nameindex = 0;
        int numberSpaces = 0;

        if (StudentName <= 0 || StudentName > 14 ) {
            return null;
        }
        while (numberSpaces < StudentName) {
            Nameindex = Spaceindex+1;
            Spaceindex = students.indexOf(" ",Nameindex);
            numberSpaces ++;
        }
        if( Spaceindex != -1) {
            return students.substring(Nameindex,Spaceindex);
        }
        else {
            return students.substring(Nameindex);
        }

    }

    public static void main(String[] args) {
        System.out.println(whatStudent(5)); 
    }
}