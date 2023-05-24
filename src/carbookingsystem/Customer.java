
package carbookingsystem;


public class Customer {
    
    private String cuName;
    private int cuAge;
    private String cuPhoneNum;
    private int cuID;

    public Customer(String cuName, int cuAge, String cuPhoneNum, int cuID) {
        this.cuName = cuName;
        this.cuAge = cuAge;
        this.cuPhoneNum = cuPhoneNum;
        this.cuID = cuID;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    public int getCuAge() {
        return cuAge;
    }

    public void setCuAge(int cuAge) {
        this.cuAge = cuAge;
    }

    public String getCuPhoneNum() {
        return cuPhoneNum;
    }

    public void setCuPhoneNum(String cuPhoneNum) {
        this.cuPhoneNum = cuPhoneNum;
    }

    public int getCuID() {
        return cuID;
    }

    public void setCuID(int cuID) {
        this.cuID = cuID;
    }
    
    
    public void display(){
        System.out.println("Customer Name:" + cuName);
        System.out.println("Customer age:" + cuAge);
        System.out.println("Customer Phone number: " + cuPhoneNum);
        System.out.println("Customer ID:" + cuID);
    }

    @Override
    public String toString() {
        return "Customer{" + "cuName=" + cuName + ", cuAge=" + cuAge + ", cuPhoneNum=" + cuPhoneNum + ", cuID=" + cuID + '}';
    }

}
