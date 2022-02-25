public class TestClass5026211152 {
    public static void main(String[] args){
        ComputeMethods5026211152 computing = new ComputeMethods5026211152();
        double tempF = 89.0;
        System.out.println(tempF + " Fahrenheit is " + computing.ftoc(tempF) + " Celcius");

        int a = 3;
        int b = 7;
        System.out.println("If the two sides of a triangle is made of 3 and 7, then the hypotenuse is " + computing.hypotenuse(a, b));

        System.out.println("The sum of two randomized dices is = " + computing.roll());
    }
}
