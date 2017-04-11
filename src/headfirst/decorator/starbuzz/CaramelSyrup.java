package headfirst.decorator.starbuzz;

public class CaramelSyrup extends CondimentDecorator{
   Beverage beverage; //has-a ���� ���̾Ƹ�� ���°� 
    // String description="Unknown Beverage"; �ؿ������Ƿ� �ʿ������
    public CaramelSyrup(Beverage b){
      this.beverage=b; //black-diamond�� �ȴ�. Mocha�� ��������½������� ���� ���������.
      
    }
   
    public String getDescription(){
      return beverage.getDescription()+" adding CaramelSyrup";
    };
    public double cost(){
      return beverage.cost()+.10;
    }

}