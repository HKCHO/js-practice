package java01e.test41;

import java.util.Date;

public class Car {
  String maker;
  String model;
  int cc = 800;  
  int capacity = 5; 
  boolean diesel;
  Date releaseDate;
  
  public Car() {
    this.maker = "미정";
    this.model = "미정";
  }
  
  public Car(String maker ,String model, int cc){
    this.maker = maker;
    this.model = model;
    this.cc = cc;     
  }
}
