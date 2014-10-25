/*맵에 데이터를 저장할 때 문자열이 아닌
 특별한 객체를 사용하기!  <-- 자바스크립트에서는 불가능
 */

package java01e.test49;

import java.util.HashMap;

public class Test49 {
  // Map에 데이터를 저장할 때 특수 키로 사용하기
  public static void main(String[] args) {
    
    
    Mykey key1 = new Mykey("1234abcd", 100, 1255);
    Mykey key2 = new Mykey("1234abcd", 100, 1255);

    Integer key3 = new Integer(10);
    Integer key4 = new Integer(10);
    
    String key5 = new String("1234abcd");
    String key6 = new String("1234abcd");
    
    HashMap fridge2 = new HashMap();
    
    // Map에 Data를 저장할 때 원리
    // Key 객체의 hash값을 사용하여 저장한다.
    
    
    // Map에서 값을 꺼낼 때 원리
    // 1) 저장할 때 사용한 키의 해시값이 같은지 조사
    // 2) equals()를 호출하여 값이 같은지 조사
    fridge2.put( key1, "보약");
    
    System.out.println(fridge2.get(key2));
    
    
    // 주소가 다름을 증명하자
    System.out.println("----------------------");
    System.out.println("key1 == key2?" + ": " + (key1 == key2));
    System.out.println("key3 == key4?" + ": " + (key3 == key4));
    System.out.println("key5 == key6?" + ": " + (key5 == key6));
    
    
    System.out.println("----------------------");
    System.out.println(key1.hashCode()); 
    System.out.println(key2.hashCode());
    System.out.println(key3.hashCode()); // key3,4   key5,6 instance 값은 다르지만 해시코드의 값은 같다.
    System.out.println(key4.hashCode());
    System.out.println(key5.hashCode());
    System.out.println(key6.hashCode());
    
    //왜 Integer 객체와 String 객체의 인스턴스들의 해시 값이 같을까?
    
    // -> Object에서 상속 받은 원래의 메서드는 인스턴스가 다르면 해시값도 다르도록 프로그램 되어있다.
    // -> 그러나, String 클래스와 Wrapper클래스(Byte, Integer, 등)는 상속받은 hashCode를 재정의 하였다
    // -> 비록 인스턴스가 다르더라도 값이 같다면 같은 해시 값을 리턴하도록 프로그램 재정의한 것이다.
    
    
    
    // equals() 리턴 값 : Instance가 같은지 비교.
    System.out.println("---------------------------");
    System.out.println("key1.equals key2?" + key1.equals(key2));  //인스턴스가 다르다.
    System.out.println("key3.equals key4?" + key3.equals(key4));  //인스턴스가 같다
    System.out.println("key5.equals key5?" + key5.equals(key6));  //인스턴스가 같다
        
  }
  

  
  // Map에 데이터를 저장할 때 문자열을 키로 사용하기
  public static void main01(String[] args) {
    
    HashMap studentMap = new HashMap();
    studentMap.put("s001", new Student("홍길동" , 20));
    studentMap.put("s002", new Student("임꺽정" , 22));
    studentMap.put("s003", new Student("조현권" , 27));
    //인스턴스를 저장할 수 없다. 인스턴스의 주소를 저장한다.
 
    System.out.println(studentMap.get("s001"));
    System.out.println(studentMap.get("s002"));
    System.out.println(studentMap.get("s003"));
    
  }
  
}
