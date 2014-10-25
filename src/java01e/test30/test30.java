/*인스턴스 변수(Instance Variable)
 
 -값을 개별적으로 관리할 필요가 있을 때 사용.
 
*/

package java01e.test30;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Minus;

// 주제 : Calculator의 기능을 이용하여 다음 계산을 수행하라!
// 단 계산은 순차적으로 실행하라!(즉, 연산자 우선순위 무시)
// 다음 두 개의 식을 동시에 계산하라!




  



//단계 7: result variable을 maintain individual => instance variable
public class test30 {
  public static void main(String[] args) {

    
 // 10 + 2 * 7 - 4 / 2 = ?
 // 20 * 3 + 76 - 5 = ?   <-   이 결과를 저장할 인스턴스를 준비한다.
    
    // Calculator 클래스의 명령에 따라 준비된 메모리를 => 인스턴스(Instance)
    // 그 인스턴스 메모리의 주소를 저장하는 변수를 => 레퍼런스(Reference)
    
    Calculator c1 = new Calculator();   //Calculator Instance. c1 :reference
    Calculator c2 = new Calculator();   //c1,c2 meaning new address(or reference)
    
    Calculator.plus(c1, 10);
    Calculator.plus(c2, 20);  // 개별적으로 계산하려고 하나 같은 result변수를 사용하고 있다.
    
    
    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 3);
    
    Calculator.multiple(c1, 7);
    Calculator.plus(c2, 76);

    Calculator.minus(c1, 4);
    Calculator.minus(c2, 5);
    
    Calculator.divide(c1, 2);
    
    System.out.println("c1의 결과는 = " + Calculator.getResult(c1));
    System.out.println("c2의 결과는 = " + Calculator.getResult(c2));
    
    //Calculator는 재사용이 가능한 함수
  }
  
}
     
            
  



  
  