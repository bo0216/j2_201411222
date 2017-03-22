package headfirst.strategy;

public class MallardDuck extends Duck { 
 public MallardDuck() { 

  quackBehavior = new Quack();
  setFlyBehavior(new FlyWithWings()); 
  //flyBehavior = new FlyWithWings();

 }

 public void display() {
  System.out.println("I'm a real Mallard duck");
 }
}


