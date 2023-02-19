public class DecisionMakingWhileLoops {
    public static void main(String[] args) {
        //Initialise, comparison, body, update

        int i = 5;
        while( i <= 8) {
            //body of the loop to be executed
            System.out.println(i);
            i++;
        }

        switch (i){
            case 1:
                System.out.print("Case 1");
                break;
            case 5:
                System.out.print("case 5");
                break;
            default:
                System.out.print("Nothing");
        }
    }
}
