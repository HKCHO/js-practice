/*1단계
- 하드코딩 되어있는 데이터를 순차적으로 출력하기
 */

package java01e.test53.step01;

public class Iterator {
  String[] list;
  int cursor;
  public Iterator(String[] list) {
    this.list = list;
  }
  
  public boolean hasNext() {
    if (cursor < list.length)
      return true;
    
    else
      return false;
  } 
  
  public String next() {
    return list[cursor++];
  }
}
