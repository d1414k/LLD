package parkinglot;

import parkinglot.vehicletype.VehicleType;

public class ParkingSpot {
    private VehicleType vehicleType;
    private boolean isAvailable;

    public ParkingSpot(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "{" + vehicleType + "}";
    }
}
