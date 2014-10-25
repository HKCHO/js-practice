/*인스턴스 메서드
-인스턴스 주소를 줘야지만 호출할 수 있는 메서드
-문법 : 인스턴스주소.메서드();
-해설 :

 인스턴스 메서드를 호출할 때, 인스턴스의 주소를 앞에 준다.
 JVM은 인스턴스의 변수가 어떤 클래스의 변수인지 알아낸다.
 알아낸 클래스의 메서드를 호출한다.
 
 이때, 메서드 앞에 준 인스턴스의 주소를 메서드에 넘긴다.
 메서드는 JVM이 호출할 때 넘겨준 인스턴스 주소를 내부 비밀 변수에 저장한다.
 비밀변수의 이름은 this.
 
*/

package java01e.test31;


// 주제 : Calculator의 기능을 이용하여 다음 계산을 수행하라!
// 단 계산은 순차적으로 실행하라!(즉, 연산자 우선순위 무시)
// 다음 두 개의 식을 동시에 계산하라!


//단계 7: result variable을 maintain individual => instance variable
public class test31 {
  public static void main(String[] args) {

    
 // 10 + 2 * 7 - 4 / 2 = ?
 // 20 * 3 + 76 - 5 = ?   <-   이 결과를 저장할 인스턴스를 준비한다.
    
    
    Calculator c1 = new Calculator();   
    Calculator c2 = new Calculator();   
    
    c1.plus(10);
    c2.plus(20);  
    
    c1.plus(2);
    c2.multiple(3);
    
    c1.multiple(7);
    c2.plus(76);

    c1.minus(4);
    c2.minus(5);
    
    c1.divide(2);
    
    System.out.println("c1의 결과는 = " + c1.getResult());
    System.out.println("c2의 결과는 = " + c2.getResult());
    
    //동 package의 Calculator의 메서드는 앞에 this.가 숨겨져있다.(Hidden Variable)
  }
  
}
     
            
  



  
  