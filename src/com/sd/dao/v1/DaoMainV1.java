package com.sd.dao.v1;

public class DaoMainV1{
  public static void main(String[] args){
    Person p;
    PersonDao pDao=new PersonDaoImpl();
    
    System.out.println("insert");
    p=new Person(0,"js1");
    pDao.insert(p);
    p=new Person(1,"js2");
    pDao.insert(p);
    
    System.out.println("find all");
    for(Person pi:pDao.findAll()){
      System.out.println("reading "+pi.getId()+", "+pi.getName());
  }
    System.out.println("update");
    p=pDao.findAll().get(0);
    p.setName("js new");
    pDao.update(p);
    
    System.out.println("see if updated");
    p=pDao.findById(0);
    System.out.println(p.getId()+","+p.getName());
    
    System.out.println("delete");
    pDao.delete(0);
    
    System.out.println("finding all after deleting...");
    for(Person pi:pDao.findAll()){
      System.out.println("reading "+pi.getId()+","+pi.getName());}
    }
}