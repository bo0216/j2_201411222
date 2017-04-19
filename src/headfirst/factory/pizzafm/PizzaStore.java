package headfirst.factory.pizzafm;

public abstract class PizzaStore{
  abstract Pizza createPizza(String item);//item,type �������
  public Pizza orderPizza(String type){
    Pizza pizza;
    //pizza=f.createPizza(type);
    pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
  
  
  
}

  