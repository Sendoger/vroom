package vroom.src.cars;
import java.util.List;

public class FleetManager {
    public void startDelivery(List<Vehicle> fleet) {
        for (Vehicle v : fleet) {
            v.move();  // полиморфный вызов
        }
    }
}

