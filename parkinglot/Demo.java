package parkinglot;

import parkinglot.vehicletype.Car;
import parkinglot.vehicletype.MotarCycle;
import parkinglot.vehicletype.Truck;
import parkinglot.vehicletype.Vehicle;

public class Demo {
    public static void main(String argsp[]) {
        System.out.println("Creating parking lot");
        ParkingLot parkingLot = ParkingLot.getParkingLot();

        System.out.println("parking lot created: " + parkingLot);

        System.out.println("adding levels");
        parkingLot.addLevel(0, 100);
        parkingLot.addLevel(1, 50);

        System.out.println("two levels added");

        System.out.println("creating vehicles");

        Vehicle car1 = new Car("1234");
        Vehicle car2 = new Car("5678");

        Vehicle truck1 = new Truck("0000");

        Vehicle moterCycle1 = new MotarCycle("1111");

        System.out.println("car1 parked at:" + parkingLot.parkVehicle(car1));
        System.out.println("car2 parked at:" + parkingLot.parkVehicle(car2));
        System.out.println("truck1 parked at:" + parkingLot.parkVehicle(truck1));
        System.out.println("moterCycle1 parked at:" + parkingLot.parkVehicle(moterCycle1));

    }
}
