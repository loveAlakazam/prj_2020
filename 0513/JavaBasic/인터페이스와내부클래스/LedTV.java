package part08;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("LED TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("LED TV를 끕니다.");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("LED TV 볼륨을 "+volume+"으로 조정합니다.");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("LED TV 채널을 "+channel+"로 변경합니다.");

	}

}
