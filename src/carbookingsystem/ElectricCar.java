
package carbookingsystem;


public class ElectricCar extends Car {
    
    private double batteryCapacity;

    public ElectricCar(double batteryCapacity, String carName, String carColor, String carModel) {
        super(carName, carColor, carModel);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public double powerConsuming(){
        
        return 3.33 * batteryCapacity;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Car Name:" + getCarName());
        System.out.println("Car color:" + getCarColor());
        System.out.println("Car Model:" + getCarModel());
        System.out.println("Battery Capacity:" + batteryCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + "ElectricCar{" + "batteryCapacity=" + batteryCapacity + '}';
    }
    
    
}
