package java01e.test53.step05;

abstract public class Iterator {
  // list instance variable을 subclass도 access 가능하도록 변경.
  protected String[] list;

  public void setList(String[] list) {
  this.list = list;
  }

  abstract public boolean hasNext();
    

  abstract public String next();

}
