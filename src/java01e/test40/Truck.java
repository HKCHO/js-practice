/*상속(Inherit)
 - 기존의 코드 재사용.
 - 기능을 추가하거나 변경할 때 기존의 코드를 손대지 않고 하는 방법
 - 굳이 소스가 없어도 된다.
 - Grammar =>class + SubclassName + extends + SuperClassName{
     추가할 인스턴스 변수;
     추가할 메서드(연산자)
   }
 - 상속을 해주는 클래스 : SuperClass | ParentClass
 - 상속을 받는 클래스 : SubClass | ChildClass
 - 상속 원리 : Subclass는 SuperClass의 모든 Variables와 Method를 가져오는 것은 아니다 <= 중요
           단지 , SuperClass의 대한 Information을 갖고 있을 뿐.
         =>따라서 서브 클래스를 사용하려면 반드시 수퍼 클래스가 있어야 한다.
         
 - OOAD (Object Oriented Analysis and Design) => 모델링 표기법
     => Ivar Jacobson, James Rumbaugh, Grady Booch (Three Amigo)에 의해 모델링 표기법 탄생
     => Unified Modeling Language 탄생 => 
 
 */

package java01e.test40;

public class Truck extends Car{
  float weight = 1000; // 단위 kg : 초기화 문장을 통해 변수의 값을 1000kg로 설정한다.
  boolean autoDump;
  //개발자가 클래스에 대해 생성자를 만들지 않으면,
  //컴파일러가 자동으로 기본 생성자를 만들어 준다.
  //public Truck() {}     <=기본 생성자
  
  public Truck() {
    //생성자를 정의할 때 super 클래스의 생성자를 호출하는 문장을 작성하지 않으면
    //다음과 같이 수퍼클래스의 기본 생성자를 호출하는 문장이 자동으로 추가된다.
    //=> 그래서 서브 클래스의 생성자가 실행되기전에 반드시 수퍼클래스의
    //  생성자가 먼저 실행된다.
    // 주의! 수퍼 클래스의 생성자를 호출하는 문장이 제일 먼저 와야한다.
    // 그러지 않으면 오류 발생!
   // super(); // <- Constructor Call은 항상 첫번째에 위치해야 한다.
    
    autoDump = true; 
   
}
  
}







