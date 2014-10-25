package java01e.test53;

import java.util.ArrayList;

import java01e.test53.step05.Iterator;

public class RandomIterator extends Iterator {
  ArrayList<String> randomList = new ArrayList<String>();

  public RandomIterator() {}
  
  public void setList(String[] list) {
    super.setList(list);
    for (String value : list) {
      randomList.add(value);
    }
  }

  public boolean hasNext() {
    if (randomList.size() > 0)
      return true;    
    else
      return false;
  } 

  public String next() {
    int index = (int)(Math.random() * randomList.size());
    return randomList.remove(index);
  }
}
