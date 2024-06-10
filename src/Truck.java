class Truck extends Vehicle {
    void startEngine() {
        System.out.println("Truck engine start");
    }

    void stopEngine() {
        System.out.println("Truck engine stop");  
    }

    void drive() {
        System.out.println("Truck is driving");
    }
    void reverse() {
        System.out.println("Truck is reversing");
        
    }

    void turnLeft() {
        System.out.println("Truck is turning left");

    }

    void turnRight() {
        System.out.println("Truck is turning right");
    }

    @Override
    void honk() {
        System.out.println("Truck is honking");
    }

}