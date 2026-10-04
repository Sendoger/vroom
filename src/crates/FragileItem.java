package vroom.src.crates;

public class FragileItem extends BaseCargo {
  boolean requiresSpecialHandling;

  public FragileItem(String id, String name, double weight, boolean requiresSpecialHandling) {
    super(id, name, weight);
    this.requiresSpecialHandling = requiresSpecialHandling;
  }

  @Override 
  public String getType() {
    return String.format("Это хрупкий объект, id: %s, %s", 
                          getId(), getSpecialHandling() ? "необходимо ОЧЕНЬ БЕРЕЖНОЕ ОТНОШЕНИЕ" : "можно немножко попинать");
  }

  public boolean getSpecialHandling() { return requiresSpecialHandling; }

}
