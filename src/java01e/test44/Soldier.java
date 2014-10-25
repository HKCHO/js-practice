package java01e.test44;

public class Soldier extends Mover {
  
 int attack;
 int level; 
 
 
 // Override :
 // Mover로부터 상속받은 move() method를
 // SubClass의 역할에 맞게 재정의 하는것
 
 // 문법 : 재정의 하려는 Class와 같은 시그너처(signature)를 갖는
 //      method를 만들어라.(단, 공개 범위는 축소되어서는 안된다.
 //      parameter variable의 이름은 달라도 상관 없다.
 
 // Signature : Method Name, Return Type, Parameter Type
 // C언어에서는 Function Prototype이라고 부른다.
 
 
 //수퍼 클래스의 method를 재정의 하는지 검사하라고 compiler에게 지시
 @Override 
   public void move(int dir) {
   
    System.out.println("뚜벅...뚜벅... 걷는다.");
    
   }
}
