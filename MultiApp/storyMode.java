import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;


public class storyMode{
    public static void main(String[] args) {

    }
    static int count = 0;

    static void mainCaller(){

    }
    public static void story1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        multiApp.typeWriterEffectColored("To progress the story, press enter when the app says 'Press enter to continue'. Don't spam the enter or it will break the app!", "cyan");
        System.out.println("\n");
        System.out.println("\n");
        multiApp.sleepTime(2000);
        multiApp.typeWriterEffectColored("It's been days since the sacking of Mortidorr, a small village in the Yalore Kingdom.", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("the once peaceful village was sacked utterly by the goblins of the east.", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("the village now is rebuilding, but the constant fear of the raiders are always there in people's mind.", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("While all this is happening, the capital is still feuding with another goblin lords.", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("'We can't spare no one!' is the only response we'll ever get...", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("The village now had enough. They need someone to step in.", "cyan");
        multiApp.printColored("\nPress enter to continue!", "white");
        br.readLine();
        multiApp.typeWriterEffectColored("A protector...", "red");
        multiApp.sleepTime(1000);
        multiApp.typeWriterEffectColored("A Warrior...", "red");
        multiApp.sleepTime(1000);
        multiApp.typeWriterEffectColored("A Hero...", "red");
        System.out.println("\n");
        multiApp.printColored("\nPress enter to continue!", "white");

    }
}


