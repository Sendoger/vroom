package vroom.src.cars;

public class Drone extends Vehicle {
  public int batteryLevel;
  
  public Drone(String id, int batteryLevel) {
    super(id, 5);
    this.batteryLevel = batteryLevel;
  }
  
  public void move() {
    if (batteryLevel > 0) {
      System.out.println("Дрон " + getId() + " летит по воздуху, заряд батареи: " + getBatteryLevel() +"%" );
      batteryLevel -= 5;
    } else {
      System.out.println("Дрон остановился, заряд на нуле");
    }
  }

  public int getBatteryLevel() { return batteryLevel; }
}
