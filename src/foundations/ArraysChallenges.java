package foundations;

import java.util.Scanner;

public class ArraysChallenges {
    public static void main(String[] args) {
//        sumOfNumbers();
//        average();
//        removeElement();
//        insertElement();
        minMax();
    }

    public static void sumOfNumbers(){
    /*Write a Java program that allow users to enter 10 numbers and give their sum */
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        //firsts step: set the user input
        System.out.println("Enter 10 values:");
        int [] array = new int[size];

        //second step: filling the array (populating the array)
        for (int i = 0; i < size; i++){
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
        int [] array = new int[50];


        for (int i= 0; i < size; i++ ){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        float average = 0f;
        for (int element: array){
            sum = sum + element;
        }
        average = (float)(sum / size);

        System.out.println("Average: "+ average);

    }

    public static  void removeElement() {
        /* Write a program in Java that removes an element from array of 10 values entered by a user*/

        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter your size values");
        int[] array = new int[50];

        //populate the array with the values from the user
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Enter the position for delete of the element and check its validity
        System.out.println("Enter the position you want to delete the value");
        int position = scanner.nextInt();

        if (position <= 0 || position > size) {
            System.out.println("invalid position");
        }else {
            for (int i = position - 1; i < size -1; i++){
                array[i] = array[i+1];
            }
            size--;
        }

        //Traversing the result
        int count = 0;
        for (int i = 0; i < size; i++) {
            count = count + 1;
            System.out.println(array[i]);
        }
        System.out.println("Count= "+ count);

    }

    public static void insertElement (){
        /* Write a program in Java that inserts an element into array of 10 values entered by a user*/

        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter your size values");
        int[] array = new int[50];

        //populate the array with the values from the user
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Enter the position to insert of the element and check its validity
        System.out.println("Enter the position you want to insert the value");
        int position = scanner.nextInt();

        //Enter number you want to insert
        System.out.println("Enter the value you want to insert");
        int number = scanner.nextInt();

        if (position < 0 || position > size + 1)
        {
            System.out.println("invalid position");
        } else {
            for (int i = size - 1; i >= position - 1; i--){
                array[i+1]= array[i];
            }
            //insert at position
            array[position-1] = number;
            size++;
        }

        //Traversing the result
        int count = 0;
        for (int i = 0; i < size; i++) {
            count = count + 1;
            System.out.print("\t"+ array[i]);
        }
        System.out.println();
        System.out.println("Count= "+ count);
    }

    public static void minMax(){
        /*Write a Java program that finds the minimum and maximum of elements in array */

        int [] myArray = {25, -25, 5, 7, 8,9, 3,10};

        //finding min
        int min = myArray[0];  /* comparing the minimum element with the remaining elements*/
        int max = myArray[0];

        for (int i = 1 ; i < myArray.length; i++){
            // comparing the elements with the minimum element
            if (myArray[i] < min) {
                //switching the smallest element
                min = myArray[i];
            }
        }
        System.out.println("Minimum value: " + min);

        for (int i = 1 ; i < myArray.length; i++){
            // comparing the elements with the maximum element
            if (myArray[i] > max) {
                //switching the maximum element
                max = myArray[i];
            }
        }
        System.out.println("Minimum value: " + max);
    }

}
