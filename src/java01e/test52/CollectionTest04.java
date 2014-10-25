/*HashMap 사용하기
 - key-value combination 으로 data를 관리한다.
 - key로 사용할 클래스는 hashCode(), equals()를 재정의해야한다.
     => instance가 다르더라도 값이 같으면 hashcode를 리턴하도록 구현해야한다.
     => 값이 같으면 equals()가 true를 리턴한다.
 - 기존에 자바에서 제공하는 클래스들 중에너 String와 wrapper 클래스들은 
   hashCode()와 equals()를 재정의했기 때문에 사용할 수 있다.      
 */

package java01e.test52;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTest04 {
/* member inner class
 - Instance Method나 같은 Member Innerclass만이 이 클래스를 사용할 수 있다.
   참고 : 클래스 멤버란?   클래스를 구성하고 있는 elements(variables, methods, inner class)
 */
  
  
  /*Top Level Inner Class
  - member inner class에 static을 붙인 class.
  - class method나 static 블록에서 사용할 수 있다.
   */
  static class Score {
    String name;
    int kor;
    int eng;
    int math;

    public Score(String n, int k, int e, int m){
      name = n;
      kor = k;
      eng = e;
      math = m;
    }
  }

    //스태틱 블록에서는 오로지 class variables 및 class method만 사용할 수 있다.
    /* 이유
     class A {
       int value;
       
       void print() { System.out.println(value);}
       
       static void test() {
         print(); //호출 가능 하다면 어떤 일이 벌어질까요?
       }
     }
     */
 
  
  public static void main(String[] args) {
    
    HashMap<String, Score> map = new HashMap<String,Score>();
    map.put("1111", new Score("홍길동" , 100 , 100 , 100));
    
    map.put("1111", new Score("임꺽정" , 100 , 100 , 100));
    map.put("2222", new Score("유관순" , 100 , 100 , 100));
    
    System.out.println(map.get("1111").name);
    System.out.println(map.get("2222").name);
    
    
    // 질문 : 키를 모른다고 가정하고 map에 저장된 값을 모두 출력하시오~!
    // 힌드 : API 문서를 보시오
    
   
    //방법 1 : EntrySet 활용
   System.out.println("-----------------------------------------");
   Set<Entry<String,Score>> kvSet  = map.entrySet();
   for (Entry<String,Score> entry : kvSet) {
     System.out.println(entry.getKey() + ":" + entry.getValue().name);
   }
   
   //방법 2 : 먼저 Key 목록을 얻은 다음에, 그 키를 사용하여 값을 꺼내기
   System.out.println("-----------------------------------------");
   Set<String> keySet = map.keySet();
   for (String key : keySet) {
     System.out.println(key + ":" + map.get(key).name);
   }
 
   //방법 3 : key 값을 알 필요가 없다면, 값만 꺼내기.
   System.out.println("-----------------------------------------");
   Collection<Score> valueList = map.values();
   for (Score value : valueList) {
     System.out.println(value.name);
   }
   
  }
}































