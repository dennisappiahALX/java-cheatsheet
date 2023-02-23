package foundations;
import java.util.Scanner;

public class StringsChallenges {
    public static void main(String[] args) {
        count();
        reverse();
    }
    public static void count(){
    /*Write a Java program that counts the letters, spaces, numbers, and other characters of an input string */
        System.out.println("Enter your string text");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

        //Transforming string to array of characters
        char [] chars = enteredText.toCharArray();

        //checking if the char is space, letter, or number
        int spaces =0 , letters = 0 , numbers = 0, others= 0;

        for (int i= 0; i < enteredText.length(); i++){
            if (Character.isDigit(chars[i])){
                numbers++;
            } else if (Character.isAlphabetic(chars[i])){
                letters++;
            } else if (Character.isSpaceChar(chars[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("numbers= " + numbers);
        System.out.println("letters= " + letters);
        System.out.println("spaces= " + spaces);
        System.out.println("others= " + others);
    }

    public static void reverse (){
        System.out.println("Enter the string text");

        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

        //transform string to array of characters
        char [] chars = enteredText.toCharArray();

        //original string
        for(int i = 0 ; i < chars.length; i++){
            System.out.print("\t" + chars[i]);
        }

        System.out.println();

        //reverse string
        for(int i = chars.length - 1; i >= 0; i--){
            System.out.print("\t"+ chars[i]);
        }
    }
}
