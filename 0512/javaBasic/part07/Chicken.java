package part07;

public class Chicken extends Bird{
	@Override
	public void sound() {
		System.out.println("²¿²¿´ì ²¿²¿²¿");
	}
	
	//¹°·Á¹ÞÀº ¸Þ¼Òµå¸¦ ¿À¹ö¶óÀÌµå
	@Override
	public void fly() {
		//		super.fly(); //ºÎ¸ðÅ¬·¡½º¿¡ Á¤ÀÇµÈ fly()¸¦ È£Ãâ
		System.out.println("Çªµå´ö Çªµå´ö");
	}
}
