package inheritancemethods.products;

public class PackedProduct extends Product {

    private int packingUnit;
    private double weightOfBox;

    public PackedProduct(String name, double unitWeight, int numberOfDecimals, int packingUnit, double weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public double getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public double totalWeight(int pieces) {
        int numberOfBoxes = 0;
        int restOfpieces = pieces;
        while (restOfpieces > 0) {
            numberOfBoxes++;
            restOfpieces -= packingUnit;
        }
        return super.totalWeight(pieces) + numberOfBoxes * weightOfBox;
    }
}
