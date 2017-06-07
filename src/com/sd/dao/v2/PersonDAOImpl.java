package com.sd.dao.v2;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class PersonDAOImpl implements PersonDAO{
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  
  public void insert(PersonVO p){
    try{
      
      String mySql="insert into persons(name,address) values(NULL,?,?)";
      PreparedStatement pstmt=conn.prepareStatement(mySql);   //?������ preparedStatement�ʿ�
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  
  public PersonVO findById(int id){
    PersonVO p=null;
      try{
      pstmt=conn.prepareStatement("SELECT * FROM persons WHERE id=?");
      pstmt.setInt(1,id);
      System.out.println("finding by id..."+id);
      rs=pstmt.executeQuery();
      if(rs.next()==true){ //primaryKey id�� �޾ƿ��°��̱⶧���� while�̾ƴ϶� if��t �� ����Ѵ�
        p=new PersonVO();
        p.setId(rs.getInt("id")); //���⼭ id�� ���̺� �Ӽ����̴�.
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
      }
    } catch(SQLException e){
      e.printStackTrace();
      
    }
    return p;
  }
  
  public List<PersonVO> findAll(){
    List<PersonVO> persons=new ArrayList<PersonVO>();
    Statement stmt=null;
    try{
      stmt=conn.createStatement();
      rs= stmt.executeQuery("SELECT * FROM persons");
      PersonVO p=null;
      while(rs.next()){
        p=new PersonVO();
        p.setId(rs.getInt("id")); //���⼭ id�� ���̺� �Ӽ����̴�.
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p);
      }
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
        if(stmt!=null)stmt.close();
      }catch(Exception e){};
    }
    return persons;
  }
  public void update(PersonVO p){
    try{
     pstmt=conn.prepareStatement("UPDATE persons SET name=?,address=? WHERE id=?");
     pstmt.setString(1,p.getName());
     pstmt.setString(2,p.getAddress());
     pstmt.setInt(3,p.getId());
     System.out.println("updating...");
     pstmt.executeUpdate();
         
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  public void delete(int id){
    try{
      pstmt=conn.prepareStatement("DELETE FROM persons WHERE id=?");
      pstmt.setInt(1,id);
      int rows=pstmt.executeUpdate();//������ ���������� �˼�����
      if(rows==0){
        System.out.println("Can not delete...");
      }
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  public void delete(PersonVO p){
    try{
      pstmt=conn.prepareStatement("DELETE FROM persons WHERE name=?");
      pstmt.setString(1,p.getName());
      pstmt.executeUpdate();
      
    }catch(SQLException e){
      e.printStackTrace();
    }
    
  }
  public void close(){
    System.out.println("closing all...");
    try{
      if(rs!=null)rs.close();
      if(pstmt != null)pstmt.close();//�ȴݾƳ����� �޸� �ʰ� ->
      if(conn != null)conn.close();
    } catch(Exception e){}     
    
  }
  
}