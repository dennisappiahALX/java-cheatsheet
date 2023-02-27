package Abstraction.composition;

public class Engine {
    int productionYear;
    String manufactureCompany;

    public Engine(int productionYear, String manufactureCompany) {
        this.productionYear = productionYear;
        this.manufactureCompany = manufactureCompany;
    }

    public int setMaxRotationSpeed(){
        return 120_000;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "productionYear=" + productionYear +
                ", manufactureCompany='" + manufactureCompany + '\'' +
                '}';
    }
}
