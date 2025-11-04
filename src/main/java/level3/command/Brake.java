package level3.command;

import level3.vehicles.Vehicle;

public class Brake implements Order {

    private final Vehicle vehicle;

    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
