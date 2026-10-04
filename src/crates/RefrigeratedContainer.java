package vroom.src.crates;

public class RefrigeratedContainer extends BaseCargo {
  private double targetTemperature;

  public RefrigeratedContainer(String id, String name, double weight, double targetTemperature) {
    super(id, name, weight);
    this.targetTemperature = targetTemperature;
  }


  @Override 
  public String getType() {
    return "Морозильная камера";
  }

  public double getTargetTemperature() { return targetTemperature; }

}
