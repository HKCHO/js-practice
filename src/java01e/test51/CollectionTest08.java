package java01e.test51;

class MyStack {
  Object[] list = new Object[100];
  int top;
  
  public void push(Object value) {
    list[top++] = value;
  }
  
  
  //마지막 입력값을 꺼낸다.
  public Object pop() {                                        //꺼낸다. 목록에서 제거됨.
    return list[--top];    
  }  
}

class MyQueue {
  class Bucket {
    Object value;
    Bucket next;
  }
  
  Bucket start;
  Bucket end;
  
  public MyQueue() {
    start = new Bucket();
    end = start;
  }
  
  
  public void add(Object value) {     
    end.value = value;
    end.next = new Bucket();
    end = end.next;    
  } 
  
  
  //첫 번째 입력 값을 꺼낸다.
  public Object poll() {                                      //꺼낸다. 목록에서 제거됨.
    Object temp = start.value;
    start = start.next;
    return temp;
  }
}

public class CollectionTest08 {
  
  public static void main(String[] args) {
    
    
    MyStack stack = new MyStack();
    stack.push("00000");
    stack.push("11111");
    stack.push("22222");
    stack.push("33333");
    
    
    for (int i = 0; i < 4; i++) {
      System.out.println(stack.pop());      
    }
    
    System.out.println("--------------------");
    
    
    MyQueue Queue = new MyQueue();
    Queue.add("AAAAA");
    Queue.add("BBBBB");
    Queue.add("CCCCC");
    Queue.add("DDDDD");
    
    
    for (int i = 0; i < 4; i++) {
      System.out.println(Queue.poll()); 
      System.out.println("*********");     

      System.out.println(Queue.start.next+ ", "+ Queue.start.value);      

    }
    System.out.println(Queue.start.next);      

  }
}



















