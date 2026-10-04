package vroom.src.cars;

public class Truck extends Vehicle {
  boolean hasTrailer;
  double maxCapacityKg;
  
  public Truck(String id, boolean hasTrailer) {
    super(id, 1000);
    this.hasTrailer = hasTrailer;
    
    if (hasTrailer) {
      this.maxCapacityKg += 5000;
    }
  }

  public void move() {
    System.out.println("Грузовик выехал");
  }
  
  public boolean getHasTrailer() { return hasTrailer; }
}
