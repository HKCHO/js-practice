/*







*/

package java01e.test53.step05;

public class ReverseIterator extends Iterator {
  int cursor;
  
  public ReverseIterator() {}
  
  public ReverseIterator(String[] list) {
    this.list = list;
    cursor = list.length - 1; //배열의 끝 index 가리킴.
  }
  
  @Override
  public void setList(String[] list) {
    /* super 키워드 : 오버라이딩 전의 method를 가리킬 때 사용.
     *  - super는 super class를 가리키는 것이 아니다! 주의요망!*/
    super.setList(list);  //기존 기능은 그대로 두고
    cursor = list.length - 1; // 새 명령 추가
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
