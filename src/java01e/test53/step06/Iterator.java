/*Iterator를 클래스에서 자격을 의미하는 인터페이스로 바꾼다.
 - 인터페이스? 자격, 규칙
 - 인터페이스 문법 : 
   자격, 규칙에 대한 method를 declare.
   상수 클래스 변수가 올 수 있다.
   
   메서드타입 : abstract public
   변수타입 : public static final 
 */
package java01e.test53.step06;

//자격을 갖추기 위해서 가져야 할 메서드를 선언한다.
public interface Iterator {
  /*public static final*/ int i = 10;
  /*abstract public(생략 가능)*/ void setList(String[] list);
  /*abstract public*/ boolean hasNext();
  /*abstract public*/ String next();
}
