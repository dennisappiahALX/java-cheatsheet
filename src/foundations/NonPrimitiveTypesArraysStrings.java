package foundations;

public class NonPrimitiveTypes {
    public static void main(String[] args) {
        string();
        array();
    }

    public static void string(){
        //strings
        String k = "Hello";
        String m = " World";

        System.out.println(k.toUpperCase().contains("l"));

        /* concatenate */
        System.out.println(k+m);
        System.out.println(m.replace('o', 'u'));

        for (int i=1; i < m.length() ; i++) {
            System.out.println(m.charAt(i));
        }

        //substrings
        System.out.println(m.substring(1,3));
    }

    // Arrays
    /* Primitive types array & non-primary types array(String , Objects) */
    public static  void array(){
        // Declaration
        //  int[] anArray;
        // int numbers[];

        // initialization
        int size = 10;
        int[] anArray = new int[size];
        int[] annArray = new int[]{1,2,3,4, 6,7};

        //looping over the indices (iterating through an Array)
        for (int i = 0; i < annArray.length ; i++){
            System.out.print(annArray[i]);
        }

        //ForEach Loop - prints each element of the array
        for (int element: annArray){
            System.out.println(element);
        }

        // 2-Dimensional Array is a matrix
        //iterate over the indexes
        int [][] matrix = new int[][]{{2,4,7},{5,6,9}, {7,9,11}};

        for (int i= 0; i < 3 ; i++){
            for (int j=0; j < 3; j++){
                System.out.print("\t"+ matrix[i][j]);
            }
            System.out.println();
        }
    }
}
