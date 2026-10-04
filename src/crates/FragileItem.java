package vroom.src.crates;

public class FragileItem extends BaseCargo {
  boolean requiresSpecialHandling;

  public FragileItem(String id, String name, double weight, boolean requiresSpecialHandling) {
    super(id, name, weight);
    this.requiresSpecialHandling = requiresSpecialHandling;
  }

  @Override 
  public String getType() {
    return "Хрупкий объект";
  }

  public boolean getSpecialHandling() { return requiresSpecialHandling; }

}
