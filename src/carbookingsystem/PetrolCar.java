
package carbookingsystem;


public class PetrolCar extends Car{
    
    private double tankSize;

    public PetrolCar(double tankSize, String carName, String carColor, String carModel) {
        super(carName, carColor, carModel);
        this.tankSize = tankSize;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }
    
    @Override
    public double powerConsuming(){
        
        return 2.22 * tankSize;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Car Name:" + getCarName());
        System.out.println("Car color:" + getCarColor());
        System.out.println("Car Model:" + getCarModel());
        System.out.println("Tank size:" + tankSize );
        
    }

    @Override
    public String toString() {
        return  super.toString() + "PetrolCar{" + "tankSize=" + tankSize + '}';
    }
    
    
}
