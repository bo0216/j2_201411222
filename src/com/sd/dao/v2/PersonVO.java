package com.sd.dao.v2;

public class PersonVO{
  private int id;
  private String name;
  private String address;
  public PersonVO(){}
  
  public void setAddress(String address){
    this.address=address;
  }
  public String getAddress(){
    return address;
  }

  public void setId(int id){
    this.id=id;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public void setName(String n){
    this.name=n;
  }
  public String toString(){
    return "ID:"+id;
  }
}