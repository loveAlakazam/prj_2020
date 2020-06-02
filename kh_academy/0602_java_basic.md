
# 메소드(method)
- 함수/ 기능 부분을 담당
- 형태식
  ```java
  // [ 생략이 가능한 부분 ]
  [접근제한자] [예약어] 반환형 메소드 이름 ([매개변수]){
    ...
  }
  ```

- 메소드 표현식
  - 매개변수가 없고, 리턴값이 없을 때
    ```java
    public void method1(){
      System.out.println("hello World");
    }
    ```

  - 매개변수가 있고, 리턴값이 없을 때
    ```java
    public void method2(int number){
      System.out.println(number)
    }

    ```

  - 매개변수가 없고, 리턴값이 있을 때
    ```java
    public int method3(){
      return 100;
    }
    ```

  - 매개변수가 있고 리턴값이 있을 때
    ```java
    public int method4(int num1, int num2){
      return num1+num2;
    }
    ```


- 메소드의 접근제한자
  - public(+)
  - protected(#)
  - default(~)
  - private(-)

- 예약어
  - static: static 영역에 할당하여 객체 생성 없이 사용
    - `클래스이름.메소드이름`, `클래스이름.필드이름` 로 직접 사용한다.
    - ex) Arrays.copyOf
    - ex) Math.min(), Math.random()

  - final
    - 필드에서는 값변경 불가능이지만, 메소드에서는 <strong>종단</strong>을 의미한다.
    - 상속시 오버라이딩 불가능

  - abstract
    - 추상 메소드
    - 상속하여 오버라이딩(재정의)으로 완성시켜 사용해야함.
      - 자식클래스에서 구체적인 메소드부분을 완성해나간다.

  - synchronized(동기화)
    - 스레드 동기화에서 배움.
    - 한정된 자원(공유자원) 여러 프로그램이 같이 들어오면 하나의 프로그램씩 접근하도록 하는 것.

  - static final


- 메소드의 매개변수
  - 가변인자가 들어있는 메소드
    - 매개변수 개수가 정해져 있지 않다.
    - 매개변수의 자료형과 개수에 제한이 없다.

    - 예) printf("%d %f %c", 1, 3.14, 'c');
    - printf
    - 맨 뒤에 가변인자를 적는게 좋다.
    ```java
    // from: oracle java document
    printf(Locale l, String format, Object... args);
    printf(String format, Object... args);
    ```

- 프레임워크
  - 틀 + 일한다
  - 짜여진 틀이 존재하고, 그 틀에서 동작한다.



- getter 메소드 와 setter 메소드
  - 왜 나왔는가?
    - 각 필드들에 대한 값을 각각 세팅해야되는 메소드가 존재
    - 그 메소드 마다마다를 다르게 쓰니까
    - showName(), getName(), displayName() 같은기능의 함수인데 다르게 표현한다.
    - getter와 setter을 나타냄

  - getter 메소드
    - 필드의 값을 가져와서 반환해주는 메소드
    - (ppt) 필드에 기록된 값을 읽어서 요청한 쪽(나를 호출한 곳)으로 읽은 값을 넘기는 메소드
    ```java
    [접근제한자] [예약어] 반환형 get필드명 (자료형 변수명){
        return 필드명;
    }
    ```


  - setter 메소드
    - 필드의 값을 세팅해주는 메소드
    - (ppt) 필드에 변경할 값을 전달받아서(매개변수를 통해) 필드 값을 변경하는 메소드
    ```java
    [접근제한자] [예약어] void set필드명 (자료형 변수명){
      (this.)필드명=변수명;
    }
    ```

  - return
    - 해당 메소드를 종료하고 자신을 호출한 메소드로 돌아가는 예약어
    - 반환값이 있다면 반환값을 가지고 자신을 호출한 메소드로 돌아감.



- MVC Model Pattern
  - MVC Model?
    - MVC: Model View Controller
      - Run
        - main() 메소드에서 시작
        - 실행 이후 아무것도 안함.

      - View
        - 화면에 결과를 보여주는 역할

      - Controller
        - Model과 View를 연결
        - 데이터 가공

      - Model (데이터와 관련있다.)
        - <strong>vo</strong>
          - vo: 패키지(폴더)
          - ``추상화를 거친 클래스``가 들어있다.
          - 데이터를 담은 임시공간/ 변수

        - <strong>dao</strong>
          - dao : 패키지(폴더)
          - DB랑 직접적으로 접근함.
          - ``DB에서 얻은 데이터를 갖고와서 데이터를 가지고 활용.``
          - DB뿐만 아니라 파일도 가능.
        - service
        - exception
        - dto
        - ...
