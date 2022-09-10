package Class;


import java.util.Scanner;

public class BmiBody {
    public static void main(String[] args) {
        Scanner body = new Scanner(System.in);
        System.out.println("Input the weight");
        float weight = body.nextFloat();
        System.out.println("Input the height");
        float height = body.nextFloat();
        float totalBmi = weight / (height * height);
        System.out.println(totalBmi);

        if (totalBmi < 18.5 ) {
            System.out.println("Underweight");
        } else if (totalBmi < 25.0 || totalBmi >=18.5) {
            System.out.println("Normal");
        } else if (totalBmi >= 25.0 || totalBmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
