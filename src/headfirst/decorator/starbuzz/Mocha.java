package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
    Beverage beverage; //has-a 관계 다이아몬드 없는거 
    // String description="Unknown Beverage"; 밑에있으므로 필요없어짐
    public Mocha(Beverage b){
      this.beverage=b; //black-diamond가 된다. Mocha가 만들어지는시점에서 같이 만들어진다.
      
    }
   
    public String getDescription(){
      return beverage.getDescription()+" adding Mocha";
    };
    public double cost(){
      return beverage.cost()+.20;
    }
}