package java01e.test44;

abstract public class Vehicle extends Mover {
 int speed;
 int capacity; 
 
 @Override
  public void move(int direction) {
   
   System.out.print("엔진을 이용하여 이동한다");
    
  } 
}
