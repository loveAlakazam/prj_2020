# Set
- python의 set과 같음
- 저장 순서가 유지 되지 않고
- 중복값을 허용하지 않는다. 그래서 1개밖에 저장할 수없다.
  - 심지어, null도 중복되면 1개의 null만 저장

- Set의 종류
  - HashSet
  - LinkedHashSet
  - TreeSet

- Set
  - HashSet
    - Set에 객체를 저장할 때 hash 함수를 사용하여 처리속도가 빠르다.
    - 동일 객체뿐만 아니라 동등객체도 중복하여 저장하지 않는다.
      - 동일객체 : 주소값이 같은 객체
      - 동등객체 : 주소값이 달라도, 필드값이 서로 같은(내용이 같은) 객체

  - LinkedHashSet
    - linked: 연결이 되어있는, 순서 유지.
    - HashSet 과 동일하지만, <strong>추가되는 순서를 유지</strong>한다.

<hr>

# Set exercises
- Dog.java
```java
package com.kh.example.set.model.vo;

public class Dog {
	private String name;
	private double weight;

	public Dog() {}
	public Dog(String name, double weight) {
		this();
		this.name=name;
		this.weight=weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		// name이 null이면 0, 아니면 name의 해시코드를 리턴.
		result= prime*result+(name==null?0:name.hashCode());
		result= prime*result+(int)weight; //double을 int로 형변환(강제형변환)
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 객체의 주소값에 따라서 비교.
		if(this==obj) {
			return true;
		}

		// 비교할 객체의 주소값이 null이라면
		if(obj==null) {
			return false;
		}

		// 두개의 클래스가 서로 다르면
		if(getClass()!=obj.getClass()) {
			return false;
		}

		//필드가 서로 같은지 확인
		Dog other= (Dog)obj;

		if(name==null) {
			if(other.name !=null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			//필드 이름이 같지 않다면.
			return false;
		}

		if(weight!=other.weight) {
			return false;
		}

		return true;

	}

	@Override
	public String toString() {
		return name+"("+weight+")";
	}
}

```

- SetController.java
```java
package com.kh.example.set.controller;
import java.util.HashSet;
import java.util.LinkedHashSet;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		//HashSet 이용
		HashSet<Dog> set= new HashSet<>();
		// HashSet is a raw type. References to generic type HashSet<E> should be parameterized
		// generic이 필요=> 타입제한
		// <> : 타입 추론. -> java 1.7 버젼 이전버전에서는 에러뜸.
		//매개변수의 HashSet<제너릭지정> set = new HashSet<>(); //매개변수의 타입을보고 추론가능하게끔 만듬.

		// set에 원소를추가한다.
		// add(Object e) : set 안에 e추가.
		set.add(new Dog("모모", 2.2));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2)]

		set.add(new Dog("이든", 5.4));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2), 이든(5.4)]

		set.add(new Dog("사랑", 1.9));
		System.out.println("set: "+ set);
		System.out.println();

		set.add(new Dog("슈슈", 6.2));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2), 이든(5.4), 슈슈(6.2), 사랑(1.9)]
		// 순서유지가 안됨.

		// set은 중복 허용이 안된다.
		// 객체의 주소값을 통해서 결정하기 때문에
		// 동등객체인데도 추가가된다.
		// 이는 equals()라는 함수를 오버라이딩하여 수정해야한다.
		set.add(new Dog("모모", 2.2));
		System.out.println("set: "+ set);
		System.out.println();
		// (equals 오버라이드 전 결과)
		// set: [모모(2.2), 모모(2.2), 이든(5.4), 슈슈(6.2), 사랑(1.9)]

		// (equals/hashCode 오버라이드 후 결과)
		// set: [모모(2.2), 사랑(1.9), 슈슈(6.2), 이든(5.4)]

		//LinedHashSet
		//: Set과 다르게 순서유지 (중복된 값은 허용 x)
		LinkedHashSet<Dog> set2= new LinkedHashSet<>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));


		set2.add(new Dog("초코", 2.1)); //동등객체 중복저장안됨.
		System.out.println("set2: "+ set2);
		// set2: [초코(2.1), 콩이(8.3), 두부(5.0)]

		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));

		System.out.println("set2: "+ set2); //LinkedHashSet은 순서가 유지된다.
		//set2: [초코(2.1), 콩이(8.3), 두부(5.0), 로이(6.1), 공주(5.2), 왕자(9.5), 조이(12.5)]
		System.out.println();
	}
}
```

- Tree구조
  - 이진 탐색 트리(Binary Search Tree)
    - 루트노드(부모노드)
      - 왼쪽 자식(부모 노드 값보다 작은 값)
      - 오른쪽 자식(부모 노드 값보다 큰 값)

  - 검색 기능을 강화시킨 컬렉션
  - 계층구조를 활용해 이진트리 자료구조를 구현하여 제공.

  - java에서 Tree 기반 객체
    - TreeSet
    - TreeMap

  - TreeSet, TreeMap 정렬
    - TreeSet의 객체와 TreeMap의 Key는 저장과 동시에 자동으로 오름차순으로 정렬
    - 숫자(Integer, Double) 타입일 경우에는 값으로 정렬

    - TreeSet과 TreeMap도 java.lang.Comparable을 구현한 객체를 요구한다. (정렬기준을 정해져있지 않기때문에 정렬기준을 만들어야한다.) 그러지 않을 경우에는 ClassCastException이 발생한다.

    - Integer, Double, String 모두 Comparable 인터페이스를 통해 이미 구현 되어있다.

- TreeSet을 이용하여 객체를 정렬시켜보자.

```java
package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogCompare;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		//HashSet 이용
		HashSet<Dog> set= new HashSet<>();
		// HashSet is a raw type. References to generic type HashSet<E> should be parameterized
		// generic이 필요=> 타입제한
		// <> : 타입 추론. -> java 1.7 버젼 이전버전에서는 에러뜸.
		//매개변수의 HashSet<제너릭지정> set = new HashSet<>(); //매개변수의 타입을보고 추론가능하게끔 만듬.


		// set에 원소를추가한다.
		// add(Object e) : set 안에 e추가.
		set.add(new Dog("모모", 2.2));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2)]

		set.add(new Dog("이든", 5.4));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2), 이든(5.4)]

		set.add(new Dog("사랑", 1.9));
		System.out.println("set: "+ set);
		System.out.println();

		set.add(new Dog("슈슈", 6.2));
		System.out.println("set: "+ set);
		System.out.println();
		// set: [모모(2.2), 이든(5.4), 슈슈(6.2), 사랑(1.9)]
		// 순서유지가 안됨.

		// set은 중복 허용이 안된다.
		// 객체의 주소값을 통해서 결정하기 때문에
		// 동등객체인데도 추가가된다.
		// 이는 equals()라는 함수를 오버라이딩하여 수정해야한다.
		set.add(new Dog("모모", 2.2));
		System.out.println("set: "+ set);
		System.out.println();
		// (equals 오버라이드 전 결과)
		// set: [모모(2.2), 모모(2.2), 이든(5.4), 슈슈(6.2), 사랑(1.9)]

		// (equals/hashCode 오버라이드 후 결과)
		// set: [모모(2.2), 사랑(1.9), 슈슈(6.2), 이든(5.4)]

		//LinedHashSet
		//: Set과 다르게 순서유지 (중복된 값은 허용 x)
		LinkedHashSet<Dog> set2= new LinkedHashSet<>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));


		set2.add(new Dog("초코", 2.1)); //동등객체 중복저장안됨.
		System.out.println("set2: "+ set2);
		// set2: [초코(2.1), 콩이(8.3), 두부(5.0)]

		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));

		System.out.println("set2: "+ set2); //LinkedHashSet은 순서가 유지된다.
		//set2: [초코(2.1), 콩이(8.3), 두부(5.0), 로이(6.1), 공주(5.2), 왕자(9.5), 조이(12.5)]
		System.out.println();

		// TreeSet 이용하여 정렬한다.
		TreeSet<Dog> set3= new TreeSet<>(set2);
		System.out.println("The result of using tree set - 정렬기준: 이름");
		System.out.println("set3: "+set3);
		//set3: [공주(5.2), 두부(5.0), 로이(6.1), 왕자(9.5), 조이(12.5), 초코(2.1), 콩이(8.3)]

		TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println("set4: "+set4);
		//TreeSet<Dog> set4=new TreeSet<Dog>();
		//[공주(5.2), 두부(5.0), 로이(6.1), 왕자(9.5), 조이(12.5), 초코(2.1), 콩이(8.3)]

		// TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		// [조이(12.5), 왕자(9.5), 콩이(8.3), 초코(6.1), 공주(5.2), 두부(5.0), 초코(2.1)]

		// 몸무게가 같은 다른 개이름이 빠짐 로이(6.1) 빠짐.
		//  TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		// Compare인터페이스의 compare()함수를 오버라이드 후
		//[조이(12.5), 왕자(9.5), 콩이(8.3), 로이(6.1), 초코(6.1), 공주(5.2), 두부(5.0), 초코(2.1)]
	}
}
```

<hr>

# Enumeration/ Iterator / ListIterator

- Enumeration: Iterator의 구버젼
- ListIterator: Iterator를 상속받아 양방향이 특징

- Iterator<E>
  - 앞에서부터 검색

- ListIterator<E>
  - 앞에서부터 검색
    - boolean hasNext()
    - E next()

  - 뒤에서부터 검색


- Iterator / ListIterator 을 사용한다.
```java
package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogCompare;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println("set4: "+set4);
		//TreeSet<Dog> set4=new TreeSet<Dog>();
		//[공주(5.2), 두부(5.0), 로이(6.1), 왕자(9.5), 조이(12.5), 초코(2.1), 콩이(8.3)]

		// TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		// [조이(12.5), 왕자(9.5), 콩이(8.3), 초코(6.1), 공주(5.2), 두부(5.0), 초코(2.1)]

		// 몸무게가 같은 다른 개이름이 빠짐 로이(6.1) 빠짐.
		//  TreeSet<Dog> set4=new TreeSet<Dog>(new DogCompare());
		// Compare인터페이스의 compare()함수를 오버라이드 후
		//[조이(12.5), 왕자(9.5), 콩이(8.3), 로이(6.1), 초코(6.1), 공주(5.2), 두부(5.0), 초코(2.1)]




		// Set안에 있는 element 접근하기
		// 접근1. Set을 List로 옮기기
		ArrayList<Dog> list= new ArrayList<Dog>();

		// 그 리스트 안에있는 addAll을 이용하여, 한번에 콜렉션을 넣는다.
		list.addAll(set4);
		System.out.println("list.addAll(set4)=> list: "+ list);
		//list.addAll(set4)=> list: [조이(12.5), 왕자(9.5), 콩이(8.3), 로이(6.1), 초코(6.1), 공주(5.2), 두부(5.0), 초코(2.1)]

		System.out.println("list.get(4): "+ list.get(4));
		//list.get(4): 초코(6.1)


		//접근2. Iterator사용하기 - 단방향.
		Iterator<Dog> it =set4.descendingIterator();

		// The value of the local variable it is not used
		while(it.hasNext()) {
			// (review) StringTokenizer에서 hasMoreToken()?
			// hasNext(): 다음이 존재하는가?
			System.out.println(it.next());
		}

		/*
		 * 	초코(2.1)
			두부(5.0)
			공주(5.2)
			초코(6.1)
			로이(6.1)
			콩이(8.3)
			왕자(9.5)
			조이(12.5)
		 * */

		//이미 끝에 도달했으므로, 다음값이 존재하지 않는다.
		while(it.hasNext()) {
			System.out.println("re: "+ it.next());
		}

		//ListIterator - 양방향
		// 리스트안에서만 사용할 수 있다.
		// java.util > Interface > ListIterator

		// list안에 있는 listIterator()메소드를 호출
		ListIterator<Dog> lit=list.listIterator();
		while(lit.hasNext()) {
			//다음값이 존재하면

			//다음값(lit.next())을 출력하라
			System.out.print(lit.next()+" ");
		}

		System.out.println();
		// 조이(12.5) 왕자(9.5) 콩이(8.3) 로이(6.1) 초코(6.1) 공주(5.2) 두부(5.0) 초코(2.1)

		//REVERSE
		while(lit.hasPrevious()) {
			//이전값이 존재하면

			System.out.print(lit.previous()+" ");
		}
		System.out.println();
		// 초코(2.1) 두부(5.0) 공주(5.2) 초코(6.1) 로이(6.1) 콩이(8.3) 왕자(9.5) 조이(12.5)
	}
}

```


<HR>

# Map

- key: set방식
  - 중복값을 허용하지 않는다.
  - 순서가 유지되지 않는다.
  - 키값이 중복된다면, 나중에 key값에 해당하는 value값이 업데이트됨.
    - 키가 중복되는 경우 기존에 있는 키에 해당하는 값을 덮어 씌움.

- value: list방식
  - 중복값 저장이 가능하다.

- Map은 entry들로 구성되어있다.
  - 그럼 python의 dictionary도 entry들로 구성되어있겠군.
    ```python
    dict alpha
    ```
- entry: key와 value의 쌍을 의미한다.


- 구현 클래스
  - HashMap
  - HashTable
  - LinkedHashMap
  - Properties
  - TreeMap

<hr>

- 활용도 및 중요도: List > Map > Set
  - 메소드 활용.
  - 특징
  - equals()/ hashCode() Overriding.
  - 정렬


<hr>

# HashMap

- 키 객체는 hashCode()와 equals()를 재정의
- 동등객체가 될 조건을 정해야함
  - 동등객체: 객체주소는 달라도, 내용이 같은 객체.

- keytype은 hashCode()와 equals() 메소드가 재정의되어있고
- key값은 주로 String 타입으로 사용한다.
  - 그렇다고 key값을 무조건 String을 사용해야한다는 아님.

- 정의
```java
  MAP <K, V> map = new HashMap<K,V>();
  // K: Key값에 대한 제너릭 - 키값 타입 제한
  // V: Value값에 대한 제너릭 - value값 타입 제한
```

<HR>

# HashTable
- StringBuilder & StringBuffer
- Vector & ArrayList


# TreeMap

- key값을 기준으로 정렬한다.
  - key값은 중복을 허용하지 않은 독립된 값이니까. (구분하는데 용이)

- exercise for TreeMap
```java
//Snack.java
package com.kh.example.map.model.vo;

public class Snack {
	private String flavour;
	private int price;
	public Snack() {}

	public Snack(String flavour, int price) {
		this();
		this.flavour=flavour;
		this.price= price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return flavour+"["+price+"원]";
	}

	@Override
	public int hashCode() {
		final int prime= 31;
		int result=1;
		result= prime*result+(flavour==null?0:flavour.hashCode());
		result= prime*result+price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//객체비교
		if(this==obj)//동등객체 - 주소값이 서로 같다.
			return true;

		if(obj==null) //obj가 null이라면
			return false;

		if(getClass()!=obj.getClass())
			return false;

		//필드비교
		Snack other= (Snack)obj;

		//flavour 필드가 서로 다르다면
		if(flavour==null) { //flavour필드가 null이라면
			if(other.flavour!=null)//그런데 other의 필드가 null이 아니라면.
				return false;

		}else if(!flavour.equals(other.flavour)) {
			//flavour필드가 null이 아니라면.
			//flavour필드와 other의 flavour필드가 서로 다르다면
			return false;
		}

		//price필드와 other(비교대상)의 price필드가 서로다르다면.
		if(price!=other.price)
			return false;
		return true;
	}
}
```

```java
//MapController.java
package com.kh.example.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackCompare;
import com.kh.example.map.model.vo.Snack;

public class MapController {

	public void doMap() {
		//HashMap<Key-type , Value-type> map = new HashMap<Key-type , Value-type>();
		HashMap<String, Snack> map = new HashMap<String, Snack>();

		//put(key, value) : 키와 값을 추가한다. (insert entry)
		// to put the entry
		// put() method  means to insert one entry.
		map.put("새우깡",new Snack("salted", 1500));
		map.put("다이제", new Snack("chocolate", 2500));
		map.put("포테이토칩", new Snack("salted", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));

		System.out.println("map: "+map);
		System.out.println();

		//  MAP은 중복저장을 허용하지 않는다. - 키값이 중복은 허용하지 않는다.
		System.out.println("Is Duplicated element?");
		map.put("새우깡", new Snack("salted", 1500)); // 동등객체는 중복된 데이터이므로 포함안됨.
		// 키값이 String이기 때문에, String은 이미 기준이 정해져있다.

		System.out.println("map: "+ map);
		System.out.println();

		map.put("새우깡", new Snack("hot", 1500)); // flavour 필드를 변경.
		System.out.println("map: "+map);
		//key는 같더라도, value에 해당하는 값이 변경.


		// containKey(Object key) : key가 있으면 true를 반환
		// containValue(Object value): value가 있으면 true를 반환.
		System.out.println(map.containsKey("새우깡"));//true
		System.out.println(map.containsValue(new Snack("salted", 1500)));//false -> true
		// equals()와 hashCode()오버라이드 이전 => false
		// equals()와  hashCode()오버라이드 이후 => true
		// equals()와 hashCode() 오버라이드 목적: 동등객체를 찾는경우. - 객체의 주소기준이 아닌 객체안의 필드를 기준으로 존재하는지 찾는다.

		//map.get(key): key값을 이용하여, key값에 해당하는 map의 value를 추출.
		System.out.println(map.get("새우깡")); //hot[1500원]
		System.out.println(map.get("홈런볼")); //null

		// map element 접근하기
		// To access element in map.
		// 1. values() : 모든 value들을 Collection에 담아 변환
		System.out.println(map.values());

		//2. keySet(): 모든 (key) 를 (set)에 담아서 변환
		// keySet() : 모든 key를 set에 담아서 변환

		// 현재 만든 map의 key의 타입이 String이기 때문.
		Set<String> set1= map.keySet();
		System.out.println("set1: "+ set1); //set1: [다이제, 새우깡, 포테이토칩, 고소미] => 위에서 정의한 map의 key값들의 집합.


		// iterator: Iterator를 이용하여  map안에 있는 모든 원소들을 접근하기.
		Iterator<String> it1= set1.iterator();
		while(it1.hasNext()) {// 다음키가 존재하는가?
			String key= it1.next();//존재한다면, 그다음값을 갖고오너라.
			System.out.println("map["+key+"]="+map.get(key)); //value를 불러온다: map.get(key)
		}
		/*
		 * 	map[다이제]=chocolate[2500원]
			map[새우깡]=hot[1500원]
			map[포테이토칩]=salted[1500원]
			map[고소미]=고소한맛[1000원]
		 * */

		System.out.println();
		System.out.println("Using for each block");
		//iterator을 사용하지 않아도, for문을 이용하여 map의 원소를 접근
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		System.out.println();

		// 3. entrySet() : 모든 entry(key+value) 객체를 set에 담아서 변환
		Set<Entry<String, Snack>>set2= map.entrySet(); //import java.util.Map.Entry;
		Iterator<Entry<String, Snack>>it2= set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry= it2.next();
			// Entry의 key를 갖고 오고싶다면 -> getKey()메소드 이용.
			// Entry의 value를 갖고 오고싶다면 -> getValue()메소드 이용.
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}

		System.out.println();
		System.out.println("using for each block");
		for(Entry<String, Snack> e : map.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}
		System.out.println();

		// TreeMap
		// 정렬을 자동으로 해준다.
		System.out.println("TreeMap Exercises");
		TreeMap<String, Snack>map2= new TreeMap<String, Snack>(new SnackCompare());
		map2.putAll(map); //자동정렬 -> key값을 기준으로 정렬-> key는 String타입
		// String은 정렬기준이 이미 정해져있어서, 알아서 오름차순으로 정렬됨.
		// 한개 정렬 -> compareTo();

		System.out.println("map2: "+ map2);
		//TreeMap<String, Snack>map2= new TreeMap<String, Snack>();
		//map2: {고소미=고소한맛[1000원], 다이제=chocolate[2500원], 새우깡=hot[1500원], 포테이토칩=salted[1500원]}

		//내림차순을 한다면, Compartor이 필요( 정렬기준이 두개이상인경우)
		//SnackComparator생성하고
		//map2의 정렬기준을 새로만든 정렬기준으로 적용
		//TreeMap<String, Snack>map2= new TreeMap<String, Snack>(new SnackCompare());
		//map2: {포테이토칩=salted[1500원], 새우깡=hot[1500원], 다이제=chocolate[2500원], 고소미=고소한맛[1000원]}

		//size(): map에 대한 entry의 개수를 반환
		// to return the number of entries
		System.out.println("map.size(): "+ map.size());
		System.out.println("map.remove(다이제)=> "+ map.remove("다이제")+"value값을 반환하고, map에서 제외됨."); //key에해당하는 value를 반환하여, key에 해당하는 엔트리가 삭제됨.
		System.out.println("map: "+ map);
		System.out.println(map.remove("고소미", new Snack("고소한맛", 1000))); //true
		System.out.println(map.remove("포테이토",new Snack("salted", 1500)));// false=> map에 키값이 "포테이토"는 없다.
		System.out.println("map: "+map);
		System.out.println();


		//clear() : 모든 entry삭제
		System.out.println("isEmpty? "+ map.isEmpty()); //false
		map.clear();
		System.out.println("map: "+ map); //map: {}

		//isEmpty(): map이 비어있는지 확인
		System.out.println("isEmpty?: "+map.isEmpty());// true
	}
}

```
- SnackCompare.java
```java
package com.kh.example.map.model.compare;

import java.util.Comparator;


public class SnackCompare implements Comparator<String>{
	//키값을 기준으로 - 내림차순 정렬
	//map의 key는 String 타입이라서 -> 제너릭을 String으로 한다.

	//내림차순 정렬
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}
```



<hr>

# Properties

- key와 value 타입이 모두 String인 Map Collection이다.
- 주로 Properties는 프로퍼티(\*.properties) 파일을 읽어들일때 사용
  - JSP Servlet에서 사용.

- \*.Properties 파일
  - 옵션 정보/ 데이터베이스 연결정보/ 국제화(다국어) 정보를 기록하여 텍스트 파일로 활용

  - Application에서 주로 변경이 잦은 문자열을 저장하여 관리하기 때문에 유지보수를 편리하게 만들어줌.

  - 키와 값이 '='기호로 연결되어 있는 텍스트 파일로 ISO 8859-1 문자셋으로 저장되고, 한글은 Unicode로 변환되어 저장.


- Properties Exercise 1

<br>

```java
//MapController.java
package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackCompare;
import com.kh.example.map.model.vo.Snack;

public class MapController {

	public void doProperties() {
		// 이미 key와 value의 타입이 String으로 정해져있기때문에
		// 제너릭을 이용하지 않아도 된다.
		Properties prop= new Properties();
//		prop.put(1,10);
		//Properties클래스에서는 put()메소드를 정의하지 않았다.

		//Properties는 HashTable의 자식클래스이므로
		//HashTable의 put()메소드를 상속받았다.
		//HashTable 클래스의 put()메소드는
		/*
		 * put(K key, V value) 형식이다.
		 *
		 * setProperty()메소드를 사용해야한다.
		 * setProperty(String key, String value)
		 * */

//		System.out.println("prop: "+prop);
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		System.out.println("prop: "+ prop);
		//prop: {과일=사과, 채소=오이, 간식=젤리, 1=10}
		//순서가 유지되지 않는다.

		prop.setProperty("채소", "피망");
		System.out.println("prop: "+ prop);
		//prop: {과일=사과, 채소=피망, 간식=젤리}
		//키값의 중복을 허용하지 않는다. map과 같음.
		//Not duplicated key

		//getProperty: key를 통해서 값을 받아온다.
		System.out.println("prop.getProperty(채소): "+ prop.getProperty("채소"));//피망

		//없는 키값이라면..? => null
		System.out.println("prop.getProperty(견과): "+ prop.getProperty("견과"));//null

		//prop.getProperty(String key, String defaultValue)
		System.out.println("prop.getProperty(\"채소\",\"땅콩\"): "+prop.getProperty("채소","땅콩")); //피망
    //key가 존재하면, key에 해당하는 value값을 갖고온다.

		System.out.println("prop.getProperty(\"견과\",\"땅콩\"): "+ prop.getProperty("견과","땅콩")); //땅콩
    //key가 존재하지 않으면, 정의한 value값을 갖고온다.
	}

	public void fileSave(String fileName) {
		//file저장
		//Writer, OutputStream 이 필요
//		FileOutputStream fos = new FileOutputStream(fileName);
		try(FileOutputStream fos =new FileOutputStream(fileName);){

			Properties prop =new Properties();
			prop.setProperty("title", "Properties Practiece");
			prop.setProperty("width", "1920");
			prop.setProperty("height", "1080");
			prop.setProperty("language", "EUC-KR");

			//store(OutputStream out, String comments);
			//store(Writer writer, String comments);
			//: 저장된 정보를 바이트/문자 스트림으로 출력 저장
			//: comments는 주석으로 저장.
//			prop.store(fos, "Properties Test File");

			// storeToXML(OutputStream out, String comments)
			// storeToXML(Writer writer, String comments)
			//: 프로퍼티를 XML형식으로 저장하겠다.
			prop.storeToXML(fos, "Properties XML version File");

		}catch(FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//파일을 읽어온다.
	public void fileOpen(String fileName) {
		try(FileInputStream fis =new FileInputStream(fileName);){
			Properties prop= new Properties();

//			prop.loadFromXML(fis);
			//XML파일을 읽어온다.
			//읽어온 파일 내용을 prop에 담는다.

//			System.out.println("prop: "+prop);

			//properties파일을 읽어온다.
			//읽어온파일 내용을 prop에 담는다.
			prop.load(fis);
			System.out.println("prop: "+prop);

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}

```

<br>

```java
package com.kh.example.map.run;

import com.kh.example.map.controller.MapController;

public class Run {
	// must insert main method!
	// Syntax error on token "doMap", Identifier expected after this token
	public static void main(String[] args) {
		MapController m = new MapController();
//		m.doMap();
//		m.doProperties();

		//파일저장.(파일쓰기)
//		m.fileSave("test.properties");
//		m.fileSave("test.xml");

		//파일읽기
//		m.fileOpen("test.xml");
		m.fileOpen("test.properties");
	}
}
```
