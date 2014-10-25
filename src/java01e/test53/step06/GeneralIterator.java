package java01e.test53.step06;

public class GeneralIterator extends AbstractIterator {
  int cursor;

  public GeneralIterator() {}

  public boolean hasNext() {
    if (cursor < list.length)
      return true;    
    else
      return false;
  }   
  public String next() {
    return list[cursor++];
  }

  @Override
  public void setList(String[] list) {
    // TODO Auto-generated method stub
    
  }
}
