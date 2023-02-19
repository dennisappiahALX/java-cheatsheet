public class DecisionMakingForLoops {
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

        //1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        for (int i =1 ; i <= 5; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        //1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int number = 1;
        for (int i =1 ; i <= 5; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(" "+ number);
                number++;
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

        for (int i =1 ; i <=5 ; i++) {
            //printing the space
            for (int k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }

            //printing the stars
            for (int j = 5; j >= i ; j--){
                System.out.print("*");
            }

            System.out.println();
        }

        /* printing both spaces and stars*/
        /* 4 spaces before the first start and follows in that pattern*/
        //         *
        //      *    *
        //    *    *    *
        //   *   *   *   *
        // *  *   *   *   *

        for (int i = 1; i <= 5 ; i++){
            // printing spaces
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }

            //printing stars
            for(int j= 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        /* printing both spaces and stars*/
        /* 4 spaces before the first start and follows in that pattern*/
        //      *
        //    * * *
        //  * * *  * *
        // * * * * * * * *
        //* * * * * * * * * * *

        for (int i = 1; i < 5; i++){
            //printing spaces
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= (2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //* * * * * * * * * * *
        //  * * * * * * * * *
        //    * * * * * * *
        //      * * * * *
        //        * * *
        //          *

        for (int i = 5; i >= 1; i--){
            for (int k = 1; k <= 5- i ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* combine the two triangle patterns*/
        //      *
        //    *  *  *
        //  * * *  * *
        // * * * * * * * *
        //* * * * * * * * * * *
        //  * * * * * * * * *
        //    * * * * * * *
        //      * * * * *
        //        * * *
        //          *


        for (int i = 1; i < 5; i++){
            //printing spaces
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= (2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--){
            for (int k = 1; k <= 5- i ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* combine the two triangle patterns*/
        //*
        //* *
        //* * *
        //* * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
