package headfirst.decorator.starbuzz;
  

public abstract class CondimentDecorator extends Beverage{
  //Beverage b;
  //public CondimentDecorator(Beverage b){ //Condiment안에 Beverage있다.
  //  this.b=b; 
  //}
  
  
  // String description="Unknown Beverage";
   public abstract String getDescription();//get+속성->return 인자
  
  // public abstract double cost();

}