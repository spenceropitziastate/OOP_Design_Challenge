package cpre416assignment1;

public class Test {
    public static void main(String[] args) {
        // Polymorphism: Vehicle reference to subclass objects
        Vehicle car = new Car("Toyota", "Camry", 2020);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019);

        car.startEngine();       // Output: Car engine started.
        car.accelerate(60);      // Output: Car accelerating to 60 km/h.
        car.stopEngine();         // Output: Car engine stopped.

        motorcycle.startEngine(); // Output: Motorcycle engine started.
        motorcycle.accelerate(100); // Output: Motorcycle accelerating to 100 km/h.
        motorcycle.stopEngine();  // Output: Motorcycle engine stopped.

        // Method Overloading (Car)
        Car myCar = new Car("Honda", "Civic", 2021);
        myCar.honk();    // Output: Beep beep!
        myCar.honk(3);   // Output: Beep Beep Beep 

        // Data Coupling (Car.setSpeed)
        myCar.setSpeed(70); // Calls adjustSpeed(70)

        // Stamp Coupling (Garage.parkVehicle)
        Garage garage = new Garage();
        garage.parkVehicle(car);        // Output: Toyota parked.
        garage.parkVehicle(motorcycle); // Output: Harley-Davidson parked.
        garage.listParkedVehicles();
    }
}