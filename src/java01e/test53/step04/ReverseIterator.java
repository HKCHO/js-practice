/*







*/

package java01e.test53.step04;

public class ReverseIterator {
  String[] list;
  int cursor;
  
  public ReverseIterator() {
    
  }
  
  public ReverseIterator(String[] list) {
    this.list = list;
    cursor = list.length - 1; //배열의 끝 index 가리킴.
  }
  
  public void setList(String[] list) {
    this.list = list;
  }
  
  public boolean hasNext() {
    if (cursor >= 0)
      return true;
    
    else
      return false;
  } 
  
  public String next() {
    return list[cursor--];
  }
}
