package objectOriented;

public class Marketer extends Employee {

    public boolean insideMarket(){
        return true;
    }

    //changing marketers working hours from 40 to 50
    @Override
    public int getHours() {
        return 50;
    }

    @Override
    public double salary() {
        return 60;
    }
}
