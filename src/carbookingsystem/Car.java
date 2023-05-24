
package carbookingsystem;


public abstract class Car {
  
    private String carName;
    private String carColor;
    private String carModel;
    public static final double DAY_PRICE = 100.0; 

    public Car(String carName, String carColor, String carModel) {
        this.carName = carName;
        this.carColor = carColor;
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String CarModel) {
        this.carModel = carModel;
    }
    
    
    //ONLY GETTER FOR FINAL VAR
    public double getDAY_PRICE(){
       return DAY_PRICE;
   }
    
    public abstract double powerConsuming();
    
    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", carColor=" + carColor + ", CarModel=" + carModel + '}';
    }
    
    
    
    
    
}
