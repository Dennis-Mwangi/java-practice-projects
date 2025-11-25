public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.displayInfo();

        Car car2 = new Car("Honda", "Civic", 2019);
        car2.displayInfo();

        Car car3 = new Car("Ford", "Mustang", 2021);
        car3.displayInfo();
       
        Car Car4 = new Car("Chevrolet", "Malibu", 2018);
        Car4.displayInfo();

    }   


}


