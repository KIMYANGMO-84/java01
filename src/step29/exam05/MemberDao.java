//1) PreparedStatement 적용
//2) DB 연결 정보를 외부로부터 얻는다.
// => DBMS연결 정보다 바뀌더라도 코드를 변경할 필요가 없다.
//3) 커넥션 한 개만 생성하여 공유하기
// => 메서드가 호출될 때마다 커넥션을 맺고 실행한 다음 커넥션을 끊으면
// => 실행속도가 느려진다.
// 그래서 DAO를 생생할 때 미리 커넥션을 준비해 두었다가 사용하도록 한다.
// 즉 selectList(), insert(), update(), delete는 커넥션을 공유한다.
package step29.exam05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
  DataSource dataSource;  
  
  public DataSource getDataSource() {
    return dataSource;
  }
  
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public MemberDao() {}
  
  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();    
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      con = dataSource.getConnection();
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
      dataSource.returnConnection(con);
    }    
  }
  
  public int insert(Member member) throws Exception {    
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {      
      con = dataSource.getConnection();
      stmt = con.prepareStatement("insert into MEMBERS(MNAME,EMAIL,PWD,TEL)"
          + "values('?','?','?','?')");      
      
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      
      return stmt.executeUpdate();            
      
    } finally {      
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }
  
  public int update(Member member) throws Exception {    
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {      
      con = dataSource.getConnection();
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
      dataSource.returnConnection(con);
    }  
  }
  
  public int delete(int no) throws Exception {    
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {      
      con = dataSource.getConnection();
      stmt = con.prepareStatement("delete from MEMBERS where mno='?'");      
      stmt.setInt(1, no);
      
      return stmt.executeUpdate();            
      
    } finally {            
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }  
}
