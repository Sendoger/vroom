package vroom.src.report;

import vroom.src.crates.Warehouse;

public class Report<T extends Warehouse<?>> {
  T data;

  public Report (T data) {
    this.data = data;
  }

  public void printReport() {
    System.out.println(data.toString() + ". Общий вес: " + data.getTotalWeight());
  }
}
