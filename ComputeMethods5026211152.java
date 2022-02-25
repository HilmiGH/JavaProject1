import java.util.Random;

public class ComputeMethods5026211152 {

    public double ftoc(double degreesF){
        return (5/9.0)*(degreesF-32);
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt((a*a) + (b*b));
    }

    public int roll(){
        Random rand = new Random();
        int dice1 = rand.nextInt(7);
        int dice2 = rand.nextInt(7);
     return dice1 + dice2;
    }
}
