package part07;

public class BirdExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sound();
		duck.fly();
		
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.fly();
		
		Bird bird = new Bird(); //추상클래스는 생성자 x
	}

}
