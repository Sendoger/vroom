package vroom.src.cars;

public class Drone extends Vehicle implements ITrackable {
  private int batteryLevel;
  private double latitude = 0;
  private double longitude = 0;
  private double altitude = 0;

  
  public Drone(String id, int batteryLevel) {
    super(id, 5);
    this.batteryLevel = batteryLevel;
  }
  
  public void move() {
    if (batteryLevel > 0) {
      System.out.println("Дрон " + getId() + " летит по воздуху, заряд батареи: " + getBatteryLevel() +"%" );
      batteryLevel -= 5;
      latitude += Math.random();
      longitude += Math.random();
      altitude += Math.random();
      
    } else {
      System.out.println("Дрон остановился, заряд на нуле");
    }
  }

  public String getCurrentCoordinates() {
    return "Координаты дрона: " + latitude + " ; " + longitude + " ; " + altitude;
  }

  public void sendStatusUpdate() {
    System.out.println("Посылка прошла таможню");
  }

  public int getBatteryLevel() { return batteryLevel; }
}
