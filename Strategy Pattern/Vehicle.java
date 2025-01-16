public class Vehicle {

    private DriveStrategy drivest;

    Vehicle(DriveStrategy drivest) {
        this.drivest = drivest;
    }

    public void drive() {
        drivest.drive();
    }
    
}