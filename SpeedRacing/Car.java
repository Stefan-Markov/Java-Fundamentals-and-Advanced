package SpeedRacing;

public class Car {
    private String model;
    private double fuel;
    private double fuelCostForKm;
    private int distanceTravelled;

    public Car(String model, double fuel, double fuelCostForKm) {
        this.model = model;
        this.fuel = fuel;
        this.fuelCostForKm = fuelCostForKm;
        this.distanceTravelled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public double getFuelCostForKm() {
        return fuelCostForKm;
    }

    public boolean canMove(int distance) {

        return this.fuel >= distance * this.fuelCostForKm;
    }
}
