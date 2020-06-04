
# 자바에서의 객체 특징

- 캡슐화
- 추상화
- 다형성
- 상속성

<hr>


# 상속

- 상속 정의

```markdown
다른 클래스(부모클래스=상위클래스)가 가지고 있는 멤버(필드, 메소드)들을

새로 작성할 클래스에서 직접 만들지 않고 상속을 받음으로써

새 클래스(자식클래스= 하위클래스)가 자신의 멤버처럼 사용할 수 있는 기능
```

- 상속의 장점
  - <strong>적은양의 코드</strong>로 새로운 클래스를 작성 할 수 있다.
  - 코드를 공통적으로 관리하기 때문에 <strong>코드 추가 및 변경하는데 좋다</strong>
  - 코드의 중복을 제거하여 프로그램의 <strong>생산성/유지 보수</strong>에 크게 기여한다.


- 상속의 특징
  - <strong>모든 클래스는 Object 클래스의 후손</strong>
    - Object클래스가 제공하는 메소드를 오버라이딩하여 메소드 재구현 가능
    
  - 부모클래스의 생성자, 초기화 블록은 상속이 안된다.
    - 자식클래스 생성할 때 부모 클래스 생성자 먼저 실행
    - 자식클래스 생성자 안에 <strong>부모 클래스 생성자를 호출하고 싶으면 super사용</strong>
    
  - 부모의 private멤버는 상속이 되지만, 직접 접근이 불가능하다.
    - 부모클래스 자체가 아니기 때문에 private 멤버는 자식클래스에서 직접 접근이 불가능하다.
    - super()를 이용하여 전달받은 부모 필드값을 부모생성자쪽으로 넘기거나
    - setter(), getter() 메소드를 이용하여 접근할 수 있다.

- 상속 : extends 키워드를 붙여야한다.
```java

// [접근제한자] class 자식클래스명 extends 부모클래스명{ ... }

// 예시
public class Academy extends Company{
              ....
}
```

<hr>


- this와 super
  - this
    - 자기 자신에 포커스
    - this 
      - 객체 자신의 주소를 저장하고 있는 참조변수
      
    - this() 
      - 다른 생성자를 불러와서, 코드 중복을 방지.
      
      
  - super
    - 나의 부모에 포커스
    - super.멤버
      - 부모클래스의 주소값을 갖고있는 참조변수 
      - 부모가 갖고있는 멤버(메소드, 필드)를 불러올 수 있다. 
      
    - suepr(): 부모 생성자
      - 부모 생성자를 호출하는 메소드
      - 후손 생성자에 부모 생성자가 포함되어있다.
      - 자식객체를 생성하기 전에, 먼저 부모생성자가 super() 호출된다. (즉, 자식생성자 맨처음에 부모생성자super() 가 있어야한다.)
        - 자식객체 생성자안에 실제로 super()가 내재되어있다.
          - 왜냐면 부모가 있어야 자식이 나오기때문이다.

<hr>

# 오버라이딩
- 정의
  - <strong> 자식클래스(하위클래스)에서 부모로부터 물려받은 메소드를 재정의 = 재작성</strong>
  - <string>부모로부터 상속받은 메소드를 재작성/ 재정의</string>하는 것
  - 부모가 제공하는 기능을 고쳐서 사용한다.
  
- 특징
  - 메소드 헤드라인 위에 반드시 ```@Override``` 를 표시한다.

- 성립조건
  - 부모클래스로부터 상속받은 메소드 이름과 동일해야한다.
  - <strong>```매개변수 개수```, ```매개변수 타입```, ```매개변수 순서```, ```리턴타입```이 동일</strong>해야한다.
  - private 는 오버라이딩 불가능하다.
  - `접근제한자`는 부모클래스보다 접근범위가 넓다면 변경할 수 있다.
  
  <br>
  
  - final 예약어
    - final 메소드는 오버라이딩 불가능하다. (더이상의 수정이 없다)
      - 파이널 메소드는 정의하지 않고 그대로 사용할 수 있다. 재정의를 못한다.
      - final 예약어는 변수/ 메소드 / 클래스 에 붙일 수 있다.
      - 변수에 final => 더이상 값 수정 안됨 => 상수
      - 메소드에 final => 더이상 수정안됨 => 더이상의 오버라이딩 안됨.(자식클래스에서의 재정의 안됨)
      
      <br>
      
      - 클래스에 final => '상속'을 할 수 없다. (더이상 확장을 할 수 없다.)
        - 클래스에 abstract와 final을 동시에 사용 불가능 => 성격이 아주 정반대.
        - final은 더이상 수정할 수 없음
        - abstract는 하위클래스에 메소드를 재정의해야한다.
          - abstract => 미완성 => 상속을 해야하며 재정의를 통해서 완성을 시켜야한다.
      
      <br>
      
      - abstract(변경이 필요), final(변경불가) 동시에 사용할 수 없다.
      - static(공유)와 abstract(미완성=변경필요->객체마다 구체화가 필요) 동시에 사용 불가능
      - abstract메소드의 접근제한자로 private불가능 -> 그러면 하위클래스(구체화클래스)에서 메소드를 재정의 할 수 없음.
<br>

- 오버로딩(Over loading)
  - <string>같은 클래스 내에서 이름이 같은 메소드를 여러 개를 만들 수 있는 것</string>을 의미한다.
  - 생성자/ 메소드 모두 여러개로 만들 수 있다.
  - 메소드의 매개변수의 `개수/ 타입 / 순서`가 다르면 오버로딩이 가능하다.
  - 리턴타입이 달라도 상관없다.
  

- Object 클래스
  - 모든 클래스의 부모클래스
  - 모든 클래스는 Object 클래스를 상속받는다.
  - 객체의 대표값을 문자열로 나타낸다 => <strong>```객체의 대표값은 객체의 주소값```</strong>을 의미한다.
  
  <br>
  
  ```java
  Teacher teacher =new Teacher(); // 객체 생성
  
  System.out.println(teacher); //주소값 (오버라이딩)
  System.out.println(teacher.toString); //주소값
  /*
  toString은 Object클래스의 메소드이다.
  주소값을 저장한 참조변수만 출력하면 주소값이 출력되는것도 오버라이딩을 했기때문이다.
  */
  ```


- 상속으로 인한 메소드 재정의의 예
  - 설계관계
    - ```Object클래스 <- Academy클래스``` : Academy클래스는 Object클래스의 자식클래스이며, 상속을 받는다.
  
    - ```Academy클래스 <- Teacher 클래스``` : Teacher클래스는 Academy클래스의 자식클래스이며, 상속을 받는다.
      - Teacher클래스는 Object클래스의 멤버(필드/메소드)와 Academy클래스의 멤버를 상속받는다.

      
  - Object 클래스에서 toString() 메소드 => 주소값 출력
    ```java
    // java document 참고: https://docs.oracle.com/javase/8/docs/api/
    // 즉, Object클래스에서는 현재 객체의 주소값을 문자열형태로 바꿔서 리턴한다.
    public String toString(){
      return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
    ```
  
  
  - 부모클래스(Academy.java)
  ```java
  public class Academy{
    //필드//
    private String academy;
    private String acaAddr;
    private String name;
    private char classroom;
    
    
    //생성자//
    public Academy(){
      //기본생성자
    }
    
    //매개변수가 있는 생성자
    public Academy(String academy, String acaAddr, String name, char classroom){
      this.academy=academy;
      this.acaAddr=acaAddr;
      this.name=name;
      this.classroom=classroom;
    }
    
    //메소드//
    public String getAcademy(){
      return academy;
    }
    
    public void setAcademy(String academy){
      this.academy=academy;
    }
    
    public String getAcaAddr(){
      return acaAddr;
    }
    
    public void setAcaAddr(String acaAddr){
      this.acaAddr=acaAddr;
    }
    
    public String getName(){
      return name;
    }
    
    public void setName(String name){
      this.name=name;
    }
    
    public char getClassroom(){
      return classroom;
    }
    
    public void setClassroom(char classroom){
      this.classroom=classroom;
    }
    
    // inform 메소드
    public String inform(){
      return academy+ " " + acaAddr + classroom + " " + name;
    }
    
    // toString 메소드 재정의
    // Object 클래스의 toString() 메소드는 현재가리키는 객체의 주소값(객체를 대표하는 값)을 문자열형식으로 나타낸 것이다.
    // 모든 클래스의 부모클래스는 Object클래스이다. -> 모든클래스들은 Object클래스에 속한 멤버를 상속받는다.
    // 부모에서 있는그대로의 메소드를 사용하기가 불편하다면
    // 오버라이드를 통해서 재정의를 할 수있고
    // 재정의 이후에는 Academy 객체의 toString()메소드를 불러온다면
    // 기존 부모클래스의 toString()메소드는 더이상 사용되지 않는다.
    @Override
    public String toString(){
      return "[ "+academy+ " "+ acaAddr + classroom + " " + name+" ]";
    }
    
  }
  ```
  
  <br>
  
  - 자식클래스(Teacher.java)
  ```java
  public class Teacher extends Academy{
    // Academy클래스로부터 상속받는다.
    
    // 필드 //
    int career;
    String subject;
    
    // 생성자 //
    public Teacher(){
      //기본생성자
    }
    
    public Teacher(String academy, String acaAddr, String name, char classroom, String subject, int career ){
      // 매개변수가 있는 생성자
      // 부모객체 Academy를 먼저 생성한다. => super() : 부모객체 생성자 -> super은 부모객체의 주소값을 저장하고 있다.
      super( academy, acaAddr, name, classroom );
      
      // this는 현재 객체를 나타내며, 현재 객체의 주소값을 저장하고 있는 참조변수이다.
      this.career=career;
      this.subject=subject;
    }
    
    // 오버라이드 했음을 나타내는 표시가 없더라도 실행에 있어서는 아무런 문제가 없지만
    // @Override 를 표시하는게 좋다.
    // 왜냐하면 부모클래스 Academy로부터 물려받은 inform메소드를 그대로 사용하지 않고
    // 재정의해서 사용했기 때문이다.
    // 이는 자바개발자들끼리의 규칙이다.
    @Override
    public String inform(){
      // 여기서 super.inform() 메소드는 부모클래스인 Academy의 inform() 메소드이다.
      return super.inform() +" "+career+" "+subject;
    }
    
    @Override
    public String toString(){
      // 여기서 super.toString() 메소드는 부모클래스인 Academy의 toString() 메소드이다. 
      return super.toString()+" "+career+" "+subject;
    }
    
  }
  ```
  
  <br>
