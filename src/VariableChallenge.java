import java.util.Scanner;

public class VariableChallenge {
    public static void main(String[] args) {
        //Write a Java program that allow users to enter
        // his weight and height , and display the body mass index
        // for the user

        // The formula is BMI = kg/m2 where kg is a person's
        // weight in kilogram and m2 is their height in metres square

        //get entered input from  user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your weight");
        float weight = scanner.nextFloat();

        System.out.println("Please enter your height");
        float height = scanner.nextFloat();


        float bmi = weight / (height * height);

        System.out.println("BMI= "+ bmi);
    }
}
