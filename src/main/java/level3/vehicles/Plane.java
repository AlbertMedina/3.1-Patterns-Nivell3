package level3.vehicles;

public class Plane implements Vehicle {

    @Override
    public void start() {
        System.out.println("Plane starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Plane braking");
    }
}
