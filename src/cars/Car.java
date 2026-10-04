package vroom.src.cars;

public class Car extends Vehicle {
  private int passengerCount;
  public Car(String id, int passengerCount) {
    super(id, 500);
    this.passengerCount = passengerCount;
  }

  public void move() {
    System.out.println("Легковой автомобиль " + getId() + " едет по дороге со скоростью 90 км/ч");
  }

  public int getPassengerCount() { return passengerCount; }

}
