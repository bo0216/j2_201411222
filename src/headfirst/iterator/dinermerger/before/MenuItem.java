package headfirst.iterator.dinermerger.before;

public class MenuItem{
  String name;//package private
  String description;//음식 설명
  boolean vegetarian;//채식
  double price;//달러화 , 한화는 다른 타입
  public MenuItem(String n, String d, boolean v, double p){
    this.name = n;
    this.description = d;
    this.vegetarian =v;
    this. price = p;
  }//저장해야하는 성격 -> MVC 중 M의 역할을 한다.
  public String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public double getPrice(){
    return price;
  }
  public boolean isVegetarian(){
    return vegetarian;
  }
  public String toString(){
    return (name+", $" + price + "\n " + description);
  } 

}