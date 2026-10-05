package vroom.src.cars;

public class Truck extends Vehicle {
  private boolean hasTrailer;
  
  public Truck(String id, double maxCapacityKg, boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
    //6000 with trailer, 1000 without
    super(id, (hasTrailer ? maxCapacityKg + 5000 : maxCapacityKg));
    
  }

  public void move() {
    System.out.println("Грузовик " + getId() + " едет по трассе со скоростью 70 км/ч");
  }
  
  public boolean getHasTrailer() { return hasTrailer; }

}
