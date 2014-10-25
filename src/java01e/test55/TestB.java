package java01e.test55;

import java01e.test55.GameCenter;

public class TestB implements Gamer {

  
 int count = 0;

  @Override
  public String who() {
    return "조현권";
  }

  @Override
  public void init() {
 

  }

  @Override
  public String play() { 
    int aa = (int) java01e.test55.GameCenter.aScore;
   
      /*count++;              
      if ((count % 6) == 0) {
        count--;
        return Gamer.PAPER;}
      else if ((count % 2) == 0) {
        count+=2;
        return Gamer.ROCK;}
      else {
        return Gamer.SCISSORS;}*/
    
    return Gamer.ROCK;
   
  }
  @Override
  public void sendResult(int result) {
     
  }

}
