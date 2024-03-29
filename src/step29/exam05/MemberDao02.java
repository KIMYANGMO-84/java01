//1) PreparedStatement 적용
//2) DB 연결 정보를 외부로부터 얻는다.
// => DBMS연결 정보다 바뀌더라도 코드를 변경할 필요가 없다.
package step29.exam05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao02 {
  String jdbcDriver;
  String jdbcUrl;
  String userName;
  String password;
  
  public MemberDao02(String jdbcDriver, String jdbcUrl, String userName, String password) {    
    this.jdbcDriver = jdbcDriver;
    this.jdbcUrl = jdbcUrl;
    this.userName = userName;
    this.password = password;
  }

  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName(this.jdbcDriver);
      con = DriverManager.getConnection (this.jdbcUrl, this.userName, this.password);      
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
      Class.forName(this.jdbcDriver);
      con = DriverManager.getConnection (this.jdbcUrl, this.userName, this.password);
      
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
      Class.forName(this.jdbcDriver);
      con = DriverManager.getConnection (this.jdbcUrl, this.userName, this.password);
      
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
      Class.forName(this.jdbcDriver);
      con = DriverManager.getConnection (this.jdbcUrl, this.userName, this.password);
      
      stmt = con.prepareStatement("delete from MEMBERS where mno='?'");      
      stmt.setInt(1, no);
      
      return stmt.executeUpdate();            
      
    } finally {            
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }
  }
}
