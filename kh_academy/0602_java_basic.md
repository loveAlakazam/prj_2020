
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
