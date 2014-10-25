/* garbage와 garbage collector
  - Garbage란? 참조하는 변수가 없는 메모리
  - Garbage Collector? 가비지의 메모리를 해제하는 객체
 
 */

package java01e;

public class test14 {
   public static void main(String[] args) {
     int[] p = new int[5];//예) 배열의 주소가 100번지라고 하자!
     int[] p2 = new int[3]; //예) 배열의 주소가 200번지라고 하자!
     int[] p3 = p;
     
     p3[2] = 100;
     System.out.println(p[2]);
     
     p2 = p; //p2는 100번지 => 200번지의 주소를 잃어버렸기 때문에 가비지가 된다.
                 //해당 배열은 garbage가 된다.
     
     for (int i=0; i < p2.length; ++i){
     System.out.println(p[i]);
     
     // 200번지 배열의 주소는 누가 갖고 있는가?
     // 갖고 있는 변수가 없다! => 200번지 배열은 쓰레기(garbage)가 되었다!
    // Garbage는 언제 청소 하는가? (사용 될 수 없는 메모리 해제 시점은?)
    // 1) idle time
     // 2) 메모리가 부족할 때
     //   *잠깐 실행하는 경우는 garbage collector is not function!
     // Garbage가 생겼다고 가비지 컬렉터가 즉시 동작하는 것이 아니다. <= 강조강조강조!!!!!!!!!!!!!!!
     //   실무에서는 가비지 생성을 최소화 하도록 프로그래밍을 한다.
     //
   
     
   }
   }
}































































