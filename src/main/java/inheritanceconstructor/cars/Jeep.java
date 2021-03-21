package inheritanceconstructor.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Extra capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (-fuel <= extraFuel) {
            extraFuel += fuel;
            return;
        } else {
            fuel += extraFuel;
            extraFuel = 0;
            super.modifyFuelAmount(fuel);
        }
    }
}
