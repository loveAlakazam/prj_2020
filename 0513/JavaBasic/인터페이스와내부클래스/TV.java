package part08;

// 0513 interface
// ������ ���� ��͸� ������ �ִٸ� ��Ÿ�� 

//Ÿ���� ������ ������,������ ���.
//�������̽� ��ü�� ��ü�� �������� ���Ѵ�.
public interface TV {
	//��� (������ ��) - final ���̰ų�, ��� ��� ����.
	public int MIN_VOLUME=0;
	public int MAX_VOLUME= 100;
	
	//�޼ҵ� ���Ǵ� �ָŸ�ȣ�Ҷ� -> �߻�޼ҵ�� ����.
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
