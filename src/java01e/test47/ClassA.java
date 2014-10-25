package java01e.test47;

public class ClassA {
 static int value = 10;
 
 static {
   System.out.println("ClassA : static 블록 실행");
   ClassB.value = 100;
   System.out.println("ClassA : ClassB.value = " + ClassB.value);
   System.out.println("ClassA : value = " + value);
 }
}
