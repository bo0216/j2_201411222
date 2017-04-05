package com.sd.turtle;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;

public class BabyTurtle extends Observable{ //observable�� Ŭ������ extends bservable,turtle �� �ȵ�
  Turtle baby;//turtle�� ����̾ƴ϶� �Ӽ����� ������ �ִ�����
  //turtle�� babyturtle �� ��������� �ʿ��� �͸� ������ �����.
  Double myCurpos;
  ArrayList<Observer> obs;

  public void addObserver(Observer o){
    obs.add(o);
  }
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this,1);//1�� �ƹ��ǹ̾��� �ᵵ�ǰ� �Ƚᵵ��.
  }
  protected void setChanged(){
    myCurpos=baby.getPos();
    //notifyObservers();
  }
  public void move(int x,int y){
    baby.moveTo(x,y);
  
  }
  }
       
  
  
    
  