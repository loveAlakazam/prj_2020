package part08;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("LED TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("LED TV�� ���ϴ�.");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("LED TV ������ "+volume+"���� �����մϴ�.");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("LED TV ä���� "+channel+"�� �����մϴ�.");

	}

}
