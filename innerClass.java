public class Vehicle {
    private Engine engine;

    public Vehicle() {
        engine = new Engine();
    }

    // Inner class representing the Engine
    private class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }

    public void startVehicle() {
        engine.start();
        System.out.println("Vehicle started");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.startVehicle();
    }
}

