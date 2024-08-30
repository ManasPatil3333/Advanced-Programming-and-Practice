interface Engine {
    String getType();
    int getHorsepower();
    String getFuelType();
}

class Vehicle {
    String make;
    String model;
    int year;
    int num_wheels;

    public Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    public void displayVehicleInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Number of Wheels: " + num_wheels);
    }
}

// Derived class Car
class Car extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;
    int numDoors;

    public Car(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType, int numDoors) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.numDoors = numDoors;
    }

    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType() + ", Number of Doors: " + numDoors);
    }
}

// Derived class Truck
class Truck extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;
    double payloadCapacity;

    public Truck(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType, double payloadCapacity) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public void displayTruckInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType() + ", Payload Capacity: " + payloadCapacity + " tons");
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;

    public Motorcycle(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public void displayMotorcycleInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType());
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4, "V6", 300, "Petrol", 4);
        Truck truck = new Truck("Ford", "F-150", 2019, 4, "V8", 450, "Diesel", 1.5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, 2, "V-Twin", 70, "Petrol");

        System.out.println("Car Details:");
        car.displayCarInfo();

        System.out.println("\nTruck Details:");
        truck.displayTruckInfo();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayMotorcycleInfo();
    }
}