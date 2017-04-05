package com.sd.turtle;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;

public class BabyTurtle extends Observable{ //observable이 클래스라 extends bservable,turtle 는 안됨
  Turtle baby;//turtle을 상속이아니라 속성으로 가지고 있느것임
  //turtle과 babyturtle 은 연관관계라 필요한 것만 가져다 쓰면됨.
  Double myCurpos;
  ArrayList<Observer> obs;

  public void addObserver(Observer o){
    obs.add(o);
  }
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this,1);//1은 아무의미없음 써도되고 안써도됨.
  }
  protected void setChanged(){
    myCurpos=baby.getPos();
    //notifyObservers();
  }
  public void move(int x,int y){
    baby.moveTo(x,y);
  
  }
  }
       
  
  
    
  