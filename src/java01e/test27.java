/*Class Variable(클래스 변수)
 -class를 로딩할 때 준비되는 변수
 -Method Area에 준비됨.
 -JVM이 실행을 종료할 때 까지 유지
 -
 
 
 *로컬변수
 -함수가 호출될 때 준비되는 변수
 -stack 영역에 준비됨
 -함수 호출이 끝나면 제거된다.
 

*인스턴스 변수
-인스턴스가 생성될 때 준비되는 변수
-Heap 영역에 준비됨.
-가비지 컬렉터에 의해 해제되기 전까지 존재한다.

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


//단계 4: 클래스 변수 도입
//      => compute() 와 displayResult()에서 공유할 값을 보관
//method명 compute
//파라미터는: v1,v2, op
//return : v1, v2의 연산결과
public class test27 {
  // 클래스 변수 선언
  
  static int v1;
  static int v2;
  static String op;
  static int result;
  
  static int compute (){
           
      result = 0;
          
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
  
  static void displayResult()                   //displayResult method
       {
    
      System.out.println("******************************");
      System.out.println(v1 +" "+ op + " " + v2 + " = " + result );    
      System.out.println("******************************");
      
  }
 
  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("값1? :");
      v1 = Integer.parseInt(scanner.nextLine());
      
      
      System.out.print("값2? :");
      v2 = Integer.parseInt(scanner.nextLine());
      
      
      System.out.print("연산자? :");
      op = scanner.nextLine();
      
            
      compute();   
      
      
      //method 호출 : 반드시 호출할 때 정확하게 파라미터를 넘겨야 한다.
      displayResult();
      
  }  
  
}
     
            
  



  
  