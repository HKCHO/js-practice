/*import
 -다른 패키지에 있는 class를 사용하려면 반드시 패키지 이름을 지정해야 한다.
 예) java.util.ArrayList
 
 
 -그러나 import문을 사용하여 미리 Class의 정보를 Compiler에게 알려줄 수 있다.
 예) import java.util.Array;
 
 
 -또는 Class가 소속되어 있는 Package 이름을 알려줄 수 있따
 예)import java.util.*;
 
 
 -가능한 Class이름까지 알려주는게 Source Code 해석에 도움이 된다.
  컴파일 속도도 더 빠르다.
 
 */

package java01e;

//import문은 compiler가 참조하는 명령어다
//compile 후 제거된다.

import java.util.ArrayList;

public class test26 {
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
