package vroom.src.cars;

public class Car extends Vehicle {
  int passengerCount;
  public Car(String id, int passengerCount) {
    super(id, 500);
    this.passengerCount = passengerCount;
  }

  public void move() {
    System.out.println("Машина поехала");
  }

  public int getPassengerCount() { return passengerCount; }

}
