package cpre416assignment1;

public class Car extends Vehicle {
    private int speed;

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("Car accelerating to " + speed + " km/h.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    // Polymorphism: Method Overloading
    public void honk() {
        System.out.println("Beep beep!");
    }

    public void honk(int times) {
        for (int i = 0; i < times; i++) System.out.print("Beep ");
        System.out.println();
    }

    // Data Coupling: Passes primitive `int`
    public void setSpeed(int speed) {
        adjustSpeed(speed);
    }

    private void adjustSpeed(int newSpeed) {
        this.speed = newSpeed;
        System.out.println("Speed adjusted to " + newSpeed + " km/h.");
    }
}