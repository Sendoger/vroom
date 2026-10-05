package vroom.src.cars;

public class Truck extends Vehicle implements ITrackable{
  private boolean hasTrailer;
  private double latitude = 0;
  private double longitude = 0;
  
  public Truck(String id, double maxCapacityKg, boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
    //6000 with trailer, 1000 without
    super(id, (hasTrailer ? maxCapacityKg + 5000 : maxCapacityKg));
    
  }

  public void move() {
    System.out.println("Грузовик " + getId() + " едет по трассе со скоростью 70 км/ч");
    
    latitude += Math.random();
    longitude += Math.random();
  }

  public String getCurrentCoordinates() {
    return "Координаты грузовика: " + latitude + " ; " + longitude;
  }

  public void sendStatusUpdate() {
    System.out.println("Посылка прошла таможню");
  }
  
  public boolean getHasTrailer() { return hasTrailer; }

}
