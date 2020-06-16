# IO= INPUT & OUTPUT

- 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고 받는 것.

- 입출력 데이터를 처리하기 위해서 스트림을 이용한다.

- stream: 데이터가 왔다갔다 하는 길
  - 단방향(1가지 방향)을 갖는다. (단방향 통신)
  - 마치 시냇물이 한쪽방향으로 흐르듯이
  - 입력을 위한 스트림
  - 출력을 위한 스트림
  - 입력과 출력을 구현하려면, 2개의 스트림이 필요함.

  <br>

  - 입출력 장치에서 데이터를 읽고쓰기 위해서 자바에서 제공하는 클래스
  - 모든 스트림은 단방향이며 각 장치마다 연결할 수 있는 스트림이 존재
  - 하나의 스트림으로 입출력을 동시에 수행할 수 없으므로
    - 동시에 수행하려면 2개의 스트림이 필요.

  - Queue방식
    - FIFO(First in First out)
    - > ```(input) 1->2->3``` / ```(output) 1->2->3```
    - 한쪽에서 지연이 일어나면, 발생지 이후부터 지연이 발생

  - Stack방식
    - LIFO(Last in First out)
    - > ```(input) 1->2->3``` / ```(output) 3->2->1```

- (input) 키보드/파일/프로그램 => (프로그램) => (output) 모니터/ 파일/ 프로그램

- (input) 키보드/파일/프로그램 <= (프로그램) <= (output) 모니터/ 파일/ 프로그램


<hr>

# 스트림(Stream)

- stream 분류
  - 바이트 기반 스트림
    - 바이트(Byte)단위 처리
      - 1Byte단위로 처리한다.

    - 입력 스트림
      - 최상위 클래스: *InputStream*
      - 하위 클래스: XXXX *InputStream*

    - 출력 스트림
      - 최상위 클래스: *OutputStream*
      - 하위 클래스: XXXX *OutputStream*

  - 문자 기반 스트림
    - 문자(char)단위 처리
      - 2Byte단위로 처리한다.
    - 입력 스트림
      - 최상위 클래스: *Reader*
      - 하위 클래스: XXXX *Reader*
    - 출력 스트림
      - 최상위 클래스: *Writer*
      - 하위클래스: XXXX *Writer*


- Stream 종류
  - 기반 스트림
    - 데이터가 실제로 왔다갔다하는 스트림.
    - 스트림 안에 실제 데이터가 지나간다.
    - 입출력 처리 가능

  - 보조 스트림
    - 입출력 처리 불가능
    - 데이터는 안다니지만, 기반스트림을 보조해주는 스트림.
    - 기반스트림의 기능을 추가/ 성능 개선 등 기반스트림을 보조해준다.
    - 단독으로 사용할 수 없다. 기반스트림과 같이 써야한다.
      - 기반스트림을 먼저 만든다.
      - 먼저 만든 기반스트림에다가 씌워서 성능을 업데이트 시킴
        - 보조는 기반스트림을 감싸야한다.

          <br>
          ```
          기반스트림클래스 기반참조변수 = new 기반스트림클래스();

          보조스트림클래스 보조참조변수 = new 보조스트림클래스(기반스트림객체);
          ```

          - 보조스트림의 생성자는 매개변수로 기반스트림을 갖고, 기반스트림은 매개변수안에는 스트림이 있다.

        - 마치 벌거벗은 캐릭터에다가 갑옷이나 무기 등 아이템을 장착한다고 보면됨.


- 기반 스트림과 보조스트림은 어떤 차이를 갖는가?
  - 생성자를 확인
    - 생성자의 매개변수로 본다.

  - (기반) FileInputStream
    - 생성자의 매개변수에 Stream이 없다면, 기반스트림.
    ```java
    FileInputStream(File file)

    FileInputStream(FileDescriptor fdObj)

    FileInputStream(String name)

    ```

  - (기반)CharArrayReader(char [] buf)
  ```java
  //생성자에 Stream이 없다면 기반이다.
  CharArrayReader(char [] buf)

  CharArrayReader(char [] buf, int offset, int length);
  ```


  - (보조) FilterInputStream
    - 매개변수에 Stream이 들어있으면 보조스트림.

    - 생성자의 매개변수가 InputStream인 것은 보조스트림.

    ```java
    FilterInputStream(InputStream in);
    ```
- (보조) FilterWriter
  - 매개변수에 Stream이 명시되어있지 않아도
    - Byte기반/ 문자 기반 스트림 클래스가 매개변수로 있다면 보조스트림이다.

    ```java
    FilterWriter(Writer out)
    ```

<hr>

# InputStream

- 1Byte 단위로 처리한다.
- 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스.
- InputStream (입력스트림)
  - FileInputStream
  - BufferedInputStream
  - DataInputStream

- read()
  - 리턴타입: int

- read(byte[] b)
  - 리턴타입: int

- read(byte[] b, int off, int len)
  - 리턴타입: int

- close()
  - 리턴타입: void

<hr>

# OutputStream
- OutputStream (출력스트림)
- Byte기반 출력스트림의 최상위 클래스로 추상클래스.
- OutputStream
  - FileOutputStream
  - BufferedOutputStream
  - DataOutputStream
  - PrintStream

- write(int b)
  - 리턴타입: void

- write(byte[] b)
  - 리턴타입: void

- write(byte[] b, int off, int len)
  - 리턴타입: void

- flush()
  - 리턴타입: void

- close()
  - 리턴타입: void

<hr>

# Reader

- Reader
  - FileReader
  - InputStreamReader
  - BufferedReader

<hr>

# Writer

- Writer
  - write(int c)
  - write(char[ ])

<hr>

# 파일 클래스

- 파일 시스템의 파일을 표현하는 클래스
- 파일크기/ 파일속성/ 파일이름 등의 정보와 파일 생성 및 삭제 기능 제공

```java
// File 객체 생성
File file =new File("파일경로");
```

- File 클래스
  - createNewFile()
    - 새로운 파일 생성

  - mkdir()
    - 새로운 디렉토리 생성
    - (덧) 폴더이름은 대소문자 구분안한다.

  - mkdirs()
    - 경로 상에 없는 모든 디렉토리 생성

  - delete()
    - 파일 또는 디렉토리 삭제


# checked
- runtime exception 아래

# unchecked
- runtime exception 아래에 있지 않음.


<hr>

- 2020/06/12

# 보조스트림

- 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용

- 기반 스트림을 먼저 생성한 후에 보조스트림을 생성

- 보조스트림은 실제 데이터를 주고받는 스트림이 아니기때문에 입출력 처리가 불가

- 보조스트림 종류
  - 문자변환(InputStreamReader, OutputStreamWriter)
  - 객체 입출력(ObjectInputStream, ObjectOutputStream)
  - 입출력 성능(BufferedInputStream, BufferedOutputStream)
  - 기본 데이터 타입 출력(DataInputStream, DataOutputStream)

- 보조스트림 사용예
```java
//기반 스트림 생성
FileInputStram fis =new FileInputStream("sample.txt");


//보조스트림 생성- 매개변수로 기반스트림을 가리키는 참조형 변수가 있다.
BufferedInputStream bis =new BufferedInputStream(fis);

bis.read(); //보조스트림으로부터 데이터를 읽어온다.
```

<hr>

# 문자변환 보조 스트림
- 소스 스트림이 바이트 기반 스트림이지만 데이터가 문자일 경우 사용
- Reader와 Writer문자 단위로 입출력을 하기 때문에 데이터가 문자인 경우 바이트 기반 스트림보다 편리하게 사용가능.

- InputStreamReader
  - 바이트 => InputStream => InputStreamReader => 문자

- OutputStreamWriter
  - 문자 => Writer => OutputStream => 바이트



## 성능향상 보조 스트림
- 느린 속도로 인해 입출력 성능에 영향을 미치는 입출력 소스를 이용하는 경우에 사용

- 입출력 소스와 직접 작업하지 않고 ```버퍼에 데이터를 모아서 한꺼번에 작업을 하여 실행 성능 향상```

- BufferedInputStream/ BufferedReader

- BufferedOutputStream/ BufferedWriter


## 기본타입 입출력 보조 스트림
- 기본 자료형 별 데이터 읽고 쓰기가 가능하도록 기능 제공
  - 단, 입력된 자료형의 순서와 출력될 자료형의 순서 일치

- 순서
  - 바이트 => InputStream => DataInputStream => 프로그램(데이터 기본타입) => DataOutputStream => OutputStream => 바이트


## 객체 입출력 보조 스트림

- 객체를 파일 또는 네트워크로 입출력 할 수 있는 기능 제공

- 단, 객체는 문자가 아니므로 바이트 기반 스트림으로부터 ```데이터를 변경해주는 직렬화 필수```
  - ```직렬화```: 객체를 데이터로 바꿔주는 것.
  - 객체입출력 보조스트림은 직렬화가 무조건 필요하다.

- 바이트 => InputStream => ObjectInputStream=>프로그램(객체) => ObjectOutputStream => OutputStream => 바이트


## 직렬화 와 역직렬화

- <strong>직렬화(Serialization): 객체를 데이터로 바꿔주는 것</strong>
  - Serializable 인터페이스를 implements 하여 구현한다.
  - 객체를 직렬화할 때 private 필드를 포함한 모든 필드를 바이트로 변환하지만
  - transient키워드를 사용한 필드는 직렬화에 제외


- 역직렬화(Deserialization): 데이터를 객체로 바꿔주는 것.
  - 역직렬화할 때는 직렬화 했을 때와 같은 클래스를 사용.
  - 단, ```클래스이름이 같더라도 클래스 내용이 변경된 경우 역직렬화 실패.```

- serialVersionUID 필드
  - 직렬화한 클래스와 같은 클래스임을 알려주는 식별자 역할
  - 컴파일시 JVM이 자동으로 SerialVersionUID 정적 필드를 추가해 별도로 작성하지 않아도 오류는 나지 않지만
  - 자동 생성 시 역직렬화에서 예상하지 못한 InvalidClassException을 유발할 수 있어서 명시 권장
  ```java
  private static final long serialVersionUID=...;
  ```
