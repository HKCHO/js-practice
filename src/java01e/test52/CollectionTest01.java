/*Collection API
- 목록 데이터를 다루는 클래스들
- 모든 collection 관련 클래스들은 colletion 규칙에 따라서 클래스를 만든다.

- 크게 3종류로 나눌 수 있다.
    1) list : Data의 중복 허용.
    2) Set : Data의 중복 불가.
    3) Map : key-value 쌍으로 데이터 관리    <k,v>
 */



package java01e.test52;
/*ArrayList 테스트
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest01 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add("Hello");
    list.add( new String("Hello"));
    list.add(10); //new Integer(10) <=autoboxing
    
    //값 꺼내기 방법1.
    /*for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }*/
    
    //값 꺼내기 방법2.
    // - for (값을 담을 변수 :배열 또는 Collection Object) {...}
    /*for (Object value : list) {
      System.out.println(value);
    }*/
    
    //값 꺼내기 방법3.
    //Iterator Object 사용하여 꺼내기
    //Iterator Pattern 
    //   - 값을 꺼낼 때 일관된 방법을 사용 => 호출하는 method가 같다.
    //  - Iterator는 값을 꺼내는 방법(Algorithm)을 객체화(Objectify) 시킨다.
    //  - 객체화(Objectify)?   별도의 독립된 명령어 블록(Command Block)으로 분리함으로써 관리하기 쉽다.
    //                      다른 알고리즘으로 대체하기 쉽다.
    Iterator iterator = list.iterator();
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
  
    
  }
  
}











































