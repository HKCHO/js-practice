package java01e.test36;

public class test36 {
  
 public static void main(String[] args) {
  String name = "홍길동";
  int kor = 100;
  int eng = 100;
  int math = 100;
  int sum = 300;
  float average = sum / 3.0f;
  
  System.out.println("이름 : " + name);
  System.out.println("이름 : " + kor);
  System.out.println("이름 : " + eng);
  System.out.println("이름 : " + math);
  System.out.println("이름 : " + sum);
  System.out.println("이름 : " + average);
  
  
  System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
  Score s = new Score();
  s.name = "홍길동";
  s.kor = 100;
  s.eng = 100;
  s.math = 90;
  s.sum = s.kor + s.eng + s.math; 
  s.average = s.sum / 3.0f;
  
  System.out.println("이름 : " + s.name);
  System.out.println("이름 : " + s.kor);
  System.out.println("이름 : " + s.eng);
  System.out.println("이름 : " + s.math);
  System.out.println("이름 : " + s.sum);
  System.out.println("이름 : " + s.average);
  
  
 }
 
}
