
/**
 * A program to read a file with raw data from a Keirsey personality test
 * and print out the results.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class Personality {

    // Add your constants here.

    // The main method to process the data from the personality tests
    /**
     *  The Main controls the printing and formatting utilizing the methods.
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // do not make any other Scanners connected to System.in
        Scanner fileScanner = getFileScanner(keyboard);

        int numNames = Integer.parseInt(fileScanner.nextLine());
        for (int i = 0; i < numNames; i++) {
            String name = fileScanner.nextLine();
            String data = fileScanner.nextLine();
            String[] numArr = makeArray(data);
            double[] dblPercent = getPercent(numArr);
            System.out.printf("%30s:", name);
            for (int p = 0; p < 4; p++) {
                if (dblPercent[p] == -1.0) {
                    System.out.printf("%11s", "NO ANSWERS ");
                } else {
                    System.out.printf("%11s", (int) (dblPercent[p] + .5) + " ");
                }
            }
            System.out.println("= " + getType(dblPercent));

        }

        fileScanner.close();
        keyboard.close();
    }

    // Add your methods here
    /*
    * @param letters
    * Letters is sorted through using a for loop and added into a string array.
    */
    public static String[] makeArray(String letters) {
        String[] data = new String[70];
        for (int i = 0; i < letters.length(); i++) {
            data[i] = letters.toUpperCase().substring(i, i + 1);
        }
        return data;

    }
    /*
    *@param characters 
    * characters is sorted through and sorts questions using mod, and multiple for loops to give percentages of B's answered.
    */
    public static double[] getPercent(String[] characters) {
        double extACount = 0;
        double sensACount = 0;
        double thiACount = 0;
        double judgACount = 0;
        double total = 0;
        double[] percentArr = new double[4];
        for (int i = 0; i < 70; i++) {
            if (i % 7 == 0) {
                if (characters[i].equals("B")) {
                    extACount++;
                    total++;
                } else if (characters[i].equals("A")) {
                    total++;
                }
            }

        }
        if (total == 0) {
            percentArr[0] = -1.0;
        } else {
            percentArr[0] = (extACount / total) * 100;
            ;
            total = 0;
        }
        for (int i = 0; i < 70; i++) {
            if (i % 7 == 1 || i % 7 == 2) {
                if (characters[i].equals("B")) {
                    sensACount++;
                    total++;
                } else if (characters[i].equals("A")) {
                    total++;
                }
            }
        }
        if (total == 0) {
            percentArr[1] = -1.0;
        } else {
            percentArr[1] = (sensACount / total) * 100;
            total = 0;
        }
        for (int i = 0; i < 70; i++) {
            if (i % 7 == 3 || i % 7 == 4) {
                if (characters[i].equals("B")) {
                    thiACount++;
                    total++;
                } else if (characters[i].equals("A")) {
                    total++;
                }
            }
        }
        if (total == 0) {
            percentArr[2] = -1.0;
        } else {
            percentArr[2] = (thiACount / total) * 100;
            total = 0;
        }
        for (int i = 0; i < 70; i++) {
            if (i % 7 == 5 || i % 7 == 6) {
                if (characters[i].equals("B")) {
                    judgACount++;
                    total++;
                } else if (characters[i].equals("A")) {
                    total++;
                }
            }
        }
        if (total == 0) {
            percentArr[3] = -1.0;
        } else {
            percentArr[3] = (judgACount / total) * 100;
        }
        return percentArr;

    }
    /*
    *@param percent
    * sorts through the double array and based on the numbers given decides if it is a personality, even, or a "-".
    */
    public static String getType(double[] percent) {
        String type = "";
        // dont need the for loop each segment is its own action

        if (percent[0] > 50) {
            type += "I";
        } else if (percent[0] == 50) {
            type += "X";
        } else if (percent[0] == -1.0) {
            type += "-";
        } else {
            type += "E";
        }
        if (percent[1] > 50) {
            type += "N";
        } else if (percent[1] == 50) {
            type += "X";
        } else if (percent[1] == -1.0) {
            type += "-";
        } else {
            type += "S";
        }
        if (percent[2] > 50) {
            type += "F";
        } else if (percent[2] == 50) {
            type += "X";
        } else if (percent[2] == -1.0) {
            type += "-";
        } else {
            type += "T";
        }
        if (percent[3] > 50) {
            type += "P";
        } else if (percent[3] == 50) {
            type += "X";
        } else if (percent[3] == -1.0) {
            type += "-";
        } else {
            type += "J";
        }
        return type;

    }

    /**
     * Method to choose a file. Asks user for name of file. If file not found create
     * a Scanner hooked up to a dummy set of data
     */
    public static Scanner getFileScanner(Scanner keyboard) {
        Scanner result = null;
        try {
            System.out.print("Enter the name of the file with the personality data: ");
            String fileName = keyboard.nextLine().trim();
            System.out.println();
            result = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Problem creating Scanner: " + e);
            System.out.println("Creating Scanner hooked up to default data " + e);
            String defaultData = "1\nDEFAULT DATA\n" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                    + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            result = new Scanner(defaultData);
        }
        return result;
    }
}
