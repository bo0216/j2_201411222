package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{
  
  //String description="Espresso";
  //Stirng description;
  public Espresso(){
    description="Espresso";
  }
  //public String getDescription(){//get+속성->return 인자
  //return description;
  
  
  public double cost(){
    return 1.99;
  }

}

/*
> import headfirst.decorator.starbuzz.Espresso;
> Espresso e=new Espresso();
> System.out.println(e.getDescription());
Espresso 
> System.out.println(e.cost());
1.99 
*/