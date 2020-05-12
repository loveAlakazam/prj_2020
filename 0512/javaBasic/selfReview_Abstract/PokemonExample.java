package selfReview_Abstract;

public class PokemonExample {

	public static void main(String[] args) {
		//캐이시 클래스 정의
		Abra p1 = new Abra();
		System.out.println("이름: "+p1.name +" 도감번호:"+ p1.number);
		p1.sleep();
		p1.skill();
		p1.sound();
		
		Pikachu p2 =  new Pikachu();
		System.out.println("이름: "+p2.name +" 도감번호:"+ p2.number);
		p2.sleep();
		p2.skill();
		p2.sound();
		

	}

}
