package objectOriented;

public class Lawyer extends Employee{

    @Override
    public double salary() {
        return super.salary() + 1500;
    }
}
