// Base class
class Vehicle {
    void speedUp() {
        System.out.println("Vehicle speeds up");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Car speeds up to 60 mph");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        System.out.println("Bicycle speeds up to 15 mph");
    }
}

// Main class to test polymorphism
public class vehichle_Speed {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();  // Vehicle reference and object
        Vehicle myCar = new Car();  // Vehicle reference but Car object
        Vehicle myBicycle = new Bicycle();  // Vehicle reference but Bicycle object

        myVehicle.speedUp();
        myCar.speedUp();
        myBicycle.speedUp();
    }
}