package java01e.test53;

import java01e.test53.step05.Iterator;

public class TripleIterator extends Iterator {
  int cursor;
  
  
  @Override
  public boolean hasNext() {
    //상속받은 변수에 접근할 수 없다
    // 이유 :list는 접근 범위가 (default)이기 때문이다.
    // 즉, default => 같은 클래스 or 패키지 멤버만 접근 가능
    // 해결책! => 자식 클래스도 접근 가능하도록 접근 범위를 조정해야한다.
    // 해결법 => protected로 선언하라 ; protected : 클래스 멤버, 패키지 멤버, subclass접근 가능
    if (cursor < list.length -1)
      return true;
      else
      return false;
  }

  @Override
  public String next() {
    String value = list[cursor];
    cursor+=3;
    return value;
  }

  
}
