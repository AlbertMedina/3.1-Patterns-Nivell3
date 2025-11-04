package level3.command;

import level3.vehicles.Vehicle;

public class Start implements Order {

    private final Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
