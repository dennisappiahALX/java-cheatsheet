package foundations;

import java.util.Scanner;

public class ArraysChallenges {
    public static void main(String[] args) {
        sumOfNumbers();
        average();
        removeElement();
    }

    public static void sumOfNumbers(){
    /*Write a Java program that allow users to enter 10 numbers and give their sum */
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        //firsts step: set the user input
        System.out.println("Enter 10 values:");
        int [] array = new int[size];

        //second step: filling the array
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        //third step: finding the sum
        int sum = 0;
        for (int element: array){
            sum = sum + element;
        }
        System.out.println("Sum= "+ sum);
    }

    public static  void average(){
        /* Write a Java program that find the average of 10 values entered by a user*/
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        System.out.println("Enter your size values");
        int [] array = new int[size];


        for (int i= 0; i < array.length; i++ ){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        double average = 0d;
        for (int element: array){
            sum = sum + element;
        }
        average = sum / array.length;

        System.out.println("Average: "+ average);

    }

    public static  void removeElement(){
        /* Write a program in Java that removes an element from an element*/

        int my_array[] = {25,14,56, 99,18, -5, 4, 6};

    /*Remove an element : 2nd element - there is no remove method for array object */



    }


}
