/*반복문
 
 
   -while (조건) 명령문;
   -while (조건) {....}
   
   -do 명령문; while(조건);
   -do { ... } while(조건);
   
   -for (초기화 명령문; 조건; 증가문) { ... }
   -for (variable : Array or Collection type object) { ... }
 
 */

package java01e;

public class test22 {
  public static void main(String[] args) {
    // 퀴즈
    // 1에서 100까지 출력하라. 단, 4의 배수를 출력하라!
    // 단 20의 배수이고 일때마다 경계 문자열을 출력
    // 60의 배수가 아닌 것은 출력하지 말아라
   // do문을 사용하라
    
    
   int i = 4;
   
   do {
     if (i%60 == 0) {
       System.out.println("@"+i); i++;
     } else if (i%20 == 0) {
       System.out.print(i +"\n"); i++;
     } else if (i%4 ==0) {
       System.out.print(i +","); i++; i++; i++;
     } else {
       i++;
     }
     

   }while (i <= 100);


 
   

  }
}
