package com.sd.turtle;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtleMain {
    public static void main(String[] ags) {
        Weightturtle wt=new Weightturtle(10);
        System.out.println("Hello weight turtle");
        wt.addStatusBar(30);
        String msg="Hello I weigh "+wt.getWeight()+" kg.";
        wt.setStatusText(msg);
    }
}