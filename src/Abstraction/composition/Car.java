package Abstraction.composition;

public class Car extends Vehicle {
    //Car is-a Vehicle
    //Car has-an engine
    Engine engine;

    public Car(int modelYear, String companyName, Engine engine) {
        super(modelYear, companyName);
        this.engine = engine;
    }

    public void startCar(){
        System.out.println("Car started....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", modelYear=" + modelYear +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
