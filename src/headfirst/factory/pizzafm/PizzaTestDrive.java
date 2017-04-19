package headfirst.factory.pizzafm;



public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
  PizzaStore smStore = new SMPizzaStore();
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("보경 ordered a " + pizza.getName() + "\n");
  pizza = chicagoStore.orderPizza("cheese");
  System.out.println("가을 ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("cheese");
  System.out.println("나영 ordered a " + pizza.getName() + "\n");
 }}