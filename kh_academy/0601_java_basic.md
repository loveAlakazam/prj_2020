
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

    - 필드에서 접근 접근제한자
      - public
      - default
      - protected
      - private

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
  - new 연산자로 인해서 객체를 생성
  - 메모리의 heap영역에 주소값을 할당하여 생성.
    - 생성자를 통한 초기값이 가장 마지막으로 초기화된다.
    - 생성자는 전달된 초기값을 받아서 객체의 필드에 기록.

    - <strong>생성자 규칙 (중요!)</strong>
      - 생성자의 선언은 메소드 선언과 유사하나 <strong>반환값(리턴값)이 없다</strong>
      - 생성자명을 <strong>클래스명과 똑같이</strong> 해줘야한다.

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
