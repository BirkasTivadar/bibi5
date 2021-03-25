package inheritancemethods.products;

public class Product {

    private String name;
    private double unitWeight;
    private int numberOfDecimals;

    public Product(String name, double unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, double unitWeight) {
        this(name, unitWeight, 2);
    }

    public String getName() {
        return name;
    }

    public double getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public double totalWeight(int pieces) {
        return pieces * unitWeight;
    }
}
