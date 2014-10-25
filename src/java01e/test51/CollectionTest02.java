package java01e.test51;

class MyArray {
  Object[] list = new Object[3];
  int index;
  
  public String add(Object instance) {
    if (index < (list.length)) {
      list[index++] = instance;
      return "okok";
    } else {
      return "sorry";
    } 
  }
  
  public int size() {
    return index;
  }
  
  public Object get(int index) {
    return list[index];
  }
  
  
}

public class CollectionTest02 {
  
  public static void main (String[] args) {
    MyArray arr = new MyArray();
    System.out.println(arr.add("홍길동"));
    System.out.println(arr.add("임꺽정"));
    System.out.println(arr.add("장보고"));
    System.out.println(arr.add("유관순"));
    
    int size = arr.size();
    
    for (int i = 0; i < size; i++) {
      System.out.println(arr.get(i));
    }
  }
}
