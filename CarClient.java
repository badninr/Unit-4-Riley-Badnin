public class CarClient {
  public static void main(String[] args){
    Car myCar = new Car("Nissan", "Rogue", 29.0, 14.5);

    myCar.drive(2.3)

    System.out.println("Drove 2.3 miles: " + myCar);

    myCar.addFuel(10.5);

    System.out.println("Added 10.5 gallons of fuel: "+myCar);


  }
}
