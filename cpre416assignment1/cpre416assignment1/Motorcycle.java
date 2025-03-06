package cpre416assignment1;

public class Motorcycle extends Vehicle {
    private int speed;

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("Motorcycle accelerating to " + speed + " km/h.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }

    // Unique method for Motorcycle
    public void wheelie() {
        System.out.println("Doing a wheelie!");
    }
}