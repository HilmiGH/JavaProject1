import java.time.LocalDate;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /*Scanner introScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        typeWriterEffect("Welcome to the calculator section! Please type the desired calculator for you to use!");
        System.out.println();
        typeWriterEffect("Right now we have Math, Age, Physics, Advanced Maths, and Other.");
        System.out.println();
        typeWriterEffect("Note: You must type the exact word or it will fail (its fine if you use uppercase or lowercase)");
        System.out.println();
        String calculatorTypeChoose = introScanner.nextLine();

        if (calculatorTypeChoose.equals("Math") || calculatorTypeChoose.equals("math")) {
            typeWriterEffect("Alright, now we're on the Math Calculator. now choose what answer type do you want");
            System.out.println();
            typeWriterEffect("Choose between whole number or float number !");
            System.out.println();
            String mathNumberTypeChoose = introScanner.nextLine();

            if (mathNumberTypeChoose.equals("Whole") || mathNumberTypeChoose.equals("whole")) {
                typeWriterEffect("Okay, we'll print the result in whole number. Now, choose the operation that you want!");
                System.out.println();
                typeWriterEffect("Choose between Addition,Subtraction, Multiplication, Division or Modulo");
                System.out.println();

                String operationTypeChoose = introScanner.nextLine();
                if (operationTypeChoose.equals("Addition") || operationTypeChoose.equals("addition")) {
                    typeWriterEffect("This is the addition part. Please type the first number!");
                    System.out.println();
                    int firstNumber = numberScanner.nextInt();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    int secondNumber = numberScanner.nextInt();
                    int additionResult = twoWholeNumberAddition(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + additionResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Subtraction") || operationTypeChoose.equals("subtraction")) {
                    typeWriterEffect("This is the subtraction part. Please type the first number!");
                    System.out.println();
                    int firstNumber = numberScanner.nextInt();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    int secondNumber = numberScanner.nextInt();
                    int substractionResult = twoWholeNumberSubstraction(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + substractionResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Multiplication") || operationTypeChoose.equals("multiplication")) {
                    typeWriterEffect("This is the multiplication part. Please type the first number!");
                    System.out.println();
                    int firstNumber = numberScanner.nextInt();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    int secondNumber = numberScanner.nextInt();
                    int multiplicationResult = twoWholeNumberMultiplication(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + multiplicationResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Division") || operationTypeChoose.equals("division")) {
                    typeWriterEffect("This is the division part. Please type the first number!");
                    System.out.println();
                    int firstNumber = numberScanner.nextInt();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    int secondNumber = numberScanner.nextInt();
                    int divisionResult = twoWholeNumberDivision(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + divisionResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Modulo") || operationTypeChoose.equals("modulo")) {
                    typeWriterEffect("This is the modulo/remainder part. Please type the first number!");
                    System.out.println();
                    int firstNumber = numberScanner.nextInt();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    int secondNumber = numberScanner.nextInt();
                    int moduloResult = twoWholeNumberModulo(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + moduloResult);
                    System.out.println();
                }

            } else if (mathNumberTypeChoose.equals("Float") || mathNumberTypeChoose.equals("float")) {
                typeWriterEffect("Okay, we'll print the result in whole number. Now, choose the operation that you want!");
                System.out.println();
                typeWriterEffect("Choose between Addition,Subtraction, Multiplication or Division");
                System.out.println();
                String operationTypeChoose = introScanner.nextLine();

                if (operationTypeChoose.equals("Addition") || operationTypeChoose.equals("addition")) {
                    typeWriterEffect("This is the addition part. Please type the first number!");
                    System.out.println();
                    typeWriterEffect("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3");
                    System.out.println();
                    float firstNumber = numberScanner.nextFloat();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    float secondNumber = numberScanner.nextFloat();
                    float additionResult = twoFloatNumberAddition(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + additionResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Subtraction") || operationTypeChoose.equals("subtraction")) {
                    typeWriterEffect("This is the subtraction part. Please type the first number!");
                    System.out.println();
                    typeWriterEffect("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3");
                    System.out.println();
                    float firstNumber = numberScanner.nextFloat();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    float secondNumber = numberScanner.nextFloat();
                    float substractionResult = twoFloatNumberSubstraction(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + substractionResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Multiplication") || operationTypeChoose.equals("multiplication")) {
                    typeWriterEffect("This is the multiplication part. Please type the first number!");
                    System.out.println();
                    typeWriterEffect("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3");
                    System.out.println();
                    float firstNumber = numberScanner.nextFloat();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    float secondNumber = numberScanner.nextFloat();
                    float multiplicationResult = twoFloatNumberMultiplication(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + multiplicationResult);
                    System.out.println();
                } else if (operationTypeChoose.equals("Division") || operationTypeChoose.equals("division")) {
                    typeWriterEffect("This is the division part. Please type the first number!");
                    System.out.println();
                    typeWriterEffect("Don't forget to type the number with decimal using dot (.) ex: 8.5 or 2.3");
                    System.out.println();
                    float firstNumber = numberScanner.nextFloat();
                    typeWriterEffect("Now please type the second number");
                    System.out.println();
                    float secondNumber = numberScanner.nextFloat();
                    float divisionResult = twoFloatNumberDivision(firstNumber, secondNumber);
                    typeWriterEffect("The result is : " + divisionResult);
                    System.out.println();
                }
            }
        } else if (calculatorTypeChoose.equals("Age") || calculatorTypeChoose.equals("age")) {
            typeWriterEffect("Alright, now we're on the Age Calculator. now choose what calculator type do you want");
            System.out.println();
            typeWriterEffect("Choose between Current Age or Birth Year !");
            System.out.println();
            String ageTypeChoose = introScanner.nextLine();

            if (ageTypeChoose.equals("Current Age") || ageTypeChoose.equals("Current age") || ageTypeChoose.equals("current Age") || ageTypeChoose.equals("current age")) {
                typeWriterEffect("This is the current age part. Please type the year you're born!");
                System.out.println();
                int yearBorn = introScanner.nextInt();
                System.out.println(currentAgeCalculator(yearBorn));
            } else if (ageTypeChoose.equals("Birth Year") || ageTypeChoose.equals("Birth year") || ageTypeChoose.equals("birth Year") || ageTypeChoose.equals("birth year")) {
                typeWriterEffect("This is the birth year part. Please type your age!");
                System.out.println();
                int currentAge = introScanner.nextInt();
                System.out.println(birthYearCalculator(currentAge));
            }
        } else if (calculatorTypeChoose.equals("Advanced Maths") || calculatorTypeChoose.equals("Advanced maths") || calculatorTypeChoose.equals("advanced Maths") || calculatorTypeChoose.equals("advanced maths")) {
            typeWriterEffect("Alright, now we're on the Advanced Maths Calculator. Now choose what formula do you want to calculate!");
            System.out.println();
            typeWriterEffect("Currently we have the DistanceBetweenTwoDots (write DBTD)");
            System.out.println();
            String formulaTypeChoose = introScanner.nextLine();

            if (formulaTypeChoose.equals("DBTD") || formulaTypeChoose.equals("dbtd")){
                typeWriterEffect("Now we're at the Distance Between Two Dots formula.");
                System.out.println();
                typeWriterEffect("In this formula, we have x1, x2, y1, and y2");
                System.out.println();
                typeWriterEffect("The basic formula of this is square root((x2 - x1)^2 + (y2 - y1)^2)");
                System.out.println();
                typeWriterEffect("Now, type the x1!");
                System.out.println();
                double theX1 = introScanner.nextDouble();
                typeWriterEffect("Now, type the y1!");
                System.out.println();
                double theY1 = introScanner.nextDouble();
                typeWriterEffect("Now, type the x2!");
                System.out.println();
                double theX2 = introScanner.nextDouble();
                typeWriterEffect("Now, type the y2!");
                System.out.println();
                double theY2 = introScanner.nextDouble();
                System.out.println("The distance is " + distanceBetweenTwoDots(theX1, theY1, theX2, theY2));
            }


        } else if (calculatorTypeChoose.equals("Physics") || calculatorTypeChoose.equals("physics")) {
            typeWriterEffect("Alright, now we're on the Physics Calculator. Now choose what formula do you want to calculate!");
            System.out.println();
            typeWriterEffect("Currently we have the DistanceSpeedTime (write DST)");
            System.out.println();
            String formulaTypeChoose = introScanner.nextLine();

            if (formulaTypeChoose.equals("DsT") || formulaTypeChoose.equals("dst")) {
                typeWriterEffect("Now we're at the Distance Speed Time formula. Choose which unit/measure you want to calculate!");
                System.out.println();
                typeWriterEffect("In this formula, we have Distance (s), Speed(v), and Time(t)");
                System.out.println();
                typeWriterEffect("The basic formula of this is s = v . t");
                System.out.println();
                typeWriterEffect("Now, Choose which unit/measure you want to calculate! (type 'Distance' or the others");
                System.out.println();
                String unitTypeChoose = introScanner.nextLine();

                if (unitTypeChoose.equals("Distance") || unitTypeChoose.equals("distance")) {
                    typeWriterEffect("So, we're trying to find the Distance. Please first type the Speed in meter/second");
                    System.out.println();
                    float speed = introScanner.nextFloat();
                    typeWriterEffect("Good, now please type the Time in seconds");
                    System.out.println();
                    float time = introScanner.nextFloat();
                    System.out.println("The Distance is " + physicsDistanceOne(speed, time) + " m");
                } else if (unitTypeChoose.equals("Speed") || unitTypeChoose.equals("speed")) {
                    typeWriterEffect("So, we're trying to find the Speed. Please first type the Distance in meters");
                    System.out.println();
                    float distance = introScanner.nextFloat();
                    typeWriterEffect("Good, now please type the Time in seconds");
                    System.out.println();
                    float time = introScanner.nextFloat();
                    System.out.println("The Speed is " + physicsSpeedOne(distance, time) + " m/s");
                } else if (unitTypeChoose.equals("Time") || unitTypeChoose.equals("time")) {
                    typeWriterEffect("So, we're trying to find the Time. Please first type the Distance in meters");
                    System.out.println();
                    float distance = introScanner.nextFloat();
                    typeWriterEffect("Good, now please type the Speed in meter/second");
                    System.out.println();
                    float speed = introScanner.nextFloat();
                    System.out.println("The Time is " + physicsTimeOne(distance, speed) + " s");
                }
            }
        }
        else if(calculatorTypeChoose.equals("Other")||calculatorTypeChoose.equals("other")){
        typeWriterEffect("you choose the other, which is still empty... sorry for that :(");
        System.out.println();
    }*/

}

    public static int twoWholeNumberAddition(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int twoWholeNumberSubstraction(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int twoWholeNumberMultiplication(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int twoWholeNumberDivision(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static int twoWholeNumberModulo(int firstNumber, int secondNumber) {
        int result = firstNumber % secondNumber;
        return result;
    }
    public static float twoFloatNumberAddition(float firstNumber, float secondNumber) {
        float result = firstNumber + secondNumber;
        return result;
    }

    public static float twoFloatNumberSubstraction(float firstNumber, float secondNumber) {
        float result = firstNumber - secondNumber;
        return result;
    }

    public static float twoFloatNumberMultiplication(float firstNumber, float secondNumber) {
        float result = firstNumber + secondNumber;
        return result;
    }

    public static float twoFloatNumberDivision(float firstNumber, float secondNumber) {
        float result = firstNumber / secondNumber;
        return result;
    }
    public static int currentAgeCalculator(int yearBirth){
        int currentAge = LocalDate.now().minusYears(yearBirth).getYear();
        return currentAge;
    }
    public static int birthYearCalculator(int yourAge){
        int yearBirth = LocalDate.now().minusYears(yourAge).getYear();
        return yearBirth;
    }
    public static float physicsDistanceOne(float speed, float time){
        float result = speed * time;
        return result;
    }
    public static float physicsSpeedOne(float distance, float time){
        float result = distance / time;
        return result;
    }
    public static float physicsTimeOne(float distance, float speed){
        float result = distance / speed;
        return result;
    }
    public static double distanceBetweenTwoDots(double x1, double y1, double x2, double y2){
        double result = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return result;
    }
    public static float physicsForceTwo(float mass, float acceleration){
        float result = mass * acceleration;
        return result;
    }
    public static float physicsMassTwo(float force, float acceleration){
        float result = force / acceleration;
        return result;
    }
    public static float physicsAccelerationTwo(float force, float mass){
        float result = force / mass;
        return result;
    }
}
