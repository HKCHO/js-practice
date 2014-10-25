/*추상클래스(abstract class)
 - 그 자체로 사용하지 않는 클래스
 - 단지 서브 클래스에게 공통 속성이나 메서드를 물려주기 위해 만든 클래스
 - 인스턴스를 생성할 수 없다.
 - 문법 : abstract class 클래스 명
 
 
 - 용어정리!
 
    -> 일반 클래스(Concrete Class)
        ->Packagemember Class(패키지 멤버 클래스)
        ->Inner Class(중첩 클래스, 내부 클래스)
            a. Top level inner class
            b. member inner class
            c. loval inner class
            d.anonymous inner class
            
    
    -> 추상 클래스(Abstract Class)
 */
package java01e.test43;

abstract public class Car {

  String maker;
  String model;
  int cc;
  int capacity;
  java.util.Date releaseDate;

}
