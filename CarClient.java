public class CarClient {
  public static void main(String[] args){
    Car myCar = new Car("Nissan", "Rogue", 29.0, 14.5);

    myCar.drive(200.0);

    System.out.println("Drove 2.3 miles: " + myCar);

    myCar.addFuel(5.9);

    System.out.println("Added 10.5 gallons of fuel: "+myCar);

    myCar.fillTank();

    System.out.println("Filled tank: "+myCar);

  }
}
