/*상수 문자열
- "문자열"식으로 표현
- 내부적으로 String 클래스의 인스턴스를 생성한다.
- String Pool 영역에 생성한다.
- 중복 생성되지 않는다.


Method Area영역에 클래스가 로딩되면,
각 클래스 별로 상수 문자열의 String Instance가 준비된다.

Method Area 영역에 준비되는 상수 문자열을 준비하는 메모리 영역을
상수풀(Constant Pool)이라고 이야기한다.

*String Pool
- 상수 문자열을 보관하는 메모리 영역
- Method Area의 일부분이다.
- 상수 문자열은 자주 사용되기 때문에, 메모리 낭비를 줄이기 위해
 스트링 풀이라는 영역에 통합 관리한다.
- 같은 상수 문자열이 존재할 수 없다. => 중복 생성되지 않는다.
 */


package java01e.test50;


class A {
  static String str1 = "Hello";
  static String str2 = "Hello";    
 }
 
class B {
   static String str1 = "hello";
   static String str2 = "hello";      
 }

public class StringTest02 {
  static String str1 = "hello";
  static String str2 = "hello";

  //특정 클래스 안에서만 사용할 클래스라면, 그 클래스 내부에 선언하라!
  // => 중첩 클래스(Inner Class)라고 부른다.

  
   public static void main01(String[] args){
    if (str1 == str2) System.out.println("str1 == str2");
    if (A.str1 == A.str2) System.out.println("A.str1 == A.str2");
    if (B.str1 == B.str2) System.out.println("B.str1 == B.str2");
  }
  
  public static void main(String[] args) {
    String str1 = "hello"; //String Pool에 인스턴스 생성 후 주소 리턴
    String str2 = "hello"; //기존 인스턴스의 주소 리턴
    String str3 = new String("hello");  // Heap에 인스턴스 생성
    
    if (str1 == str2) System.out.println("str1 == str2");
    if (str1 != str3) System.out.println("str1 != str3");
    
    //자바는 문자열을 객체로 다룬다.
    //문자열을 비교할 때는 equals()를 사용하라!
    
    //객체이기 때문에 == 연산자는 문자열이 아닌 주소를 비교하므로
    //문자를 비교할 수 없다.
    
    if (str1.equals(str3))
      System.out.println("str1.equals(str3");
    
    
  }

}
