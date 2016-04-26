//1) PreparedStatement 적용
//2) DB 연결 정보를 외부로부터 얻는다.
// => DBMS연결 정보다 바뀌더라도 코드를 변경할 필요가 없다.
//3) 커넥션 한 개만 생성하여 공유하기
// => 메서드가 호출될 때마다 커넥션을 맺고 실행한 다음 커넥션을 끊으면
// => 실행속도가 느려진다.
// 그래서 DAO를 생생할 때 미리 커넥션을 준비해 두었다가 사용하도록 한다.
// 즉 selectList(), insert(), update(), delete는 커넥션을 공유한다.
package step33.exam11;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // DAO 처럼 데이터를 처리하는 객체에 붙인다
public class MemberDao {    
  
  @Autowired
  SqlSessionFactory sqlSessionFactory; 

  @Override
  public String toString() {
    return "MemberDao [sqlSessionFactory=" + sqlSessionFactory + "]";
  }
  public List<Member> selectList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectList("MemberDao.selectList");
    } finally {     
      sqlSession.close();
    }    
  }  
  public int insert(Member member) throws Exception {    
   SqlSession sqlSession = sqlSessionFactory.openSession(true); //< true값을 넘기면 autocommit설정
    try {           
      return sqlSession.insert("MemberDao.insert", member);            
      
    } finally {      
      sqlSession.close();
    }
  }
  
  public int update(Member member) throws Exception {    
    SqlSession sqlSession = sqlSessionFactory.openSession(); //< true값을 넘기면 autocommit설정  
    try {      
      int count = sqlSession.update("MemberDao.update", member);
      sqlSession.commit();
      return count;
    } finally {            
      sqlSession.close();
    }  
  }
 
  public int delete(int no) throws Exception {    
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {      
      int count = sqlSession.delete("MemberDao.delete", no);
      sqlSession.commit();
      return count; 
    } finally {            
      sqlSession.close();
    }
  }
}
