/*상수
- 숫자를 읽고, 이해하기 쉽도록 글자로 정의하는 것.
- 값에 대해 이름을 부여하는 것.
- 값을 암기하는 것 보다 이름을 암기하는 것이 쉽다.
- 문법:
    final int 상수변수명 = 값;
    
    final
    1) final class 클래스명 {}  => SubClass를 만들 수 없다.
    2) final 리턴타입 메서드(...) [] => SubClass에서 재정의 할 수 없다.
    3) final 데이터타입 변수명; =>값을 오로지 한번만 할당할 수 있다.
 */

package java01e.test44;

abstract public class Mover extends Unit{
  //상수 정의
  //상수는 값을 변경할 수 없다.
  // => 인스턴스마다 개별 관리할 필요가 없다.
  // => 이런 경우 상수를 클래스 변수로 만들면 된다.
  
  public static final int NORTH = 0;
  public static final int EAST = 3;
  public static final int WEST = 9;
  public static final int SOUTH = 6;

  
  //
  
  //여기서 열심히 코딩해봐야..
  // 어차피 서브 클래스에서 다시 작성해야 함.
  // 왜냐하면? 탱크와 벌쳐와 군인의 움직임 공식이 다르기 때문이다.
  //이렇게 수퍼 클래스에서 기능을 정의할 수 없는 것.
  //아니, 기능을 정의하되, 구현할 수 없는 경우!
  //해당 method를 abstract method로 만들어라!
  
  
  //추상 메서드(Abstract Method)
  // 1) 구현하지 말아야 한다.
  // 2) SubClass에게 구현을 강제하는 효과가 있다.
  // 3) Only Abstract Class can have Abstract Method.
  abstract public void move(int direction);    //SubClass에서 @Override Annotation을 이용하여 Override된다.
  
 
}
