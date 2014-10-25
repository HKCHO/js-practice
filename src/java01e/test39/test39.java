package java01e.test39;

public class test39 {
  
 public static void main(String[] args) {
  System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
  
  Score s = new Score("홍길동", 100, 100, 90);
  
  Score s2 = new Score();
  s2.name = "임꺽정";
  s2.kor = 90;
  s2.eng = 90;
  s2.math = 90;
  s2.compute();
  
  System.out.println("이름 : " + s.name);
  System.out.println("국어 : " + s.kor);
  System.out.println("영어 : " + s.eng);
  System.out.println("수학 : " + s.math);
  System.out.println("합계 : " + s.sum);
  System.out.println("평균 : " + s.average);
  
  
 }
 
}
