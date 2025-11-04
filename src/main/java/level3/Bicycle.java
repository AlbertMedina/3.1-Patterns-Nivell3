package level3;

public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bicycle starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle braking");
    }
}
