package vroom.src.cars;

import java.util.ArrayList;
import java.util.List;
import vroom.src.crates.CargoItem;

public abstract class Vehicle {
    private String id;
    private ArrayList<CargoItem> cargoList = new ArrayList<>();
    private double maxCapacityKg;
    private double currentLoadKg;

    public Vehicle(String id, double maxCapacityKg) {
        this.id = id;
        if (maxCapacityKg <= 0) {
            throw new IllegalArgumentException("Грузоподъёмность должна быть > 0");
        }
        this.maxCapacityKg = maxCapacityKg;
    }

    public abstract void move();

    public void load(double weight) {
        if (currentLoadKg + weight <= maxCapacityKg) {
            currentLoadKg += weight;
            
        } else {
            System.out.println("Превышен лимит загрузки для " + id);
        }
    }

    public void load(CargoItem item) { 
        if (currentLoadKg + item.getWeight() <= maxCapacityKg) {
            currentLoadKg += item.getWeight();
            cargoList.add(item);
        } else {
            System.out.println("Превышен лимит загрузки для " + id);
        }
    }

    public void load(List<CargoItem> items) {
        int counter = 0;
        for (CargoItem item : items) {
            if (currentLoadKg + item.getWeight() <= maxCapacityKg) {
            currentLoadKg += item.getWeight();
            counter++;
            cargoList.add(item);
            } else {
                System.out.println("Превышен лимит загрузки для " + id);
                break;
            }
        }

        System.out.println("Принято " + counter + " товаров из " + items.size());

    }


    public String getId() { return id; }
    public double getMaxCapacityKg() { return maxCapacityKg; }
    public double getCurrentLoadKg() { return currentLoadKg; }
    public List<CargoItem> getCargoList() { return cargoList; }
}
