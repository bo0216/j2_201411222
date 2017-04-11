package headfirst.decorator.starbuzz;
  
public abstract class Beverage{
  String description="Unknown Beverage";
    public String getDescription(){//get+속성->return 인자
    return description;
  }
  public abstract double cost();
    
  
}
  
 