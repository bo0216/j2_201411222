package com.sd.sort.v2;
import ch.aplu.turtle.*;
import com.sd.turtle.Weightturtle;

import java.util.Comparator;
public class TurtleComparator implements Comparator<Weightturtle> {
    public int compare(Weightturtle t1, Weightturtle t2) {
        return t1.getWeight()-t2.getWeight();
    }
}