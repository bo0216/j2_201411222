package com.sd.address;

import java.util.List;

public interface PersonDAO{
  public void insert(PersonVO p);
  public List<PersonVO> findAll();
  public PersonVO findByName(String name);
  public void update(PersonVO p);
  //public void delete(int id);
  public void delete(String name);

}