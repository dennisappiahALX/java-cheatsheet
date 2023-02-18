public class DecisionMaking {
    public static void main(String[] args) {
        //For Loops (Initialize, comparison, update)

        //get the squares of the first 5 integers
        for (int i =1; i <= 5; i++ ) {
            //code
            System.out.println(i + " squared= " + (i * i));
        }
        //Nested For Loops

        /* the inner for loop executes inner code 10 times, and the outer for loop
        executes the inner for loop 5 times */

        // ***********
        // ***********
        // ***********
        // ***********
        // ***********
        for (int i =1 ; i <= 5; i++){
            for (int j =1 ; j <= 10; j++){
                System.out.print("*"); // **********
            }
            System.out.println();
        }

        /* the inner for loop executes inner code i times, and the outer for loop
        executes the inner for loop 5 times */

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        for (int i =1 ; i <= 5; i++){
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int i =1 ; i <= 5; i++){
            for (int j = 5 ; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i =1 ; i <= 5; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /* printing both spaces and stars*/

        //            *
        //         *  *
        //       * *  *
        //     * * *  *
        //   * * * *  *

        for (int i =1 ; i <=5 ; i++) {
            for (int j = 1; j <= 5 ; j++){
                if ((i + j) <= 5){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        /* printing both spaces and stars*/
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *




    }
}
