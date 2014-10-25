/*Object 클래스
 - 자바 최상위 클래스이다.
 - 슈퍼 클래스를 지정하지 않으면 자바 컴파일러는
   자동으로 Object를 상속받게 한다.
   
   -Object 클래스의 주요 메서드
   1)toString() : 인스턴스 정보 출력
     - 기본 리턴 값 : 클래스명@해시값
 */
package java01e.test49;

public class Student {
  String name;
  int age;
  
  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  @Override    //toString()을 재정의
  public String toString() {
    return name + "," + age;
  }
  
}
