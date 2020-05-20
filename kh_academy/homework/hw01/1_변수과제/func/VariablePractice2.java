package com.kh.practice1.func;

public class VariablePractice2 {
	// �޼ҵ� �����ε� - ����
	//�⺻ ������(int) ����
	public int sum(int a, int b) {
		return a+b;
	}
	
	//byte�� ����
	public byte sum(byte a, byte b) {
		return (byte)(a+b);
		//��������ȯ�� ������, Type mismatch: cannot convert from int to byte �����߻�
		//�Ű������� ����� �������� �⺻���� int���̴�.
	}
	
	//short�� ����
	public short sum(short a, short b) {
		return (short)(a+b);
	}
	
	//long�� ����
	public long sum(long a, long b) {
		return a+b;
		//long���� 8byte�� ������ �����ϹǷ�
		//int���� 4byte�� ������ �����Ѵ�. ��, �ڵ�����ȯ���� ���������� �ڷ����� �����͸�
		//ū ������ �ڷ������� �ٲ۴�.
	}
	
	//�����ε�- ����
	public int sub(int a, int b) {
		return a-b;
	}
	
	public byte sub(byte a, byte b) {
		return (byte)(a-b);
	}
	
	public short sub(short a, short b) {
		return (short)(a-b);
	}
	
	public long sub(long a, long b) {
		return a-b;
	}
	
	//�����ε�- ����
	public int mul(int a, int b) {
		return a*b;
	}
	
	public byte mul(byte a, byte b) {
		return (byte)(a*b);
	}
	
	public short mul(short a, short b) {
		return (short)(a*b);
	}
	
	public long mul(long a, long b) {
		return a*b;
	}
	
	//������(��)
	//���⼭�� ���������� �����غ��ڽ��ϴ�..
	//������ ���� �������ϴ�....����;
	//���⼭�� try-catch���� ����غ��ڽ��ϴ�.
	//0�� ������ ��츦 ���ܷ� �ؾߵǱ⶧���Դϴ�.
	//0�� �����ԵǴ°�쿡�� ���� �����ٴ� ������ �����ϴ�.
	public int div(int a, int b) {
		int result=0;
		try {
			result=a/b;
			
		}catch(Exception e) {
			//���ܸ� ����մϴ�.
			System.out.println(e.toString());
		}
		return result;
	}
	
	public int mod(int a, int b) {
		int result=0;
		try {
			result=a%b;
		}catch(Exception e) {
			//���ܸ� ���
			System.out.println(e.toString());
		}
		return result;
	}
	
	
}
