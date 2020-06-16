
# 자바에서의 객체(object)란?

- 클래스에 정의된 내용대로 메모리에 할당된 결과물

- 캡슐화
  - 멤버 변수에 private 를 넣는다.

- 객체 4가지 특징
  - 캡슐화
  - 다형성
  - 상속
  - 추상화 : 유연성 확보 -> 추상화를 이용하여 클래스를 만들 수 있다.

- 접근제한자
  - 클래스에서의 접근제한자: public , default(자체 생략)
    - public
    - default

- 필드(속성)
  - 필드 = 전역변수 = 멤버필드 = 멤버변수
  - 필드 초기화 순서
    - 클래스 변수와 인스턴스 변수 차이
      - 클래스 변수는 static이 붙어있다.
        (클래스자체로 접근=> ex. `SampleClass.classStaticVariable`)

      - 인스턴스 변수는 static이 붙어 있지 않다.(객체를 생성후에 접근)

  - 필드 구성    : (접근제한자) (예약어) 자료형 변수명 (초기값)
  - 접근제한자
    - public    : 전부다
    - protected : 상속관계일때 외부패키지도 접근가능
    - default   : 같은 패키지 내 / 외부 패키지
    - private   : 해당 클래스 내

- 메소드(기능)
  - 메소드에서 접근 제한자
    - public
    - default
    - protected
    - private

- 예약어
  - static
    - 공유해서 사용.
    - 프로그램이 시작하자마자, 메모리의 static 영역에서 생성
    - 프로그램이 끝날 때 종료된다.
    - 많이 사용하면 성능에 영향을 미칠 수 있다.

  - final
    - 상수에서 사용
    - 한번 초기화 되면 더이상 변경할 수 없다.

  - public static final 이런 식으로 많이 쓴다.

- 초기화 블록
  - 인스턴스 블록
    - 객체를 만들 때마다 실행

  - static 블록
    - 맨처음에만 실행

- 필드 초기화 순서
  - 클래스 변수: JVM 기본값 => 명시적 초기화 => 클래스 초기화 블록
  - 인스턴스 변수 : JVM 기본값 => 명시적 초기화 => 인스턴스 초기화 블록 => 생성자를 통한 초기값

<hr>


# 객체 - 생성자

- 생성자 : 객체를 생성해주는 메소드(기능)
  - new 연산자로 인해서 메모리의 Heap영역에서 객체를 생성한다.
  - (매개변수가 있는 생성자) 객체안에서 만들어지는 필드를 초기화 한다.
  - 생성자는 일종의 메소드로 전달된 초기밧을 받아서 객체의 필드를 초기화시킨다.
  

  <BR>
  
  - 생성자 종류
    - 매개변수가 있는 생성자
      - [접근제한자] 클래스명(매개변수){(this.)필드명=매개변수;}
      - 사용자가 직접 만들어줘야하는 생성자이다.
        - 기본생성자를 직접 정의하지 않는 이상은, 기본생성자를 호출하면 에러가 뜬다.
          - 사용자가 직접 만든 생성자를 우선으로 하기 때문이다.

      - 객체 생성시 (매개변수를 통해서) 필드를 초기화할 때 사용된다.

    - 매개변수가 없는 생성자(기본생성자)
      - [접근제한자] 클래스명(){}
      - JVM이 알아서 기본생성자를 만들어준다.
        - 생성자 정의를 안 만들었어도, JVM이 알아서 객체를 만들어준다.
        - 그러므로 생략해도 상관없다.


  - 메모리의 heap영역에 주소값을 할당하여 생성.
    - 생성자를 통한 초기값이 가장 마지막으로 초기화된다.
    - 생성자는 전달된 초기값을 받아서 객체의 필드에 기록.
      - 필드에 데이터를 담는다.
      - 객체안에서 만든 필드를 초기화시킨다.
        - 매개변수가 있는 생성자에서, 매개변수를 통해서 필드를 초기화시킨다.
        - 기본생성자는 크게 관련하지 않는다.


    <BR>

    - <strong>생성자 규칙 (중요!)</strong>
      - 생성자의 선언은 메소드 선언과 유사하나 <strong>반환값(리턴값)이 없다</strong>
      - 생성자명을 <strong>클래스명과 똑같이</strong> 해줘야한다.

      - 기본생성자를 무조건 만들어주고 시작한다.
        - 왜냐하면 생성자 오버로딩하게 된 경우를 고려.

      - 오버로딩
        - 똑같은 이름의 메소드/생성자 를 정의할 수 있다.

        - <strong>같은 클래스 내에서 동일한 이름의 메소드를 여러개 작성</strong>하는 기법
        - `매개변수의 개수`  / `매개변수 순서` 가 달라지면, 오버로딩이 가능하다.
        - `리턴 타입` / `매개변수 이름` 이 다르다해도, 오버로딩은 불가능하다.

        <br>

        ```java
        public class SampleClass{
          // 필드(전역변수=멤버변수=멤버필드)
          int field;
          String field2;
          boolean field3;


          // 생성자 오버로딩
          //기본생성자
          public SampleClass(){

          }

          // 생성자 오버로딩 - 매개변수 1개
          public SampleClass(int num){
            this.field=num;
          }

          // 생성자 오버로딩 - 매개변수 타입
          public SampleClass(boolean b){
            this.field3=b;
          }

          // 생성자 오버로딩 - 매개변수 2개
          public SampleClass(int num, String name){
            this.field=num;
            this.field2=name;
          }
        }
        ```

    <BR>

    - 메소드와 생성자 비교
      - 메소드
        - 리턴타입이 없는 메소드

        <br>

        ```java
        public void method(Parameters){
           ...
        }
        ```

        <br>

        - 리턴타입이 있는 메소드

        <br>

        ```java
        public int method(Parameters){
           int result;
           ...
           return result;
        }
        ```

        <br>

      - 생성자
        <br>
        ```java
        public ClassName(){
           ...
        }
        ```

<hr>

- this
  - 참조변수 (reference variable)
  - 모든 인스턴스 메소드에 숨겨진 채 존재하는 레퍼런스로 할당된 객체를 가리킴
  - this는 나(객체) 자신의 주소값을 갖고 있다.
  - 함수 실행시 전달되는 객체의 주소를 자동으로 받는다.

  - 매개변수의 이름과 필드의 이름이 동일할 때, 메소드 안에있는 지역변수이므로, 지역변수인 매개변수가 우선권을 갖는다.
  - 매개변수의 값을 전달받아서 필드에 초기화 하고 싶을 때, <strong>this.필드= 매개변수</strong> 식으로 작성.
  - this 사용 예시
  ```java
  public class Academy{
     private String name;
     public Academy(){} //기본생성자

     // 매개변수가 있는 생성자
     public Academy(String name){
       // name= name;  
       // 매개변수에 매개변수값을 넣는다. 따라서 필드name에 매개변수name값을 전달하지 못한다.

       this.name= name; // this.name은 this가 가리키는 현재객체인 Academy를 의미하며, name 필드를 의미한다.
     }
  }
  ```


- this()
  - 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용하며 반드시 첫 줄에 선언
  - this()가 왜 필요할까?
    - 중복되는 생성자 코드를 줄이기 위해서 사용
    - 예 - this() 사용하기 전
    ```java
    public class User{
      private String userName;
      private String userId;
      private String userPwd;
      private Date enrollDate;
      // 기본생성자
      public User(){}

      //매개변수가 있는 생성자는
      public User(String userName, String userId, String userPwd){
        this.userName = userName; //코드가 중복.
        this.userId= userId;
        this.userPwd= userPwd;
      }

      public User(String userName){
        this.userName=userName;// 코드중복
      }
    }
    ```

    - this() 사용한 후
      - 코드 중복을 막기위해서 this()를 사용한다.
    ```java
    public class User{
      // 기본생성자
      public User(){}

      // 매개변수가 있는 생성자.
      public User(String userName, String userId, String userPwd){
        this(userName); // 코드 중복을 막기위하여 생성자를 호출.
        this.userId= userId;
        this.userPwd= userPwd;
      }

      public User(String userName){
        this.userName= userName;
      }
    }
    ```
