package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator{
   Beverage beverage; //has-a ���� ���̾Ƹ�� ���°� 
    // String description="Unknown Beverage"; �ؿ������Ƿ� �ʿ������
    public Milk(Beverage b){
      this.beverage=b; //black-diamond�� �ȴ�. Mocha�� ��������½������� ���� ���������.
      
    }
   
    public String getDescription(){
      return beverage.getDescription()+" adding Milk";
    };
    public double cost(){
      return beverage.cost()+.10;
    }


}