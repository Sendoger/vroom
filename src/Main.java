package vroom.src;

import java.util.ArrayList;

import vroom.src.cars.*;
import vroom.src.crates.*;
import vroom.src.report.Report;

public class Main {
  public static void main(String[] args) {
  
    Car car = new Car("5-12", 4);
    Truck truckNoTrailer = new Truck("55-1",1000,false);
    Truck truckTrailer = new Truck("2-08",1000, true);
    Drone drone = new Drone("3-12", 50);
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(car);
    vehicles.add(truckNoTrailer);
    vehicles.add(drone);
    FleetManager fleet = new FleetManager();
    fleet.startDelivery(vehicles);

    System.out.println(truckNoTrailer.getMaxCapacityKg());
    System.out.println(truckTrailer.getMaxCapacityKg());
    
    StandardBox box = new StandardBox("67-0", "AliExpress", 5);
    RefrigeratedContainer fridge = new RefrigeratedContainer("13-5", "Boch", 500, -50);
    FragileItem fragile = new FragileItem("34-2", "vase", 2, false);
    FragileItem extraFragile = new FragileItem("11-1", "isotope of uranium", 100000000, true);
    
    System.out.println(box.getType());
    System.out.println(fragile.getType());
    System.out.println(extraFragile.getType());
    System.out.println(fridge.getType());

    ArrayList<ITrackable> trackables = new ArrayList<>();
    trackables.add(drone);
    trackables.add(truckNoTrailer);
    //trackables.add(car); ошибка

    LogisticsCenter logistics = new LogisticsCenter();
    logistics.dispatch(trackables);
    logistics.monitorFleet(trackables);

    Warehouse<StandardBox> standardWarehouse = new Warehouse<>();
    Warehouse <FragileItem> fragileWarehouse = new Warehouse<>();

    standardWarehouse.addItem(box);
    fragileWarehouse.addItem(extraFragile);
    fragileWarehouse.addItem(fragile);
    //standardWarehouse.addItem(fragile); тип не соответсвует заданному
    Report<Warehouse<StandardBox>> reportStandard = new Report<>(standardWarehouse);
    Report<Warehouse<FragileItem>> reportFragile = new Report<>(fragileWarehouse);
    reportStandard.printReport();
    reportFragile.printReport();
  }
}
