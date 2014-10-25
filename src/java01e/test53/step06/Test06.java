/* 5단계
 - Iterator 뿐만 아니라 EvenIterator, ReverseIterator도 사용할 수 있게 하기
 - 해결책 : 
   이들 class의 공통점을 뽑아 SuperClass를 정의하라! Generalization수행
   SuperClass의 이름은 Iterator
    -SubClass ---> GeneralIterator
    -SubClass ---> EvenIterator
    -SubClass ---> ReverseIterator   
 */

package java01e.test53.step06;

public class Test06 {

  public static void main(String[] args) throws Exception {
    String iteratorClassName = System.getProperty("iterator");

    // 클래스 이름(패키지명 포함)으로 객체 생성학디
    // 1) 클래스를 로딩하라
    Class clazz = Class.forName(iteratorClassName);

    //2) Class 객체를 사용하여 인스턴스 생성
    Iterator iterator = (Iterator)clazz.newInstance();

    //3 ) Iterator를 사용하기 전에 필요한 값을 설정한다.
    iterator.setList(args);

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}
