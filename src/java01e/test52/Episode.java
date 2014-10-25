package java01e.test52;

public class Episode {
  
    static int global;
    int value;

    static void m() {
      global = 20;
//      클래스 메서드는 this 변수가 없다  
//      this.value = 20;// 오류!!
      
//      this.m2();  // 오류!
    }
    
    void m2() {

    }

  
  
  public static void main(String[] args) {
    Episode p = new Episode();
    
    // static이 붙은 method ( class method )도 인스턴스 주소로 호출할 수 있다.
    // 그러나, class method에서는 this라는 inner variable이 없기 때문에
    // instance reference를 전달할 방법이 없다.
    
    Episode.m();
    
    m(); // 같은 클래스에 소속되어 있으면 클래스명 생략 가능!
    
    p.m();
  }
}
