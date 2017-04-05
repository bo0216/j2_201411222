package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class TurtleObserverMain {
    public static void main(String[] args) {
        System.out.println("--Observer pattern demo");
        //turtle subject
        BabyTurtle baby=new BabyTurtle();
        //turtle observer
        MomTurtle mom=new MomTurtle();
        baby.addObserver(mom);
        //mom goes to somewhere
        mom.moveTo(100,100);
        //baby moves and let mom know it
        baby.move(100,-100);
        //protected method -> others can not set any changes
        baby.setChanged();
        baby.notifyObservers();
    }
}