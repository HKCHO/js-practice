/* boxing and unboxing
 - boxing : 기본 형 값을 가지고 랩퍼 객체로 자동으로 만드는 것.
 - unboxing : 랩퍼 객체에서 기본 형 값을 자동 추출 하는것.
 - 이 두가지가 자동으로 이루어 지는 것 => autoboxing( JDK 1.5 이상)
  
 */

package java01e;

public class test33 {
  public static void main(String[] args) {
    //boxing
    Integer i = 10; //  자동 박싱 된 것  => new Integer(10)
    
    //unboxing
    int j = i; // i.intValue() 와 같다.
  }
}
