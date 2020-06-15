# 제너릭 컬렉션(Generic & Collection)
- Very Very Important!( 매우 중요! )
- 활용도가 높다.

1. What is a 'Collection' in Java?

> 메모리상에서 자료를 구조적으로 처리하는 방법을 자료구조라 일컫는데

> 컬렉션(Collection)은 자바에서 제공하는 자료구조를 담당하는 프레임워크

> <strong>추가/ 삭제/ 정렬 등의 기능처리가 간단하게 해결</strong>되어 자료구조적 알고리즘을 구현할 필요 없음.

- 자료구조(Data Structure)
  - > 데이터(자료)를 메모리에서 구조적으로 처리하는 방법론

- 배열의 문제점
    - 크기를 지정하면 변경할 수 없다.
      - 크기가 바뀌면 새로운 공간을 할당하게된다.

    - 기록된 데이터에 대한 중간위치의 추가/삭제/정렬이 불편하다.

    - 한 종류의 자료형 밖에 저장이 가능하다.

- Collection
  - 배열의 문제점을 보완.
  - <STRONG>저장하는 크기의 제약이 없다.</STRONG>
  - <STRONG>기록된 데이터에 대한 중간 위치의 추가/삭제가 가능하다.</STRONG>
    - 추가/삭제/정렬 등의 기능처리가 간단하게 해결된다.
  - 여러개의 자료형의 여러 개의 데이터를 저장한다.
    - 필요에 따라 기본자료형을 저장하는 경우, Wrapper 클래스를 사용한다.
    - Collection만 갖는 장점은 아니다.
    - Collection보다 Generic에서 여러 종류의 데이터를 저장할 수 있다는 점에서 유용하다.


  - collection 장점
    -  크기 제약이 없다.
    - 추가/삭제/정렬 등 처리를 간단히 할 수 있다.

<BR>


- Collection(부모)
  - List(자식)
    - <strong>ArrayList</strong>
    - Vector
    - <strong>LinkedList</strong>

  - Set(자식)
    - HashSet
    - TreeSet

- Map(독립)
  - HashMap
  - HashTable
  - TreeMap
  - Properties

```markdown
- Collection (특징 중요)
  - List계열
    - 구현 클래스: ArrayList, Vector, LinkedList
    - 순서가 유지되고 저장된다.
    - 중복이 허용된다.


  - Set계열
    - python의 set과 같다. (중복을 허용안함./ 순서가 유지되지않음..)
    - 구현 클래스: HashSet, TreeSet
    - 순서를 유지하지 않고 저장.
    - 중복이 허용되지 않는다.


- MAP 계열
  - HashMap, HashTable, TreeMap, Properties
  - Map은 *List와 Set과 구조가 다를 수 있다. 왜냐면 Map의 부모는 Collection이 아니다.*

  - 키와 값의 쌍으로 저장(python dictionary와 유사)
  - 키값의 중복을 허용하지 않는다.
    - key는 Set방식(순서유지x/ 중복허용하지 않음)
      - 그래서 Map은 순서를 유지하지 않는다.
    - value는 List방식(중복허용함.)

  - 순서유지가 되지 않는다.

```

<hr>

# List
- 자료들의 순서를 유지
- 중복값 허용
  - 인덱스에 의해서 구분이 됨.
  - 인덱스가 다르기때문에 중복저장이 가능하다.

# List - ArrayList
- 동기화를 제공하지 않는다.
- ArrayList 사용 방법
  - Generic <E>
    - collection => (특징 한개) 여러 타입의 자료형을 저장할 수 있다.
    - Generic의 역할: 콜렉션의 타입을 제한(지정)시키는 것
    - E는 특정자료형이 아니다.
      - Generic의 E는 자료형을 지정하는 역할인데, 어떤 자료형이 올지는 모른다는 의미를 담고있다.

      - 지정하게되면, E는 내가 지정한 클래스 타입으로 지정(제한)하게 된다.
      - Generic의 종류
        - E = Element
        - K = Key
        - V = Value
        - T = Type


  <BR>

  ```java
  List <E> list = new ArrayList<E> ();

  // <E>: Generic
  // collection => 여러 타입의 자료형을 저장할 수 있다.
  // Generic의 역할: 콜렉션의 타입을 제한시키는 것
  ```

<br>

```java

```



# List - Vector
- 동기화 제공
  - StringBuilder과 StringBuffer에서 동기화...
- ArrayList의 구버젼(이전버젼).

# List -LinkedList
- List의 후손
- 변경(데이터 삽입/ 삭제)이 효율적이다.


<hr>

# 동등객체와 동일객체를 비교
- ListController.java
```java
package com.kh.example.list.controller;

import java.util.ArrayList;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		//ArrayList list1 =new ArrayList();
		//[warning message]
		//ArrayList is a raw type.
		//References to generic type ArrayList<E> should be parameterized
		// 제너릭이 없어서 경고창이 뜸. => 제너릭을 추가.


		// generic을 지정하지 않았지만, add()매개변수의 default가 Object로 되어있다.
		// Object는 모든클래스의 조상이며, 다형성으로 인해서 다양한 객체를 가리킬 수 있다.
		// 여러타입의 데이터가 저장가능하다.
		// GENERIC을 붙여서 사용한다. => COLLECTION뿐만 아니라
		// 배열도 여러타입의 데이터들을 저장할 수 있다 => Object타입의 객체 배열로하다면

		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("최은강"); ///제너릭을 넣는 순간 String(문자열)만 들어가도록 제한됨.(타입제한)


		//ArrayList<Object> list1= new ArrayList<Object>();
		//제너릭을 지정하지 않으면, 여러타입의 데이터를 넣을 수 있다..
//		list1.add(1943);
//		list1.add(new Student("최은강", 88));
		// 다양한 타입의 자료형들을 list1에 추가할 수 있다.
		// 기본자료형뿐만아니라, 참조형 자료형도 추가할 수있다.
		// warning message: 타입지정을 안했기때문에.


		// <E> 제너릭 => 타입제한
		// <Student> => Student클래스타입으로 타입제한.
		ArrayList<Student> list2= new ArrayList<Student>(3); // 크기가 3인 ArrayList를 만든다.

		// add(Student e) => 제너릭에서 제한된 타입으로 지정.
		list2.add(new Student("최서강", 100));
		list2.add(new Student("문종렬", 100));
		list2.add(new Student("김현진", 100));

		System.out.println("list2: "+ list2); // 순서 유지 확인
		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println();

		list2.add(new Student("이영실", 100));
		list2.add(new Student("김수진", 100));
		list2.add(new Student("박신우", 100));

		// 추가해도 리스트에 저장된 개수가 변경됨(초기 크기값 맞추지 않아도 가능)
		System.out.println("list2: "+ list2);

		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println("list2: "+ list2);
		System.out.println();

		list2.add(new Student("최은강",90));
		System.out.println("list2: "+list2);
		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println();

		// 컬렉션 장점1: 크기 제약이 없다.
		// 컬렉션 장점2: 추가/삭제/정렬 등의 기능 처리가 간단하다.


		// add(int index, E e) => index에 해당하는 위치에 끼워넣기.
		list2.add(0, new Student("남우현", 82));
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		// 3번 인덱스에  "김동석" 학생 40점 삽입...ㅋㅋㅋ (튜터님 ㅈㅅㅠ )
		list2.add(3, new Student("김동석", 40));
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		// 노드 삭제하기  - remove()이용
		// 1. remove(int index) => index에 해당한 노드를 지운다.
		list2.remove(1);
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();


		// 2. remove(Object o)
		// Removes the first occurrence of the specified element from this list, if it is present.
		list2.remove(new Student("남우현", 82)); //과연? => 지워지지않음 => 주소값이 다르다.
		// 69번째라인의 생성된 객체와, 90번째라인의 생성된 객체의 주소는 서로다름
		// new연산자로 인해 주소값이 서로다름.
		// 내가(list2) 가지고 있는 값으로 비교할 수 있게끔 바꿔야한다.
		// 주소값을 비교해서 객체가 존재하는지 존재하지 않은 지를 볼건데
		// new 연산자를 이용해서 객체를 생성하니, 아무리 내용이 비슷하더라도, 주소값은 다르다.

		// 동일객체: 주소값이 같은 객체
		// 동등객체: 객체의 주소값은 다르지만, 내용은 같은 것

		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		//hash-code와 equals를 오버라이드했기때문에
		//list2.remove() 안에 들어있는 값이 지워졌다.

    //정렬

	}
}
```



- Student.java
```java
// Student.java
package com.kh.example.list.model.vo;

public class Student {
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		// 주소값이 아닌 name+(score점) 을 출력. (Object클래스의 메소드 오버라이드)
		return name + "(" + score + "점)";
	}

	// 동등객체인지 확인.
	// [오버라이드 규칙]
	// equals를 오버라이드할때는
	// Hash Code를 같이 오버라이드 해야된다.
	// equals override
	// 해시코드도 같이 오버라이드
	// 오버라이드 : ctrl+space

	// collection에는 hashCode()와 equals() 오버라이드가 필요하다.

  // ArrayList의 메소드 remove()에서는
  // equals()가 내제되어있다.
	@Override
	public int hashCode() {
		final int prime = 31; // 소수 1개를 만든다. - 컴퓨터가 계산하기에 적당히 좋은 숫자.
		int result = 1;
		// name값이 존재하지 않으면=> (true) 0 을 더함 / (false) name.hashCode() (문자열의 해시코드)를 더함.
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + score;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 객체 자체를 비교
    // 객체 정보를 비교. 주소값 비교.
		if (this == obj) {
			// 매개변수 obj가 담은 주소값과 내 주소값이 같다면
			// 즉, 똑같은 객체라면
			return true;
		}

		if (obj == null) {
			// obj에 주소값이 존재x
			// obj가 가리키는 객체가 존재하지 않는다면
			// obj매개변수에 객체가 생성하지 않았다면
			return false;
		}

		// 현재 나의 클래스 정보와, obj의 클래스정보가 서로다르다면
		// 클래스 정보가 서로 다르다면
		if (getClass() != obj.getClass()) {
			return false;
		}

		// 2. 필드값 비교
		// obj를 Student로 형변환
		Student other = (Student) obj;
		if (name == null) { // name필드(String) JVM 초기값: null
			// 내가 가지고 있는 name필드가 null이라면

			if (other.name != null) {
				// other가 갖는 name필드가 null이 아니라면
				// 다르다.
				return false;
			}
		} else if (!name.equals(other.name)) {
			// null은 equals로 비교할 수 없다 (Null Pointer Exception)
			// 나의 name필드와
			// other.name필드가 서로 같지 않다
			return false;
		}
		if (score!=other.score) {
			// 나의 score필드와
			// other.score필드가 서로 같지 않다면
			return false;
		}

		return true;
	}

}
```

<hr>

```java
// ListController.java
package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentCompare;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		//ArrayList list1 =new ArrayList();
		//[warning message]
		//ArrayList is a raw type.
		//References to generic type ArrayList<E> should be parameterized
		// 제너릭이 없어서 경고창이 뜸. => 제너릭을 추가.


		// generic을 지정하지 않았지만, add()매개변수의 default가 Object로 되어있다.
		// Object는 모든클래스의 조상이며, 다형성으로 인해서 다양한 객체를 가리킬 수 있다.
		// 여러타입의 데이터가 저장가능하다.
		// GENERIC을 붙여서 사용한다. => COLLECTIONS뿐만 아니라
		// 배열도 여러타입의 데이터들을 저장할 수 있다 => Object타입의 객체 배열로하다면

		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("최은강"); ///제너릭을 넣는 순간 String(문자열)만 들어가도록 제한됨.(타입제한)


		//ArrayList<Object> list1= new ArrayList<Object>();
		//제너릭을 지정하지 않으면, 여러타입의 데이터를 넣을 수 있다..
//		list1.add(1943);
//		list1.add(new Student("최은강", 88));
		// 다양한 타입의 자료형들을 list1에 추가할 수 있다.
		// 기본자료형뿐만아니라, 참조형 자료형도 추가할 수있다.
		// warning message: 타입지정을 안했기때문에.


		// <E> 제너릭 => 타입제한
		// <Student> => Student클래스타입으로 타입제한.
		ArrayList<Student> list2= new ArrayList<Student>(3); // 크기가 3인 ArrayList를 만든다.

		// add(Student e) => 제너릭에서 제한된 타입으로 지정.
		list2.add(new Student("최서강", 100));
		list2.add(new Student("문종렬", 100));
		list2.add(new Student("김현진", 100));

		System.out.println("list2: "+ list2); // 순서 유지 확인
		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println();

		list2.add(new Student("이영실", 100));
		list2.add(new Student("김수진", 100));
		list2.add(new Student("박신우", 100));

		// 추가해도 리스트에 저장된 개수가 변경됨(초기 크기값 맞추지 않아도 가능)
		System.out.println("list2: "+ list2);

		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println("list2: "+ list2);
		System.out.println();

		list2.add(new Student("최은강",90));
		System.out.println("list2: "+list2);
		System.out.println("list2의 elements개수: "+ list2.size());
		System.out.println();

		// 컬렉션 장점1: 크기 제약이 없다.
		// 컬렉션 장점2: 추가/삭제/정렬 등의 기능 처리가 간단하다.


		// add(int index, E e) => index에 해당하는 위치에 끼워넣기.
		list2.add(0, new Student("남우현", 82));
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		// 3번 인덱스에  "김동석" 학생 40점 삽입...ㅋㅋㅋ (튜터님 ㅈㅅㅠ )
		list2.add(3, new Student("김동석", 40));
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		// 노드 삭제하기  - remove()이용
		// 1. remove(int index) => index에 해당한 노드를 지운다.
		list2.remove(1);
		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();


		// 2. remove(Object o)
		// Removes the first occurrence of the specified element from this list, if it is present.
		list2.remove(new Student("남우현", 82)); //과연? => 지워지지않음 => 주소값이 다르다.
		// 69번째라인의 생성된 객체와, 90번째라인의 생성된 객체의 주소는 서로다름
		// new연산자로 인해 주소값이 서로다름.
		// 내가(list2) 가지고 있는 값으로 비교할 수 있게끔 바꿔야한다.
		// 주소값을 비교해서 객체가 존재하는지 존재하지 않은 지를 볼건데
		// new 연산자를 이용해서 객체를 생성하니, 아무리 내용이 비슷하더라도, 주소값은 다르다.

		// 동일객체: 주소값이 같은 객체
		// 동등객체: 객체의 주소값은 다르지만, 내용은 같은 것

		System.out.println("list2: "+ list2);
		System.out.println("list2.size(): "+ list2.size());
		System.out.println();

		//hash-code와 equals를 오버라이드했기때문에
		//list2.remove() 안에 들어있는 값이 지워졌다.


		//정렬//
		//정렬1: Collections 이용
		// The method sort(List<T>) in the type Collections
		// is not applicable for the arguments
		//(ArrayList<Student>)
		// list1정의 : ArrayList<String> list1 =new ArrayList<String>();
		// 제너릭<String> 때문에, 타입을 String으로 제한시킴.
		list1.add("박신우");
		list1.add("이영실");
		list1.add("김수진");
		list1.add("김미경");
		list1.add("명다정");
		list1.add("김기쁨");
		list1.add("이수진");
		System.out.println("정렬전: "+ list1);

		// list2와 list1의 차이=> 정렬기준이 세워지지 않음.
		// 정렬기준이 무엇으로 할지를 정해놓지 않아져서.
		// 정렬기준은 어떻게 결정?
		// Student 클래스는 정렬기준을 결정하지 않았다.
		// String 클래스는 직렬화를 통해서 정렬기준을 정했다.
		// String클래스의 헤더
		// public final class String
	    //  implements java.io.Serializable, Comparable<String>, CharSequence
		Collections.sort(list1);
		System.out.println("정렬후: "+ list1); //list1은 정렬기준이 1개이다.

		Collections.sort(list2);
		System.out.println("이름을 기준으로 오름차순 정렬: "+list2);

		//여러개의 정렬기준일때 사용. => Comparator을 이용하여 비교.
		list2.sort(new StudentCompare());
		System.out.println("list2 정렬 후(list.sort()) : "+ list2);
		// 내림차순 StudentCompare()리턴값에다가 -1을 곱하면됨.

		list2.add(new Student("김원", 40));
		list2.add(new Student("홍용표",78));
		list2.add(new Student("최서강",78));
		// StudentCompare()에서 그냥 점수가 같으면 0리턴하면-> 이름을 정렬안되어있음.

		//정렬2: List안에 있는 sort()메소드 이용.
		list2.sort(new StudentCompare());
		//점수가 같을 때 -> 이름을 오름차순으로 정렬.
		System.out.println("list2 정렬후 (list.sort()): "+list2);


		// 데이터 수정.
		// set(int index, E e) : index번째 인덱스에 있는 요소 E요소 수정.
		list2.set(2, new Student("김현진", 88));
		System.out.println("list2: "+list2);

		// get(int index): index번째 인덱스에 있는 요소를 가지고 온다.
		Student getStudent=list2.get(5); // Generic에 의해서 리턴타입이 Generic에 설정된 타입으로 반환.
		System.out.println("getStudent: "+getStudent);
		System.out.println("list2: "+ list2);
		System.out.println();

		//contains(Object o) : o가 리스트에 존재한다면 true를 반환
		boolean bool1= list2.contains(new Student("남우현", 82));
		System.out.println("list2에 score가 82인 남우현이 있는가?: "+ bool1);

		boolean bool2= list2.contains(new Student("최은강", 90));
		System.out.println("list2에 score가 90인 최은강이 있는가?: "+ bool2);

		// 둘 중 하나라도 다르다면, false반환.
		boolean bool3= list2.contains(new Student("최은강", 100));
		System.out.println("list2에 score가 100인 최은강이 있는가?: "+ bool3);

		//indexOf(Object o)  : o가 리스트에 위치하는 인덱스 번호를 반환
		int index1= list2.indexOf(new Student("남우현", 82));
		System.out.println("index1: "+ index1);// 남우현은 list2에 없음. -> 존재안함(-1)

		int index2= list2.indexOf(new Student("문종렬", 100));
		System.out.println("index2: "+ index2); // 존재함.

		int index3= list2.indexOf(new Student("최은강", 99));
		System.out.println("index3: "+ index3);// 99점인 최은강은 없음. -> 존재안함(-1)


		// clear(): 저장된 모든 객체 삭제
		// isEmpty() : 리스트가 비었을 때 true반환
		System.out.println("list2가 비어었는가?: "+ list2.isEmpty());

		list2.clear();
		System.out.println("list2가 진짜 비어었는가?: "+ list2.isEmpty());		
		System.out.println("list2: "+ list2);
	}
}
```

<hr>

```java
// StudentCompare.java
package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

// 제너릭 => 타입 지정(제한) => Student타입으로 제한한다.
public class StudentCompare implements Comparator<Student> {
	// 점수를 기준.
	// Comparator: 정렬기준이 여러개일때. (오름차순)
	/*
	 * 인터페이스의 추상메소드를 오버라이드 시켜야함. The type StudentCompare must implement the
	 * inherited abstract method Comparator<Student>.compare(Student, Student)
	 */
	@Override
	public int compare(Student o1, Student o2) {
		// 비교 주체, 비교 대상
		// 점수에 대해서 오름차순 정렬.
		int standard = o1.getScore();
		int object = o2.getScore();

		String standardName=o1.getName(); //비교주체의 이름
		String objectName=o2.getName(); // 비교대상의 이름.

		if(standard>object)
			return 1;
		else if(standard==object) {
			//점수가 같으면, 이름으로 오름차순 정렬을 해라.
			return standardName.compareTo(objectName);
//			return 0;
		}

		else
			return -1;
//		return (standard==object)?0:((standard>object)?1:-1);
	}
}

```



<hr>

# ArrayList 를 정렬한다.
- 정렬1: collections 이용
  - 정렬 기준이 하나면 -> <strong>Comparable</strong> 을 사용한다.
    - package: java.lang => import 필요 없다.
    - 사용메소드: compareTo()

  - 정렬 기준이 여러개면 -> <strong>Comparator</strong>을 사용한다.
    - package: java.util
    - 사용메소드: compare()

- 정렬2: List안에있는 sort()이용
