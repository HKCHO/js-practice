/*반복문
 
 
   -while (조건) 명령문;
   -while (조건) {....}
   
   -do 명령문; while(조건);
   -do { ... } while(조건);
   
   -for (초기화 명령문; 조건; 증가문) { ... }
   -for (variable : Array or Collection type object) { ... }
 
 */

package java01e;

import java.util.ArrayList;

public class test25 {
  public static void main(String[] args) {
    // 퀴즈
    /* 문제

     */
    int[] scores = new int[]{100, 90, 80};
    //배열에서 값을 순차적으로 꺼낸다.
    for (int value : scores) {
      System.out.println(value);
    }
    System.out.println("------------------");

    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(100);
    list.add(90);
    list.add(80);
    //Collection Object에 저장된 값을 순차적으로 하나씩 꺼낸다.
    for (Object value : list) {  // <= Array 가 아닌 Object
      System.out.println(value);
    }
  }
}
