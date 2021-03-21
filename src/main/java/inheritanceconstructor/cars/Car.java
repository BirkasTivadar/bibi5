package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuel() {
        return fuel;
    }

    public void modifyFuelAmount(double fuel) {
        if (-fuel >= this.fuel) {
            throw new RuntimeException("Not enough fuel available!");
        }
        this.fuel += fuel;
    }

    public void drive(int km) {
        modifyFuelAmount(-(km / 100 * fuelRate));
    }

    public double calculateRefillAmount() {
        return tankCapacity - getFuel();
    }
}
