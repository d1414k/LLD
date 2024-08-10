package parkinglot;

import java.util.ArrayList;
import java.util.List;

import parkinglot.vehicletype.Vehicle;
import parkinglot.vehicletype.VehicleType;

public class Level {
    private int floorNo;
    private List<ParkingSpot> parkingSpots;

    public Level(int floorNo, int numSpots) {
        this.floorNo = floorNo;
        parkingSpots = new ArrayList<>();
        for (int i = 0; i < numSpots; i++) {
            parkingSpots.add(new ParkingSpot(VehicleType.CAR));
        }
    }

    public synchronized ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isAvailable() && parkingSpot.getVehicleType() == vehicle.getVehicleType()) {
                parkingSpot.setIsAvailable(false);
                return parkingSpot;
            }
        }
        return null;
    }
}
