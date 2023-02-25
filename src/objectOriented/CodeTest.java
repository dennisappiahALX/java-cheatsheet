package objectOriented;

public class CodeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        Marketer marketer = new Marketer();
        LegalSecretary legalSecretary = new LegalSecretary();


        System.out.println(marketer.getHours());
        System.out.println(marketer.salary());
        System.out.println(lawyer.salary());

        //polymorphism - array of employees object from the Employee class
        Employee [] employees = new Employee[60];
        employees[0] = lawyer;
        employees[1] = secretary;
        employees[2] = marketer;
        employees[3] = legalSecretary;

        //creating new lawyer object
        Employee employee1 = new Lawyer();
        //creating new secretary object
        Employee employee2 = new Secretary();
        Employee employee3 = new Marketer();
        Employee employee4 = new LegalSecretary();

        //calling lawyer behavior on employee1
        System.out.println("New Lawyer: "+ employee1.salary());

        /*insideMarket() is a unique method to Marketer Class not the Super Class Employee, to call
         * it we need to type cast for the compiler to know employee3 is a marketer*/

       //employee3.insideMarket() wont work, thus
        ((Marketer) employee3).insideMarket();
        System.out.println(((Marketer) employee3).insideMarket());



    }
}