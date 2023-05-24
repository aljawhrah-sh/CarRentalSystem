
package carbookingsystem;


public class Booking implements Printable {
    
    private static int numOfBookings = 0;
    
    private Customer customer;
    private Car car;

    public Booking( int numOfBookings, Customer customer, Car car) {
        
        this.customer = customer;
        this.car = car;
        Booking.numOfBookings = numOfBookings++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public int getNumOfBookings() {
        return numOfBookings;
    }

    public void setNumOfBookings(int numOfBookings) {
      Booking.numOfBookings = numOfBookings;
    }
   
    @Override
    public void print(){
        System.out.println("Customer:" + customer);
        System.out.println("Car" + car);
        System.out.println("Number of Bookings:" + numOfBookings);
    }
    
    
    

    @Override
    public String toString() {
        return "Booking{" + "customer=" + customer + ", car=" + car + '}';
    }
    
    
}
