//주제 : 문자열로 Engine객체를 생성하는 변환기 만들기

package step33.exam08;

import java.beans.PropertyEditorSupport;

public class EnginePropertyEditor extends PropertyEditorSupport {  
  Engine engine = new Engine();
  String[] engines;
  @Override
  public void setAsText(String text) throws IllegalArgumentException {   
    try {
      engines = text.split(",");
      if (engines == null || engines.length < 3) {
        throw new Exception("Engine 타입의 형식이 맞지 않습니다.");
      }
      engine.setCc(Integer.parseInt(engines[0]));
      engine.setValve(Integer.parseInt(engines[1]));
      engine.setType(engines[2]);
      this.setValue(engine);      
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
  
}
