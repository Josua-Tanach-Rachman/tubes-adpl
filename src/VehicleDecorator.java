// Decorator Pattern
abstract class VehicleDecorator extends Vehicle {
    protected Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void startEngine() {
        vehicle.startEngine();
    }

    void stopEngine() {
        vehicle.stopEngine();
    }

    @Override
    void drive() {
        vehicle.drive();
    }

    @Override
    void reverse() {
        vehicle.reverse();
    }

    @Override
    void turnLeft() {
        vehicle.turnLeft();
    }

    @Override
    void turnRight() {
        vehicle.turnRight();
    }

    @Override
    void honk() {
        vehicle.honk();
    }

    
}