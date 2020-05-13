package part08;

public class LedTVExam {

	public static void main(String[] args) {
		TV tv= new LedTV();
		tv.turnOn();
		tv.changeChannel(5);
		tv.changeVolume(22);
		tv.turnOff();

	}

}
