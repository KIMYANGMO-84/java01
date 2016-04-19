package step29.exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao01 {
  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/      
      stmt = con.prepareStatement("select * from MEMBERS");      
      
      rs = stmt.executeQuery();
      Member member = null;
      while (rs.next()) { 
        member = new Member();
        member.setNo(rs.getInt("MNO"));
        member.setName(rs.getString("MNAME"));
        member.setEmail(rs.getString("EMAIL"));
        member.setPassword(rs.getString("PWD"));
        member.setTel(rs.getString("TEL"));
        list.add(member);               
      }
      return list;      
    } finally {     
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }    
  }
  
  public int insert(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/  
      
      stmt = con.prepareStatement("insert into MEMBERS(MNAME,EMAIL,PWD,TEL)"
          + "values('?','?','?','?')");      
      
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      
      return stmt.executeUpdate();            
      
    } finally {      
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }
  }
  
  public int update(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/
      
      stmt = con.prepareStatement("update MEMBERS set MNAME='?',"
          + "EMAIL='?', TEL='?', PWD='?', where mno='?'");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      stmt.setInt(5, member.getNo());
      
      return stmt.executeUpdate();            
      
    } finally {            
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }  
  }
  
  public int delete(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/
      
      stmt = con.prepareStatement("delete from MEMBERS where mno='?'");      
      stmt.setInt(1, no);
      
      return stmt.executeUpdate();            
      
    } finally {            
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }
  }
}
