package cpre416assignment1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> parkedVehicles = new ArrayList<>();

    // Stamp Coupling: Passes Vehicle object
    public void parkVehicle(Vehicle vehicle) {
        parkedVehicles.add(vehicle);
        System.out.println(vehicle.getMake() + " parked.");
    }

    public void listParkedVehicles() {
        System.out.println("Parked vehicles:");
        for (Vehicle v : parkedVehicles) {
            System.out.println(v.getMake() + " " + v.getModel());
        }
    }
}