import java.util.Scanner;

public class DecisionMakingChallenge {
    public static void main(String[] args) {
            factorial();
            sum();
            product();
            compare();
            stringInteger();
            isPrime();
            primeNumbers();
    }

    public static  void factorial (){
        /* Write a Java program that calculates the factorial of 10 */
        // 10! = 10*9*8*7*6*5*4*3*2*1

        int result = 1;
        for (int i= 5; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
    }

    public static void sum() {
        /* Write a Java program that calculates the sum of digits of a number */
        // 1+2+3+4+5+6+7+8+9..
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Sum of digits= "+ sum);
    }

    public static void product() {
        /* Write a Java program that calculates the sum of first 10 integers */
        // 1*2*3*4*5*6*7...

        int product = 1;
        for (int i = 1; i <= 10; i++){
            product = product * i;
        }
        System.out.println(product);
    }

    public static  void compare() {
        //user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        float a = scanner.nextFloat();

        System.out.println("Enter your second number");
        float b = scanner.nextFloat();

        if (a < b){
            System.out.println("Number is less");
        }else if (a> b){
            System.out.println("Number is greater");
        }else {
            System.out.println("Number is even");
        }
    }

    public static  void stringInteger(){

        /* Write a Java program that converts a string into integer and vice-versa */
        String n = "100";

        int i = Integer.parseInt(n);
        System.out.println(i);

        //converting integers to string
        int j = 100;
        String l = String.valueOf(j);
        System.out.println(l);
    }

    public static void isPrime(){
    /* Prime number is a positive number greater than 1 that has only 2 factors: 1 and itself */
        /* Write a Java program to checks prime numbers from 1 to n (first n prime numbers)
        (entered by user)*/
    //Algorithm:
    /*
    - loop through the n items, check if i is a factor n (n is divisible by i)
     if you find any value which is a factor of itself,
    increase the count by 1
    */
        //user input of number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++){

            if (number % i == 0 ){
                count++;
            }
            if (count == 2){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }

    public static void primeNumbers (){
         /* Write a Java program to display prime numbers from 1 to n (first n prime numbers)
        (entered by user)*/

        //user input of number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value number");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            //j= 2, 3, 5, 7, 11
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
