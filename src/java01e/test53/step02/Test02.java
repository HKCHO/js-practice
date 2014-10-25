/* 2단계
 - 하드 코딩되어 있는 데이터 부분을 외부에서 입력 받고록
   기능 개선
 */

package java01e.test53.step02;

import java01e.test53.step01.Iterator;

public class Test02 {

  public static void main(String[] args) {
    Iterator iterator = new Iterator(args);
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}
