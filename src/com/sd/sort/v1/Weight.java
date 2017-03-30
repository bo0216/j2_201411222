package com.sd.sort.v1;
  
  public class Weight implements Comparable{
  private int kilo;
  public Weight(int k){
    this.kilo=k;
  }
  public int compareTo(Object o){
    Weight w=(Weight)o;
    return this.kilo-w.kilo;
  }
}
