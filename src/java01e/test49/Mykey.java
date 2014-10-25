/* Object Class
- hashCode() : 인스턴스 별로 고유 값을 리턴
- equals() : 같은 인스턴스인지 비교(boolean)

Map에 값을 저장할 때 키로 사용할 클래스라면,
반드시 그 클래스는 hashCode()와 equals()를 재정의 해야 한다.

String + wrapper Class(Byte, Short, Integer, Float , Double, ...)
=> 기본적으로 hashCode()와 equals()와 toString() 등을 재정의하였다.
=> hashCode(); 인스턴스에 저장된 값이 같다면 같은 해시 값을 리턴한다.
=> equals() : 인스턴스의 저장된 값이 같다면 true 리턴
=>toString() : 인스턴스의 내용을 출력하도록 재정의함.
                 즉, "class@hash"를 출력하지 않음
                 
=> finalize() : garbage collector가 가비지를 해제하기 전에 호출.

 */
package java01e.test49;

public class Mykey {
  
  String passwd;
  int specialNo;
  int secretNo;
  
  
  
  public Mykey ( String passwd, int specialNo, int secretNo) {
    this.passwd = passwd;
    this.specialNo = specialNo;
    this.secretNo = secretNo;
  }
  
  
  @Override
  public String toString() {
    return "Mykey [passwd=" + passwd + ", specialNo=" + specialNo
        + ", secretNo=" + secretNo + "]";
  }
  
  // passwd, specialNo, scretNo 값이 모두 같을 때는
  // 같은 해시 값을 리턴하도록 hashCode()를 재정의한다.
  
  @Override
  public int hashCode() {
    String temp = this.toString();
    return temp.hashCode();
  }
  
  @Override
  public boolean equals(Object obj){
    if (obj == null) return false;
    
    if (!(obj instanceof Mykey)) return false;
    
    Mykey other = (Mykey) obj;
    if (this.passwd.equals(other.passwd) &&
        this.secretNo == other.secretNo &&
        this.specialNo == other.specialNo){
      return true;
     }
    return false;
  }

  
  
}
