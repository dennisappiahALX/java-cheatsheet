package Abstraction.example2;

public class Vehicle {
    int modelYear;
    String companyName;

    public Vehicle(int modelYear, String companyName) {
        this.modelYear = modelYear;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelYear=" + modelYear +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
