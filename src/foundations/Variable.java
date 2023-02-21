package foundations;

public class Variable {
    public static void main(String[] args) {

        //creating integer variables
        int age = 20;
        short height = 40;
        byte weight = 5;
        long d = 555555555;

       //creating floating variables
        float f_variable = 13.789f;
        double d_variables = 456.899999d;

        //creating character variables
        char alphabet = 'b';
        char g = 'd';

        //creating boolean variables
        boolean isAdmin = true;
        boolean isBoy = false;


        //operators
        int x = 5;
        int y = 10;

        //typecasting
        float z = (float) x/y;
        System.out.println(z); //0.5

        //Post increment of variables
        int a = 0;
        a++;  //equivalent to a += 1, a += 6
        y--;  //equivalent to y -= 1, y -= 3
        age /= 4;  //equivalent to age = age/4
        height *= 6;  // equivalent height = height * 6
        ++age;

        System.out.println("a "+ a);

        //printing integers
        System.out.println("a= "+ age);
        System.out.println("height= "+ height);
        System.out.println("weight= "+weight);
        System.out.println("d= "+d);

        //printing float points
        System.out.println("float=" + f_variable);
        System.out.println("double=" + d_variables);

        //printing characters
        System.out.println("alphabet= " + alphabet);
        System.out.println("g= " + d);

        //printing boolean variables
        System.out.println(isAdmin);
        System.out.println(isBoy);

    }
}
