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
