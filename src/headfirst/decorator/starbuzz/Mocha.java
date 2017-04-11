package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
    Beverage beverage; //has-a ���� ���̾Ƹ�� ���°� 
    // String description="Unknown Beverage"; �ؿ������Ƿ� �ʿ������
    public Mocha(Beverage b){
      this.beverage=b; //black-diamond�� �ȴ�. Mocha�� ��������½������� ���� ���������.
      
    }
   
    public String getDescription(){
      return beverage.getDescription()+" adding Mocha";
    };
    public double cost(){
      return beverage.cost()+.20;
    }
}