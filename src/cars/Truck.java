package vroom.src.cars;

public class Truck extends Vehicle {
  private boolean hasTrailer;
  
  public Truck(String id, boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
    //6000 with trailer, 1000 without
    super(id, (hasTrailer ? 6000 : 1000));
    
  }

  public void move() {
    System.out.println("Грузовик " + getId() + " едет по трассе со скоростью 70 км/ч");
  }
  
  public boolean getHasTrailer() { return hasTrailer; }

}
