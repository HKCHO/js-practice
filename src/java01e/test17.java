/*조건문 quiz
 -프로그램 아규먼트로 나이를 입력받아 청소년,청년, ...
 -참고 문법:
   문자열을 숫자로 바꾸는 방법
   String s = "23";
   int i = Integer.parseInt(s);
 */

package java01e;

public class test17 {
  public static void main(String[] args) {
    
    for (int i=0; i < args.length; i++){
    
   int age = Integer.parseInt(args[i]);
    
    if (age < 18) {
      System.out.println("청소년입니다.");
    }else if (age >= 18 && age < 40){
      System.out.println("청년입니다.");
    }else if (age >= 40 && age < 50){
      System.out.println("장년입니다.");
    }else if (age >= 50 && age < 65){
      System.out.println("중년입니다.");
    }else {
      System.out.println("노인입니다.");
    }
    
    }
  }
   
}

