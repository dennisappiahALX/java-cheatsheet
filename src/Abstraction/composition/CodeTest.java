package Abstraction.example2;

public class CodeTest {
    public static void main(String[] args) {

        Engine engine = new Engine(2019, "Toyata");
        Car c1 = new Car(2020, "Tesla", engine);

        System.out.println(c1.engine.manufactureCompany);
    }
}
