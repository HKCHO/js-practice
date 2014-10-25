package java01e.test48;

public class Test48 {
  
  
  
  //hashCode() test
  public static void main(String[] args){
    Student s1 = new Student("홍길동", 23);
    Student s2 = new Student("홍길동", 23);
    
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
  }
  
  
  //toString() test
  public static void main01(String[] args) {

    Student s1 = new Student("홍길동", 10);
    Student s2 = new Student("임꺽정", 10);
    
    /*System.out.println(s1.toString());
    System.out.println(s2.toString());*/
    
    
    // println()은 인스턴스의 toString()을 호출하여 그 리턴 값을 출력한다.
    System.out.println(s1);
    System.out.println(s2);
  }
}
