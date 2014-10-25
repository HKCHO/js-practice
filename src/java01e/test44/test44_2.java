/*다형성 : 다형적 변수(Polymorphic Variables)
-  
  
 */
package java01e.test44;

public class test44_2 {

  public static void main(String[] args) {
    Tank obj1 = new Tank();
    Soldier obj2 = new Soldier();
    Vulture obj3 = new Vulture();
    
    Vehicle obj4 = new Tank();
    Vehicle obj5 = new Vulture();   
    
    
    //어떤 reference는 그 클래스 또는 해당 클래스 또는 서브 클래스의 객체를 가리킬 수 있다.
    //단 수퍼 클래스의 객체는 가리킬 수 없다.
    //superClass는 subClass보다 기능이 적을 수 있기 때문에.
    
    //Vehicle obj6 = new Soldier();   -> 오류
   

    //obj4, 5, 6를 다형적 변수(Polymorphic Variables)라고 한다.
    //다형적 변수 : 변수의 쓰임이 달라지는 것.
    //obj4 라는 변수는 Vehicle 객체를 가리킬 때도 사용될 수 있고,
    //Vehicle의 서브 클래스의 객체를 가리킬 때도 사용될 수 있다.

    
    //Quiz
    //Tank와 Vulture, Soldier object를 저장할 수 있는 배열을 선언하시오
    //참조 변수 (10개를 담을 수 있는) 배열을 선언하시오
    
    Mover[] m = new Mover[10];
            //or
    Unit[] u = new Unit[10];
    
    
    //Quiz2
    //아래 v1.move(0)은 Vehicle의 move로 동작하는가 Tank의 move로 동작하는가?
    Vehicle v1 = new Tank();
    v1.move(Mover.NORTH);
    
    //SuperClass의 reference로 SubClass를 가리킬때는
    //비록 SuperClass의 Method를 호출하더라도,
    //SubClass의 Overriding Method가 있다면, 그 Method가 호출된다.
    
    
    //----------------------------------------------------------
    
    //Domain Name Service : IP Address와 이름 정보를 가지고 있는 서버
    
  }
}

































