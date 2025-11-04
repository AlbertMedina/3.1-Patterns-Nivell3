package level3;

public class Ship implements Vehicle {

    @Override
    public void start() {
        System.out.println("Ship starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Ship accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ship braking");
    }
}
