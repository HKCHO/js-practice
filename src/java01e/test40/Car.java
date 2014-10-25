package java01e.test40;

import java.util.Date;

public class Car {
  String maker;
  String model;
  int cc = 800;  //초기화 문장 
  int capacity = 5; //초기화 문장
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
