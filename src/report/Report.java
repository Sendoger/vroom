package vroom.src.report;

public class Report<T> {
  T data;

  public Report (T data) {
    this.data = data;
  }

  public void printReport() {
    System.out.println(data.toString());
  }
}
