/*HashSet 사용
 - data 중복을 허용하지 않는다.
 - data가 같은지 비교할 때 해시코드를 사용한다.
 - 따라서, 인스턴스가 달라도 해시코드가 같다면 같은 data로 취급한다.
 */


//ArrayList와 HashSet 중 중복 데이터의 사용 여부에 따라 선택한다.
//ArrayList는 value값이 중복되어도 reference를 다르게 가진다.
//HashSet은 value값이 중복되면 reference를 무시한다. -> 같은 data로 취급. 속도가 느리지 않다.


package java01e.test52;

import java.util.HashSet;

public class CollectionTest03 {

    public static void main(String[] args) {
      
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");
      
      System.out.println("s1 : " + s1.hashCode());
      System.out.println("s2 : " + s2.hashCode());
      System.out.println("s3 : " + s3.hashCode());
      
      System.out.println("-------------------");
      
      HashSet<String> set = new HashSet<String>();
      set.add("Hello");
      set.add("Hello");
      set.add(new String("Hello"));
      set.add("오호라");
      
      for (String value : set) {
        System.out.println(value);
      }
    }
}

