package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList menuItems;
  public PancakeHouseMenu(){
    menuItems = new ArrayList();
    addItem("BLT1","Bacon, Lettuce, Tomato",true, 2.99);//menuitem에 하나씩 넣는 것
    addItem("BLT2","Bacon2, Lettuce2, Tomato2",true, 2.99);
  
  }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem m= new MenuItem(n,d,v,p);
    //menuItem[numberOfItems]=m;
    //numverOfItems++;
    menuItems.add(m);
  }
//  public MenuItem[] getMenuItems(){
  public ArrayList getMenuItems(){
  return menuItems;
  }
}