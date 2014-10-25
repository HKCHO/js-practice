/*프로그램 아규먼트(Program Argument)
 -JVM을 실행할 때 프로그램에게 전달하는 Parameter Value.
 -전달 방법
   java -classpath ./bin:/okok/a:/test/a/b (className) 값1 값2 값3 ....
     값1 값2 값3이 Program Argument이다.
 -프로그램 아규먼트를 꺼내는 방법
   main()의 args 파라미터를 사용하라!
   각각의 아규먼트 값이 배열에 저장되어 main() 호출 시 넘어온다.   
*/

package java01e;

public class test15 {
  public static void main(String[] args) {
    System.out.println("프로그램 아규먼트 개수: " + args.length);
    System.out.println("프로그램 아규먼트값:");
     for (int i = 0; i < args.length; i++){
       System.out.println(args[i]);
     }
  }
}
