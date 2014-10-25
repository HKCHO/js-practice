/*method(function)
 -특정 기능을 수행하는 명령어를 묶어 놓은 것.
 -파라미터 : 기능을 수행하는데 필요한 정보를 전달
 -리턴 값: 기능을 수행한 후 결과를 전달한다.
 -문법
    공개범위 스태틱여부 리턴타입Method(Type Variable, Type Variable, ....){
     return value;
   }
   
   예)
   int plus(int i, int b) {
     return i + b;
   }

 */

package java01e;

import java.util.Scanner;
//주제 : 사용자로부터 두 개의 값과 연산자를 입력받아 계산한 후
//     그 결과를 출력한다.
//실행 예)
//   $ 값1? 10
//   $ 값2? 20
//   $ 연산자? +
//   $ 10 + 20 = 30 입니다.


//단계 2: method 도입 => 값을 계산하는 명령어를 별도의 메서드로 분리하라
//method명 compute
//파라미터는: v1,v2,op
//return : v1, v2의 연산결과
public class test27_03 {
  // void : 리턴하는 결과가 없다.

  
  static int compute (                   //compute method
      int v1, int v2, String op){
           
      int result = 0;
          
      switch(op){
      case "+" : result = v1 + v2; break;
      case "-" : result = v1 - v2; break;
      case "/" : result = v1 / v2; break;
      case "%" : result = v1 % v2; break;
      case "*" : result = v1 * v2; break;
      
      default : System.out.print("유효하지 않은 연산자입니다.");
      
      
    }
      return result;
      
  }
  
  static void displayResult(                   //displayResult method
      int v1, int v2, String op, int result) {
    
      System.out.println("******************************");
      System.out.println(v1 +" "+ op + " " + v2 + " = " + result );    
      System.out.println("******************************");
      
  }
 
  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("값1? :");
      int v1 = Integer.parseInt(scanner.nextLine());
      
      
      System.out.print("값2? :");
      int v2 = Integer.parseInt(scanner.nextLine());
      
      
      System.out.print("연산자? :");
      String op = scanner.nextLine();
      
            
      int result = compute(v1, v2, op);   
      
      
      //method 호출 : 반드시 호출할 때 정확하게 파라미터를 넘겨야 한다.
      displayResult(v1, v2, op, result);
      
  }  
  
}
     
            
  



  
  