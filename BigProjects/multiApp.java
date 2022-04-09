import java.util.Random;
import java.util.Scanner;
import java.io.*;

/*
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
*/

public class multiApp {
    public static void main(String[] args) throws IOException{

        System.out.println("Loading...");
        for (int i = 0; i < 100; i++) {
            if (i == 10){
                typeWriterEffect("~~");
            }
            if (i == 20){
                typeWriterEffect("~~~~~");
            }
            if (i == 30){
                typeWriterEffect("~~~~~~~~~~~");
            }
            if (i == 40){
                typeWriterEffect("~~~~");
            }if (i == 50){
                typeWriterEffect("~~~~~~");
            }
            if (i == 60){
                typeWriterEffect("~~~~~~~~~~");
            }
            if (i == 80){
                typeWriterEffect("~~~~~~~~~~~~");
            }
        }
        sleepTime(500);
        System.out.println();
        typeWriterEffect("Loading Completed!");
        sleepTime(1000);
        System.out.println("\n");
        typeWriterEffect("For the best experience, open the console in a big size!");
        sleepTime(2000);
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------");
        typeWriterEffectColored("Welcome to MultiApp! (V 0.0.1.7 'The Colorful Update')", "cyan");
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        sleepTime(500);
        System.out.println("\n");
        musicPlayer t1=new musicPlayer();
        t1.start();
        sectionChecker = "main menu";

        while (sectionChecker.equalsIgnoreCase("main menu")) {

            typeWriterEffectColored("Now, choose which app that you would use! (Type the app name, Ex: calculator, etc.)", "cyan");
            System.out.println("\n");
            sleepTime(500);
            typeWriterEffectColored("Currently we have Calculator, Story Mode, Fun Town and Other (WIP).", "cyan");
            System.out.println("\n");
            sleepTime(500);
            System.out.println("But, if you want to close the app, type 'close'");
            System.out.println("\n");
            System.out.println("Note: Uppercase/lowercase doesn't matter just don't do typo and don't forget the spaces!");
            System.out.println("\n");
            typeWriterEffect("Your input : ");
            String appTypeChoose = entryScanner.nextLine();
            System.out.println("\n");

            if (appTypeChoose.equalsIgnoreCase("calculator")) {
                sectionChecker = "calculator";
                while (sectionChecker.equalsIgnoreCase("calculator")) {
                    Scanner introScanner = new Scanner(System.in);
                    Scanner numberScanner = new Scanner(System.in);
                    System.out.println("\n");
                    typeWriterEffectColored("Welcome to the calculator section! Please type the desired calculator for you to use!", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("Right now we have Math, Age, Physics, Advanced Maths, and Other.", "cyan");
                    System.out.println("\n");
                    System.out.println("Or if you want to go back, type 'back'");
                    System.out.println("\n");
                    typeWriterEffect("Your input : ");
                    String calculatorTypeChoose = introScanner.nextLine();

                    if (calculatorTypeChoose.equalsIgnoreCase("math")) {
                        sectionChecker = "math";
                        while (sectionChecker.equalsIgnoreCase("math")) {
                            System.out.println("\n");
                            typeWriterEffectColored("Alright, now we're on the Math Calculator. now choose what answer type do you want", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("Choose between whole number or float number !","cyan");
                            System.out.println("\n");
                            System.out.println("Or if you want to go back, type 'back'");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            String mathNumberTypeChoose = introScanner.nextLine();

                            if (mathNumberTypeChoose.equalsIgnoreCase("whole")) {
                                sectionChecker = "whole";
                                while (sectionChecker.equalsIgnoreCase("whole")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("Okay, we'll print the result in whole number. Now, choose the operation that you want!", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("Choose between Addition (+),Subtraction (-), Multiplication (*), Division (/) or Modulo (%)", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("(Type the formula that you want or the symbol of it, Ex : Addition or +)","cyan");
                                    System.out.println("\n");
                                    System.out.println("Or if you want to go back, type 'back'");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    String operationTypeChoose = introScanner.nextLine();

                                    if (operationTypeChoose.equalsIgnoreCase("addition") || operationTypeChoose.equals("+")) {
                                        sectionChecker = "+";
                                        while (sectionChecker.equalsIgnoreCase("+")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the addition part. Please type the first number!", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int firstNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int secondNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            int additionResult = calculator.twoWholeNumberAddition(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + additionResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("whole");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("subtraction") || operationTypeChoose.equals("-")) {
                                        sectionChecker = "-";
                                        while (sectionChecker.equalsIgnoreCase("-")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the subtraction part. Please type the first number!", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int firstNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int secondNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            int subtractionResult = calculator.twoWholeNumberSubstraction(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + subtractionResult,"cyan");
                                            sleepTime(500);
                                            doAgainAsk("whole");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("multiplication") || operationTypeChoose.equals("*")) {
                                        sectionChecker = "*";
                                        while (sectionChecker.equalsIgnoreCase("*")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the multiplication part. Please type the first number!", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int firstNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int secondNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            int multiplicationResult = calculator.twoWholeNumberMultiplication(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + multiplicationResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("whole");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("division") || operationTypeChoose.equals("/")) {
                                        sectionChecker = "/";
                                        while (sectionChecker.equalsIgnoreCase("/")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the division part. Please type the first number!", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int firstNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int secondNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            int divisionResult = calculator.twoWholeNumberDivision(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + divisionResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("whole");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("modulo") || operationTypeChoose.equals("%")) {
                                        sectionChecker = "%";
                                        while (sectionChecker.equalsIgnoreCase("%")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the modulo/remainder part. Please type the first number!", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int firstNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            int secondNumber = numberScanner.nextInt();
                                            System.out.println("\n");
                                            int moduloResult = calculator.twoWholeNumberModulo(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + moduloResult,"cyan");
                                            sleepTime(500);
                                            doAgainAsk("whole");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("back")) {
                                        sectionChecker = "math";
                                        sleepTime(500);
                                        System.out.println("\n");
                                    } else inputFailed();
                                }
                            } else if (mathNumberTypeChoose.equalsIgnoreCase("float")) {
                                sectionChecker = "float";
                                while (sectionChecker.equalsIgnoreCase("float")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("Okay, we'll print the result in float number. Now, choose the operation that you want!", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("Choose between Addition (+),Subtraction (-), Multiplication (*), or Division (/)", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("(Type the formula that you want or the symbol of it, Ex : Addition or +)", "cyan");
                                    System.out.println("\n");
                                    System.out.println("Or if you want to go back, type 'back'");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    String operationTypeChoose = introScanner.nextLine();

                                    if (operationTypeChoose.equalsIgnoreCase("addition") || operationTypeChoose.equals("+")) {
                                        sectionChecker = "+";
                                        while (sectionChecker.equalsIgnoreCase("+")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the addition part. Please type the first number!", "cyan");
                                            System.out.println("\n");
                                            typeWriterEffectColored("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float firstNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float secondNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            float additionResult = calculator.twoFloatNumberAddition(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + additionResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("float");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("subtraction") || operationTypeChoose.equals("-")) {
                                        sectionChecker = "-";
                                        while (sectionChecker.equalsIgnoreCase("-")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the subtraction part. Please type the first number!", "cyan");
                                            System.out.println("\n");
                                            typeWriterEffectColored("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float firstNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float secondNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            float subtractionResult = calculator.twoFloatNumberSubstraction(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + subtractionResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("float");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("multiplication") || operationTypeChoose.equals("*")) {
                                        sectionChecker = "*";
                                        while (sectionChecker.equalsIgnoreCase("*")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("This is the multiplication part. Please type the first number!", "cyan");
                                            System.out.println("\n");
                                            typeWriterEffectColored("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float firstNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float secondNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            float multiplicationResult = calculator.twoFloatNumberMultiplication(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + multiplicationResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("float");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("division") || operationTypeChoose.equals("/")) {
                                        sectionChecker = "/";
                                        while (sectionChecker.equalsIgnoreCase("/")) {
                                            typeWriterEffectColored("This is the division part. Please type the first number!", "cyan");
                                            System.out.println("\n");
                                            typeWriterEffectColored("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float firstNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Now please type the second number", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float secondNumber = numberScanner.nextFloat();
                                            System.out.println("\n");
                                            float divisionResult = calculator.twoFloatNumberDivision(firstNumber, secondNumber);
                                            typeWriterEffectColored("The result is : " + divisionResult, "cyan");
                                            sleepTime(500);
                                            doAgainAsk("float");
                                        }
                                    } else if (operationTypeChoose.equalsIgnoreCase("back")) {
                                        sectionChecker = "math";
                                        sleepTime(500);
                                        System.out.println("\n");
                                    } else inputFailed();
                                }
                            } else if (mathNumberTypeChoose.equalsIgnoreCase("back")) {
                                sectionChecker = "calculator";
                                sleepTime(500);
                                System.out.println("\n");
                            } else inputFailed();
                        }
                    } else if (calculatorTypeChoose.equalsIgnoreCase("age")) {
                        sectionChecker = "age";
                        while (sectionChecker.equalsIgnoreCase("age")) {
                            System.out.println("\n");
                            typeWriterEffectColored("Alright, now we're on the Age Calculator. now choose what calculator type do you want", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("Choose between Current Age or Birth Year !", "cyan");
                            System.out.println("\n");
                            System.out.println("Or if you want to go back, type 'back'");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            String ageTypeChoose = introScanner.nextLine();

                            if (ageTypeChoose.equalsIgnoreCase("current age")) {
                                sectionChecker = "current age";
                                while (sectionChecker.equalsIgnoreCase("current age")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("This is the current age part. Please type the year you're born!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    int yearBorn = introScanner.nextInt();
                                    System.out.println("\n");
                                    int currentAge = calculator.currentAgeCalculator(yearBorn);
                                    System.out.println("Your current age is : " + currentAge);
                                    sleepTime(500);
                                    if (currentAge < 0){
                                        System.out.println("\n");
                                        typeWriterEffectColored("Whoa! Hello there time traveler!", "green");
                                    } else if (currentAge > 80){
                                        System.out.println("\n");
                                        typeWriterEffectColored("How fare your day, old timer ?", "white");
                                    }
                                    doAgainAsk("age");
                                }
                            } else if (ageTypeChoose.equalsIgnoreCase("birth year")) {
                                sectionChecker = "birth year";
                                while (sectionChecker.equalsIgnoreCase("birth year")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("This is the birth year part. Please type your age!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    int currentAge = introScanner.nextInt();
                                    System.out.println("\n");
                                    System.out.println("Your birth year is : " + calculator.birthYearCalculator(currentAge));
                                    sleepTime(500);
                                    doAgainAsk("age");
                                }
                            } else if (ageTypeChoose.equalsIgnoreCase("back")) {
                                sectionChecker = "calculator";
                                sleepTime(500);
                                System.out.println("\n");
                            } else inputFailed();
                        }
                    } else if (calculatorTypeChoose.equalsIgnoreCase("advanced maths")) {
                        sectionChecker = "advanced maths";
                        while (sectionChecker.equalsIgnoreCase("advanced maths")) {
                            System.out.println("\n");
                            typeWriterEffectColored("Alright, now we're on the Advanced Maths Calculator. Now choose what formula do you want to calculate!", "black");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("Currently we have:", "cyan");
                            System.out.println("\n");
                            System.out.println("1. Distance Between Two Dots Formula");
                            System.out.println("\n");
                            sleepTime(500);
                            System.out.println("Note: write the number! Ex : Distance Between Two Dots is 1, etc.");
                            System.out.println("\n");
                            System.out.println("Or if you want to go back, type '0'");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            int formulaTypeChoose = introScanner.nextInt();

                            if (formulaTypeChoose == 1) {
                                sectionChecker = "1";
                                while (sectionChecker.equalsIgnoreCase("1")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now we're at the Distance Between Two Dots formula.", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("In this formula, we have x1, x2, y1, and y2. All can be written with decimals (use (.) Ex: 1.3)", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("The basic formula of this is square root((x2 - x1)^2 + (y2 - y1)^2)", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("Now, type the x1!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    double theX1 = introScanner.nextDouble();
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now, type the y1!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    double theY1 = introScanner.nextDouble();
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now, type the x2!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    double theX2 = introScanner.nextDouble();
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now, type the y2!", "cyan");
                                    System.out.println();
                                    System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    double theY2 = introScanner.nextDouble();
                                    System.out.println("\n");
                                    System.out.println("The distance is " + calculator.distanceBetweenTwoDots(theX1, theY1, theX2, theY2));
                                    sleepTime(500);
                                    doAgainAsk("advanced maths");
                                }
                            } else if (formulaTypeChoose == 0) {
                                sectionChecker = "calculator";
                                sleepTime(500);
                                System.out.println("\n");
                            } else inputFailed();
                        }

                    } else if (calculatorTypeChoose.equalsIgnoreCase("physics")) {
                        sectionChecker = "physics";
                        while (sectionChecker.equalsIgnoreCase("physics")) {
                            System.out.println("\n");
                            typeWriterEffectColored("Alright, now we're on the Physics Calculator. Now choose what formula do you want to calculate!", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("Currently we have:", "cyan");
                            System.out.println("\n");
                            System.out.println("1. Distance Speed Time formula");
                            System.out.println("\n");
                            System.out.println("2. Force Mass Acceleration formula");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffect("Note: Type the number of the formula you want! Ex: 1 for Distance Speed Time, etc");
                            System.out.println("\n");
                            System.out.println("Or if you want to go back, type '0'");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            int formulaTypeChoose = introScanner.nextInt();

                            if (formulaTypeChoose == 1) {
                                sectionChecker = "1";
                                while (sectionChecker.equalsIgnoreCase("1")) {
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now we're at the Distance Speed Time formula.", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("In this formula, we have Distance (s), Speed(v), and Time(t). All can be written with decimals (use (.) Ex: 1.3", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("The basic formula of this is s = v . t", "cyan");
                                    System.out.println("\n");
                                    sleepTime(500);
                                    typeWriterEffectColored("Now, Choose which unit/measure you want to calculate! (type 'Distance' or the others)", "cyan");
                                    System.out.println("\n");
                                    System.out.println("Or if you want to go back, type 'back'");
                                    System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                    String unitTypeChoose = introScanner.nextLine();

                                    if (unitTypeChoose.equalsIgnoreCase("distance")) {
                                        sectionChecker = "distance";
                                        while (sectionChecker.equalsIgnoreCase("distance")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("So, we're trying to find the Distance. Please first type the Speed in meter/second", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float speed = introScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Good, now please type the Time in seconds", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float time = introScanner.nextFloat();
                                            System.out.println("\n");
                                            System.out.println("The Distance is " + calculator.physicsDistanceOne(speed, time) + " m");
                                            sleepTime(500);
                                            doAgainAsk("1");
                                        }
                                    } else if (unitTypeChoose.equalsIgnoreCase("speed")) {
                                        sectionChecker = "speed";
                                        while (sectionChecker.equalsIgnoreCase("speed")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("So, we're trying to find the Speed. Please first type the Distance in meters", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float distance = introScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Good, now please type the Time in seconds", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float time = introScanner.nextFloat();
                                            System.out.println("\n");
                                            System.out.println("The Speed is " + calculator.physicsSpeedOne(distance, time) + " m/s");
                                            sleepTime(500);
                                            doAgainAsk("1");
                                        }
                                    } else if (unitTypeChoose.equalsIgnoreCase("time")) {
                                        sectionChecker = "time";
                                        while (sectionChecker.equalsIgnoreCase("time")) {
                                            System.out.println("\n");
                                            typeWriterEffectColored("So, we're trying to find the Time. Please first type the Distance in meters", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float distance = introScanner.nextFloat();
                                            System.out.println("\n");
                                            typeWriterEffectColored("Good, now please type the Speed in meter/second", "cyan");
                                            System.out.println();
                                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                            System.out.println("\n");
                                            typeWriterEffect("Your input : ");
                                            float speed = introScanner.nextFloat();
                                            System.out.println("\n");
                                            System.out.println("The Time is " + calculator.physicsTimeOne(distance, speed) + " s");
                                            sleepTime(500);
                                            doAgainAsk("1");
                                        }
                                    } else if (unitTypeChoose.equalsIgnoreCase("back")) {
                                        sectionChecker = "physics";
                                        sleepTime(500);
                                        System.out.println("\n");
                                    } else inputFailed();
                                }
                            } else if (formulaTypeChoose == 2) {
                                sectionChecker = "2";
                                while (sectionChecker.equalsIgnoreCase("2")){
                                    System.out.println("\n");
                                    typeWriterEffectColored("Now we're at the Force Mass Acceleration formula.", "cyan");
                                    sleepTime(500);
                                System.out.println("\n");
                                typeWriterEffectColored("In this formula, we have Force (F), Mass(m), and Acceleration(a). All can be written with decimals (use (.) Ex: 1.3)", "cyan");
                                    sleepTime(500);
                                System.out.println("\n");
                                typeWriterEffectColored("The basic formula of this is F = m . a", "cyan");
                                    sleepTime(500);
                                System.out.println("\n");
                                typeWriterEffectColored("Now, Choose which unit/measure you want to calculate! (type 'Force' or the others).", "cyan");
                                System.out.println("\n");
                                    System.out.println("Or if you want to go back, type 'back'");
                                System.out.println("\n");
                                    typeWriterEffect("Your input : ");
                                String unitTypeChoose = introScanner.nextLine();

                                if (unitTypeChoose.equalsIgnoreCase("force")) {
                                    sectionChecker = "force";
                                    while (sectionChecker.equalsIgnoreCase("force")) {
                                        System.out.println("\n");
                                        typeWriterEffectColored("So, we're trying to find the Force. Please first type the Mass in Kilogram", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float mass = introScanner.nextFloat();
                                        System.out.println("\n");
                                        typeWriterEffectColored("Good, now please type the Acceleration in m/s^2", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float acceleration = introScanner.nextFloat();
                                        System.out.println("\n");
                                        System.out.println("The Force is " + calculator.physicsForceTwo(mass, acceleration) + " N");
                                        sleepTime(500);
                                        doAgainAsk("2");
                                    }
                                } else if (unitTypeChoose.equalsIgnoreCase("mass")) {
                                    sectionChecker = "mass";
                                    while (sectionChecker.equalsIgnoreCase("mass")) {
                                        System.out.println("\n");
                                        typeWriterEffectColored("So, we're trying to find the Mass. Please first type the Force in Newton", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float force = introScanner.nextFloat();
                                        System.out.println("\n");
                                        typeWriterEffectColored("Good, now please type the Acceleration in m/s^2", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float acceleration = introScanner.nextFloat();
                                        System.out.println("\n");
                                        System.out.println("The Mass is " + calculator.physicsMassTwo(force, acceleration) + " Kg");
                                        sleepTime(500);
                                        doAgainAsk("2");
                                    }
                                } else if (unitTypeChoose.equalsIgnoreCase("acceleration")) {
                                    sectionChecker = "acceleration";
                                    while (sectionChecker.equalsIgnoreCase("acceleration")) {
                                        System.out.println("\n");
                                        typeWriterEffectColored("So, we're trying to find the Acceleration. Please first type the Force in Newton", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float force = introScanner.nextFloat();
                                        System.out.println("\n");
                                        typeWriterEffectColored("Good, now please type the Mass in Kilogram", "cyan");
                                        System.out.println();
                                        System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                                        System.out.println("\n");
                                        typeWriterEffect("Your input : ");
                                        float mass = introScanner.nextFloat();
                                        System.out.println("\n");
                                        System.out.println("The Acceleration is " + calculator.physicsAccelerationTwo(force, mass) + " m/s^2");
                                        sleepTime(500);
                                        doAgainAsk("2");
                                    }
                                } else if (unitTypeChoose.equalsIgnoreCase("back")) {
                                    sectionChecker = "physics";
                                    sleepTime(500);
                                    System.out.println("\n");
                                } else inputFailed();
                                }
                            } else if (formulaTypeChoose == 0) {
                                sectionChecker = "calculator";
                                sleepTime(500);
                                System.out.println("\n");
                            } else inputFailed();
                        }

                    } else if (calculatorTypeChoose.equalsIgnoreCase("other")) {
                        sectionChecker = "other";
                        while (sectionChecker.equalsIgnoreCase("other")) {
                            System.out.println("\n");
                            typeWriterEffectColored("you choose the other, which is still empty... sorry for that :(", "cyan");
                            sectionChecker = "calculator";
                            System.out.println("\n");
                            sleepTime(500);
                        }
                    } else if (calculatorTypeChoose.equalsIgnoreCase("back")) {
                        sectionChecker = "main menu";
                        System.out.println("\n");
                        sleepTime(500);
                    } else inputFailed();
                }

            } else if (appTypeChoose.equalsIgnoreCase("story mode")) {
                sectionChecker = "story mode";
                while (sectionChecker.equalsIgnoreCase("story mode")) {
                    System.out.println("\n");
                    typeWriterEffectColored("Welcome to Story Mode!", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("This app is an interactive story telling app that lets its user to choose how the story develops.", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("While playing with the story, you will be able to choose some decisions which will ultimately shape your path in the end.", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("-----------------------------------------------------------", "cyan");
                    System.out.println("\n");
                    typeWriterEffectColored("Currently we have 2 Story Options", "cyan");
                    System.out.println("\n");
                    printColored("1. Knight of Yalore: Forest of the Watchers (WIP)", "green");
                    System.out.println("\n");
                    printColored("2. A Boy and the Wolf (WIP)", "green");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("Choose which story you want to play!", "cyan");
                    System.out.println();
                    System.out.println("Note: write the number without the dot! Ex: type '2' for A boy and the Wolf story");
                    System.out.println("\n");
                    System.out.println("Or if you want to go back, type '0'");
                    System.out.println("\n");
                    typeWriterEffect("Your input : ");
                    int storyOptionChoose = numScanner.nextInt();

                    if (storyOptionChoose == 1) {
                        sectionChecker = "1";
                        while (sectionChecker.equalsIgnoreCase("1"))  {
                            System.out.println("\n");
                            typeWriterEffect("If you want to go back, type 'back'.");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("You've chosen Knight of Yalore: Forest of the Watchers", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            storyMode.story1();
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            String decisionMaker = entryScanner.nextLine();
                            if (decisionMaker.equalsIgnoreCase("back")){
                                sectionChecker = "story mode";
                                sleepTime(500);
                                System.out.println("\n");
                            }
                        }
                    } else if (storyOptionChoose == 2) {
                        sectionChecker = "2";
                        while (sectionChecker.equalsIgnoreCase("2")) {
                            System.out.println("\n");
                            typeWriterEffect("If you want to go back, type 'back'.");
                            sleepTime(500);
                            System.out.println("\n");
                            typeWriterEffectColored("You've chosen A Boy and the Wolf", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffect("Sorry it's still WIP, just type 'back'");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            String decisionMaker = entryScanner.nextLine();
                            if (decisionMaker.equalsIgnoreCase("back")){
                                sectionChecker = "story mode";
                                sleepTime(500);
                                System.out.println("\n");
                            }
                        }
                    } else if (storyOptionChoose == 0){
                        sectionChecker = "main menu";
                        System.out.println("\n");
                        sleepTime(500);
                    } else inputFailed();
                }

            } else if (appTypeChoose.equalsIgnoreCase("fun town")) {
                sectionChecker = "fun town";
                while (sectionChecker.equalsIgnoreCase("fun town")) {
                    System.out.println("\n");
                    typeWriterEffectColored("welcome to Fun Town!", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("This is a town full of fun things for you to try!", "cyan");
                    System.out.println("\n");
                    sleepTime(500);
                    typeWriterEffectColored("Currently we have:", "cyan");
                    System.out.println("\n");
                    System.out.println("1. Fun Facts");
                    System.out.println("\n");
                    System.out.println("2. Art Of Java");
                    System.out.println("\n");
                    System.out.println("3. Random Number Generator");
                    sleepTime(500);
                    System.out.println("\n");
                    typeWriterEffectColored("Simply type the number for the one you want to try!", "cyan");
                    System.out.println("\n");
                    System.out.println("Or if you want to go back, type '0'");
                    System.out.println("\n");
                    typeWriterEffect("Your input : ");
                    int funTypeChoose = numScanner.nextInt();

                    if (funTypeChoose == 1) {
                        sectionChecker = "1";
                        System.out.println("\n");
                        typeWriterEffectColored("You've chosen Fun Facts!", "cyan");
                        System.out.println("\n");
                        typeWriterEffect("If you want to go back, type 'back'.");
                        while (sectionChecker.equalsIgnoreCase("1")) {
                            sleepTime(500);
                            System.out.println("\n");
                            typeWriterEffectColored("type 'yes' to generate your fun fact now!", "cyan");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            String decisionMaker = entryScanner.nextLine();
                            if (decisionMaker.equalsIgnoreCase("yes")){
                                int randFunFact = rand1.nextInt(70);
                                System.out.println("\n");
                                funTown.facts1(randFunFact);
                            } else if(decisionMaker.equalsIgnoreCase("back")){
                                sectionChecker = "fun town";
                                sleepTime(500);
                                System.out.println("\n");
                            }
                        }
                    } else if (funTypeChoose == 2) {
                        sectionChecker = "2";
                        while (sectionChecker.equalsIgnoreCase("2")) {
                            System.out.println("\n");
                            typeWriterEffectColored("You've chosen Art of Java", "cyan");
                            System.out.println("\n");
                            sleepTime(500);
                            typeWriterEffectColored("Currently we have", "cyan");
                            System.out.println("\n");
                            System.out.println("1. Zigzag");
                            System.out.println("\n");
                            System.out.println("2. Big Zigzag");
                            System.out.println("\n");
                            System.out.println("3. Square");
                            System.out.println("\n");
                            System.out.println("4. Rectangle");
                            System.out.println("\n");
                            System.out.println("Or if you want to go back, type '0'");
                            System.out.println("\n");
                            while (sectionChecker.equalsIgnoreCase("2")) {
                                typeWriterEffectColored("Simply type the number for the one you want to try!", "cyan");
                                System.out.println("\n");
                                typeWriterEffect("Your input : ");
                                int decisionMaker = entryScanner.nextInt();
                                if (decisionMaker == 1) {
                                    funTown.zigzagArt();
                                } else if (decisionMaker == 2){
                                    funTown.doubleZigzagArt();
                                } else if(decisionMaker == 3){
                                    funTown.squareArt();
                                } else if (decisionMaker == 4){
                                    funTown.rectangleArt();
                                } else if (decisionMaker == 0) {
                                    sectionChecker = "fun town";
                                    sleepTime(500);
                                    System.out.println("\n");
                                }
                            }
                        }
                    } else if(funTypeChoose == 3){
                        sectionChecker = "3";
                        System.out.println("\n");
                        typeWriterEffectColored("You've chosen Random Number Generator", "cyan");
                        System.out.println("\n");
                        sleepTime(500);
                        typeWriterEffect("If you want to go back, type 'back'.");
                        while (sectionChecker.equalsIgnoreCase("3")) {
                            sleepTime(500);
                            System.out.println("\n");
                            typeWriterEffectColored("First, we need to make the range of the random number!", "cyan");
                            System.out.println("\n");
                            typeWriterEffectColored("type the minimum number of the random number! ", "cyan");
                            System.out.println();
                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            int theMin = entryScanner.nextInt();
                            typeWriterEffectColored("Good!, now type the maximum number of the random number! ", "cyan");
                            System.out.println();
                            System.out.println("Note: Do Not type 'Back'/ any other words. Only type numbers!");
                            System.out.println("\n");
                            typeWriterEffect("Your input : ");
                            int theMax = entryScanner.nextInt();
                            System.out.println("Your Random number is " + funTown.randomNumberGen(theMin, theMax));
                            doAgainAsk("fun town");

                        }
                    }
                    else if (funTypeChoose == 0){
                        sectionChecker = "main menu";
                        System.out.println("\n");
                        sleepTime(500);
                    } else inputFailed();
                }
            } else if (appTypeChoose.equalsIgnoreCase("other")) {
                typeWriterEffect("welcome to Other WIP!");
                sleepTime(500);
                System.out.println();
                typeWriterEffect("Sorry, this app is still WIP (Work in Progress");
                sleepTime(500);
                sectionChecker = "main menu";
                System.out.println("\n");
            } else if (appTypeChoose.equalsIgnoreCase("close")){
                sectionChecker = "";
                typeWriterEffectColored("Thank you for playing my Multi App!", "cyan");
                sleepTime(1000);
                System.out.println("\n");
                typeWriterEffectColored("This Project was first made for the dev to train his skills", "cyan");
                sleepTime(500);
                System.out.println();
                typeWriterEffectColored("[15/7/2021]", "cyan");
                System.out.println("\n");
                sleepTime(2000);
                typeWriterEffectColored("Once again, Thank you very much for playing and supporting the dev", "cyan");
                System.out.println("\n");
                sleepTime(500);
                typeWriterEffectColored("> Hilmi G (Lead Dev)", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("Special Thanks for :", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("> God", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("> Mom, Dad, my Family", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("> Faris (helped me coding and testing)", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("> Sulthan (helped me testing)", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("And all of you that supported me", "cyan");
                sleepTime(500);
                System.out.println("\n");
                typeWriterEffectColored("See you all next time! Have a good day!", "cyan");
                System.out.println("\n");
                System.exit(0);
            } else
                inputFailed();
        }
    }
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
    } public static void typeWriterEffectColored(String text, String color) {
        int i;
        String textColor;
        if (color.equalsIgnoreCase("red")) {
            textColor = ANSI_RED;
        } else if (color.equalsIgnoreCase("black")) {
            textColor = ANSI_BLACK;
        } else if (color.equalsIgnoreCase("green")) {
            textColor = ANSI_GREEN;
        } else if (color.equalsIgnoreCase("yellow")) {
            textColor = ANSI_YELLOW;
        } else if (color.equalsIgnoreCase("blue")) {
            textColor = ANSI_BLUE;
        } else if (color.equalsIgnoreCase("purple")) {
            textColor = ANSI_PURPLE;
        } else if (color.equalsIgnoreCase("cyan")) {
            textColor = ANSI_CYAN;
        } else if (color.equalsIgnoreCase("random")){
            int randomColor = rand1.nextInt(4);
            if (randomColor == 0){
                textColor = ANSI_RED;
            } else if(randomColor == 1){
                textColor = ANSI_CYAN;
            } else if(randomColor == 2){
                textColor = ANSI_YELLOW;
            } else if(randomColor == 3){
                textColor = ANSI_GREEN;
            } else textColor = ANSI_WHITE;
        } else textColor = ANSI_WHITE;
        for(i = 0; i < text.length(); i ++){
            System.out.printf(textColor + "%c" + ANSI_RESET, text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void printColored(String text, String color){
        String textColor;
        if (color.equalsIgnoreCase("red")){
            textColor = ANSI_RED;
        } else if (color.equalsIgnoreCase("black")){
            textColor = ANSI_BLACK;
        } else if (color.equalsIgnoreCase("green")){
            textColor = ANSI_GREEN;
        } else if (color.equalsIgnoreCase("yellow")){
            textColor = ANSI_YELLOW;
        } else if (color.equalsIgnoreCase("blue")){
            textColor = ANSI_BLUE;
        } else if (color.equalsIgnoreCase("purple")){
            textColor = ANSI_PURPLE;
        } else if (color.equalsIgnoreCase("cyan")){
            textColor = ANSI_CYAN;
        } else if (color.equalsIgnoreCase("random")){
            int randomColor = rand1.nextInt(4);
            if (randomColor == 0){
                textColor = ANSI_RED;
            } else if(randomColor == 1){
                textColor = ANSI_CYAN;
            } else if(randomColor == 2){
                textColor = ANSI_YELLOW;
            } else if(randomColor == 3){
                textColor = ANSI_GREEN;
            } else textColor = ANSI_WHITE;
        }else textColor = ANSI_WHITE;
        System.out.println(textColor + text + ANSI_RESET);
    }
    public static void sleepTime(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    } public static void doAgainAsk(String section){
        System.out.println("\n");
        typeWriterEffectColored("Do you want to do it again ? or go back ?", "cyan");
        System.out.println("\n");
        sleepTime(500);
        System.out.println("Write 'yes' if you want to do it again. 'back' to go back");
        System.out.println("\n");
        typeWriterEffect("Your input : ");
        String goBackCheck = goBackScan.nextLine();
        if (goBackCheck.equalsIgnoreCase("back") || goBackCheck.equalsIgnoreCase("no")) {
            sectionChecker = section;
            sleepTime(500);
            System.out.println("\n");
        }
    }
    public static void inputFailed(){
        System.out.println("\n");
        typeWriterEffectColored("Sorry, the input didn't match anything. Please, try again!", "cyan");
        sleepTime(1000);
        System.out.println("\n");
    }
    public static String sectionChecker = "GUITest menu";
    public static Random rand1 = new Random();
    public static Scanner entryScanner = new Scanner(System.in);
    public static Scanner numScanner = new Scanner(System.in);
    public static Scanner goBackScan = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}

class musicPlayer extends Thread{
    public void run(){
        String filepath = "Finding Sanctuary.wav";
        Music musicObject = new Music();
        musicObject.playMusic(filepath);
    }
}

/*
unused / WIP (Work in Progress)
System.out.println(1);
        System.out.println(2);
        Scanner newScan = new Scanner(System.in);
        String testYes = newScan.nextLine();
        if(testYes == "yes"){
            cls();
        }

public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
 */
