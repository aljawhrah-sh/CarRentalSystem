package carbookingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CarBookingSystem {
    
    public static void main(String[] args) {
        
        ArrayList<Car> arrayListCars = new ArrayList<>();

        //create obj PLOYMORPHISIM
        Car car1 = new ElectricCar(100.5, "BMW", "White", "GLE");
        Car car2 = new ElectricCar(50.2, "Jeep", "Brown", "MEG");
        Car car3 = new PetrolCar(90.1, "Audi", "Black", "LTD");
        Car car4 = new PetrolCar(80.7, "Range", "Red", "GSP");

        //ARRAYLIST 
        arrayListCars.add(car1);
        arrayListCars.add(car2);
        arrayListCars.add(car3);
        arrayListCars.add(car4);
        
        Scanner input = new Scanner(System.in);
        System.out.println("*Welcome to the Car Booking system*");
        try {
            int choice;
            int n;
            int numOfBookingDays;
            
            do {
                
                displayMenu();
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("1.");
                        car1.displayInfo();
                        System.out.print("2.");
                        car2.displayInfo();
                        break;
                    
                    case 2:
                        System.out.print("3.");
                        car3.displayInfo();
                        System.out.println("4.");
                        car4.displayInfo();
                        break;
                    
                    case 3:
                        System.out.println("choose car Number:");
                        n = input.nextInt();
                        System.out.println("choise saved!");
                        System.out.println("How many days fo the car booking?");
                        numOfBookingDays = input.nextInt();
                        System.out.println("The total will be: " + pay(numOfBookingDays));
                        System.out.println("Your booked car info:");
                        displayBookedCar(n);
                        break;
                    case 4:
                        System.out.println("Booking canceled.");
                        break;
                    case 5:
                        displayArray();
                        break;
                    case 6:
                        System.out.println("you exsited the menu!");
                        break;
                    default:
                        System.out.println("invalid choise");
                }
            } while (choice != 6);
        } catch (Exception ex) {
            System.err.println("Invalid Input.");
        }

        //Opject Write
        WriteFile w = new WriteFile();
        w.OpenFile("CarBooking.txt");
        for (Car e : arrayListCars) {
            w.WriteToFile(e);
        }
        w.CloseFile();

        //Opject Read
        ReadFile R = new ReadFile();
        R.openFile("CarBooking.txt");
        R.ReadFromFile();
        R.closeFile();
        
    }// THE END OF MAIN

    public static void displayMenu() {
        
        System.out.println("**********************************");
        System.out.println("* 1. List Electic Cars           *");
        System.out.println("* 2. List Petrol Cars            *");
        System.out.println("* 3. Rent Car                    *");
        System.out.println("* 4. Cancel car                  *");
        System.out.println("* 5. List Cusromers Information: *");
        System.out.println("* 6. Exist                       *");
        System.out.println("**********************************");
        System.out.println("--->");
        
    }
    
    public static double pay(int numOfBookingDays) {
        double amount = numOfBookingDays * Car.DAY_PRICE;
        return amount;
        
    }
    
    public static void displayBookedCar(int n) {
        if (n == 1) {
            System.out.println("Car Name: BMW");
            System.out.println("Car color: White");
            System.out.println("Car Model: GLE");
            System.out.println("Battery Capacity: 100.5");
        } else if (n == 2) {
            System.out.println("Car Name: Jeep");
            System.out.println("Car color: Brown");
            System.out.println("Car Model: MEG");
            System.out.println("Battery Capacity: 50.2");
        } else if (n == 3) {
            System.out.println("Car Name: Audi");
            System.out.println("Car color: Black");
            System.out.println("Car Model: LTD");
            System.out.println("Tank size: 90.1");
        } else if (n == 4) {
            System.out.println("Car Name: Range");
            System.out.println("Car color: Red");
            System.out.println("Car Model: GSP");
            System.out.println("Tank size: 80.7");
        }
    }
    
    public static void displayArray() {
        Customer[] arrayCustomer = new Customer[3];
        arrayCustomer[0] = new Customer("shatha", 20, "0558982288", 112233);
        arrayCustomer[1] = new Customer("raghad", 21, "0549967576", 445566);
        arrayCustomer[2] = new Customer("algawhrah", 22, "0550195092", 778899);
        
        for (Customer arr : arrayCustomer) {
            System.out.println(arr);
        }
    }
    
}
