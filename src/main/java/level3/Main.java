package level3;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        Start start = new Start(vehicle);
        Accelerate accelerate = new Accelerate(vehicle);
        Brake brake = new Brake(vehicle);

        Broker broker = new Broker();
        broker.takeOrder(start);
        broker.takeOrder(accelerate);
        broker.takeOrder(brake);
        broker.executeOrders();
    }
}
