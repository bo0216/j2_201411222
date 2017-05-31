package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null; //null로 해놓고 필요할 때 연결
    Statement stmt = null;
    ResultSet rs=null;
    
    try{               //IO할때 try-catch문 사용
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(Strindg url, String user, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test"."root","root");//4단계
      conn=DriverManager.getConnection(
           prop.getProperty("URL"),
           prop.getProperty("USER"),
           prop.getProperty("PASSWORD"));
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";//DDL(생성)
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
     // stmt = conn.createStatement(); //executequery의 경우 리턴되는 것은 ResultSet    
      //stmt.execute(mySql);
      String mySql="insert into persons(name,address) values('v0-1','1 Hongi Dong')";
      stmt = conn.createStatement(); //executequery의 경우 리턴되는 것은 ResultSet    
      stmt.execute(mySql);
      mySql="insert into persons(name,address) values('v0-2','2 Hongi Dong')";
      //stmt = conn.createStatement(); //executequery의 경우 리턴되는 것은 ResultSet    
      stmt.execute(mySql);
      mySql="delete from persons where id=3 limit 1";
      //stmt = conn.createStatement(); //executequery의 경우 리턴되는 것은 ResultSet    
      stmt.execute(mySql);
      
      rs=stmt.executeQuery("SELECT name FROM persons WHERE id < 20 ORDER BY id");
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }
      
      //execute return타입은 boolean
      //execute update
    } catch(Exception e){
      e.printStackTrace();
    } finally{
       
      try{
        if(rs!=null)rs.close();
        if(stmt != null)stmt.close();//안닫아놓으면 메모리 초과 ->
        if(conn != null)conn.close();
      } catch(Exception e){}     
      }
      }
}
