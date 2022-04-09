import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Tests {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.out.println("Hello again!");
        multiApp.printColored("Test 1", "red");
        multiApp.printColored("Test 2", "cyan");
        multiApp.printColored("Test 3", "yellow");
        multiApp.printColored("Test 4", "green");
        multiApp.printColored("Test 5", "white");
        System.out.println("Test this" + ANSI_RESET);
        System.out.println(ANSI_RESET + "Test this double" + ANSI_RESET);

        String [] namaNama = new String[5];
        namaNama[0] = "Hick";
        namaNama[2] = "Jobby";
        namaNama[1] = "hiccock";
        namaNama[3] = "Damien";

        System.out.println("\nThe music should start now!");





    }





    public static String sectionChecker = "GUITest Menu";
    public static String bugChecker = "no";
    public static Scanner entryScanner = new Scanner(System.in);
    public static Scanner goBackScan = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String RESET = "\033[0m";  // Text Reset



    // Regular Colors

    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static void typeWriterEffect(String text){
        int i;
        for(i = 0; i < text.length(); i ++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(40);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}
