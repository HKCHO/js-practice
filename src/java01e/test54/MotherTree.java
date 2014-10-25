package java01e.test54;

public class MotherTree implements Unit {

  @Override
  public void run() {
    System.out.println("나무는 달릴 수 없다.");
    
  }

  @Override
  public void stop() {
    System.out.println("나무는 항상 서있다.");
    
  }

}
