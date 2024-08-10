package parkinglot;

import java.util.ArrayList;
import java.util.List;

import parkinglot.vehicletype.Vehicle;

public class ParkingLot {
    private static ParkingLot instance;
    private List<Level> levels;

    public ParkingLot() {
        levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getParkingLot() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public synchronized void addLevel(int floorNo, int numSpots) {
        Level level = new Level(floorNo, numSpots);
        levels.add(level);
    }

    public synchronized ParkingSpot parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            ParkingSpot parkingSpot = level.parkVehicle(vehicle);
            if (parkingSpot != null)
                return parkingSpot;
        }
        return null;
    }

    // public synchronized ParkingSpot unParkVehicle(Vehicle vehicle) {

    // }

}
