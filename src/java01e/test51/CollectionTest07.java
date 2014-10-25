/* Iterator 설계 비법
 - Storage에서 Data를 꺼낼 때 사용하는 Construct Method
     => 데이터를 꺼내주는 담당자!
     
 - 목적 :
   Array에서 꺼내던지, LinkedList에서 꺼내던지, Stack에서 꺼내던지 간에
   Storage의 Consturction과 상관 없이, 동일한 Interface(Methods)를 사용하여 Data를 꺼내게 한다.
 */


package java01e.test51;


/* 버킷 관리 */
class MyLinkedList4 {
  /* member inner class
   - 멤버 inner 클래스는 바깥 클래스의 인스턴스에 접근 할 수 있다.
   - 메서드처럼 생각하면 된다.
   */
class Iterator {

  Bucket cursor = start;    

  public boolean hasNext() {
    if (cursor != end)
      return true;
    else
      return false;
  }

  public Object next() {
    Object value = cursor.value;
    return value;
  }
}   
   
  class Bucket {
    Object value;
    Bucket next;
  }
  
  Bucket start;
  Bucket end;
  int size;
  
  public MyLinkedList4() {
     
    start = new Bucket();
    end = start;
    
  }
  
  public Iterator iterator() {
    return new Iterator();
  }
  

  
  public int add(Object value) {
    end.value = value;
    end.next = new Bucket();
    end = end.next;
    return ++size;
  }

  public int size() {
    return size;
  }
  
  private Bucket getBucketByIndex (int index) {
    Bucket cursor = start;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor;
  }
  
  public Object get(int index) {
    if (index < 0 || index >= this.size) 
      return null;
    
    return getBucketByIndex(index).value;
  }
  
  public int insert(int index, Object value) {
    if (index < 0 || index >= this.size) 
      return -1;
    
    Bucket temp = new Bucket();
    temp.value = value;
    
    
    if (index == 0){
      temp.next = start;
      start = temp;
      
    } else {
      Bucket cursor = getBucketByIndex(index - 1);
      temp.next = cursor.next;
      cursor.next = temp;
    }
    size++;
    return 0;
  }
  
  public int remove(int index) {
    if (index < 0 || index >= this.size){
      return -1;
    } //if

    if(index == 0){
      start = start.next;

    } else{
      Bucket cursor = getBucketByIndex(index - 1);
      cursor.next = cursor.next.next;
    } //if
    size--;
    return 0;
  }
}

public class CollectionTest07 {
  
  public static void printArray(MyLinkedList4 list) {
    
    MyLinkedList4.Iterator iterator = list.iterator();
     while(iterator.hasNext()){
      System.out.println(iterator.next());
    }//while
  }

  public static void testGet(MyLinkedList4 arr) {
    
    System.out.println("get(i) 사용하기-----------------");
    long start = System.currentTimeMillis();
    int size = arr.size();
    Object value = null;
    for (int i = 0; i < size; i++){
      value = arr.get(i);
      System.out.print(".");
    }
    long end = System.currentTimeMillis();
    System.out.println("\n소요시간 : " + (end - start));
  }
  
  public static void testIterator(MyLinkedList4 arr) {
    Object value = null;
    System.out.println("Iterator 사용하기 ----------");
    long start = System.currentTimeMillis();
    MyLinkedList4.Iterator iterator = arr.iterator();
    while (iterator.hasNext()) {
      value = iterator.next();
      System.out.print(".");
    }
    long end = System.currentTimeMillis();
    System.out.println("\n소요 시간 : " + (end - start));
    
  }


  public static void main(String[] args) {
    MyLinkedList4 arr = new MyLinkedList4();
    for (int i = 0; i < 5; i++) {
      arr.add("==>" + i);
    }
   
    testGet(arr);
    testIterator(arr);
    
    
    
    
  }
  
 /* public static void main2(String[] args) {
    MyLinkedList4 arr = new MyLinkedList4();
    arr.add("00000");
    arr.add("11111");
    arr.add("22222");
    arr.add("33333");
    arr.add("44444");
    arr.add("55555");
    arr.add("66666");
    arr.add("77777");

    System.out.println("-----------------");
    printArray(arr);
  }*/
}
  













