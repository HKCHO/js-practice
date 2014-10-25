/*Collection API
- 목록 데이터를 다루는 클래스들
- 모든 collection 관련 클래스들은 colletion 규칙에 따라서 클래스를 만든다.

- 크게 3종류로 나눌 수 있다.
    1) list : Data의 중복 허용.
    2) Set : Data의 중복 불가.
    3) Map : key-value 쌍으로 데이터 관리    <k,v>
 */



package java01e.test52;


import java.util.ArrayList;
import java.util.ListIterator;
/* 제네릭(Generic) 사용
 - class에서 다룰 data type을 지정하는 방법.
 - 지정된 타입이 아닌 data에 대해서는 error발생 시킴.
*/

public class CollectionTest02 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add("Hello");
    list.add( new String("Hello"));
    list.add(10); //new Integer(10) <=autoboxing
    
    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("hello");
    list2.add(new String("hello"));
//  list2.add(new Integer(10));     스트링만 올 수 있기 때문이 이 행은 오류 error
    
    
    
    //이게 바로 그 유명한 Local Inner Class
    // => 특정 메서드에서만 사용할 Class라면 그 method에 variation하라.
     
    class Score {
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
  
    ArrayList list3 = new ArrayList();
    list3.add(new Score("홍길동", 100, 100, 100));
    list3.add(new Score("임꺽정", 90, 90, 90));
    list3.add(new Score("마동석", 100, 100, 100));
    
    
    // 질문 : 목록에서 Score 객체를 꺼내 이름을 출력하라!
    // 어떤 방법을 사용해도 좋다.
     Score score = null;
     for (int i = 0; i <list3.size(); i++) {
       score = (Score)list3.get(i);   //get(index) method는 리턴타입이 Object이다. 명시적 형변환(Explicit Polymorephism)으로 (Socre)타입으로 변경
      System.out.println(score.name);
    }
      
     System.out.println("----------");
     
     ArrayList<Score> list4 = new ArrayList<Score>();
     list3.add(new Score("홍길동", 100, 100, 100));
     list3.add(new Score("임꺽정", 90, 90, 90));
     list3.add(new Score("마동석", 100, 100, 100));
    
     
     //Generic 사용 이유?
     // 다른 타입의 Data 입력시 컴파일 오류!
     // => 잘못된 사용을 미연에 방지할 수 있다.
     // list4.add("Hello"); // 컴파일 오류!
     
     //질문 : 목록에서 SCore 객체를 꺼내 이름을 출력하라!
     // 어떤 방법을 사용해도 좋다.
    
     for (int i = 0; i <list4.size(); i++) {
      //Generic 사용 이유2
       // - 이미 목록에 저장된 data가 어떤 type인지 컴파일러가 알기 때문에
       //   값을 꺼낼 때 type casting 할 필요가 없다.
       score = list4.get(i);
       System.out.println(score.name);
    }
     
  }
  
}
































































































