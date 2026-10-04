package vroom.src.cars;

public class Drone extends Vehicle {
  private int batteryLevel;
  
  public Drone(String id, int batteryLevel) {
    super(id, 5);
    this.batteryLevel = batteryLevel;
  }
  
  public void move() {
    System.out.println("Дрон полетел");
  }

  public int getBatteryLevel() { return batteryLevel; }
}
