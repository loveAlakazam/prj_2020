package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	// �ǽ����� 1
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");

		// �޴���ȣ �Է�
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();

		// ������ �޴�
		String selected;
		switch (menu) {
		case 1:
			selected = "�Է�";
			System.out.println(selected + "�޴� �Դϴ�.");
			break; // �ٸ����̽��� �������� ��������, break�� �ʿ�.
		case 2:
			selected = "����";
			System.out.println(selected + "�޴� �Դϴ�.");
			break;

		case 3:
			selected = "��ȸ";
			System.out.println(selected + "�޴� �Դϴ�.");
			break;

		case 4:
			selected = "����";
			System.out.println(selected + "�޴� �Դϴ�.");
			break;

		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;

		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}

	// �ǽ�����2
	public void practice2() {
		// Ű����� �Է¹��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ��� �Է����ּ���: ");
		int num = sc.nextInt();

		String result;
		// num�� ������
		if (num > 0) {
			if (num % 2 == 0) { // ¦���ΰ�?
				result = "¦���̴�.";
			} else { // ¦���� �ƴ϶��
				result = "Ȧ���̴�.";
			}
		} else {// num�� ����� �ƴϴ�.

			result = "����� �Է����ּ���.";
		}

		System.out.println(result);
	}

	// �ǽ����� 3
	public void practice3() {
		// ����/ ����/ ���� �������� ������ Ű����� �Է¹޴´�.
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		kor = sc.nextInt();

		System.out.print("���� ���� �Է�: ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է�: ");
		mat = sc.nextInt();

		// �հ踦 ���Ѵ�.
		int total = kor + eng + mat;
		double avg = (double) total / 3.0;

		// ������������ ���� 40���̻� (��/��/�� ��� 40���̻�)
		// ����� 60�� �̻�
		if ((kor >= 40 && eng >= 40 && mat >= 40) && (avg >= 60)) {
			// �հ�
			System.out.printf("����: %d��\n", kor);
			System.out.printf("����: %d��\n", eng);
			System.out.printf("����: %d��\n", mat);
			System.out.printf("�հ�: %d��\n���: %.1f\n�����մϴ�! �հ��Դϴ�!", total, avg);

		} else {
			// ���հ�
			System.out.println("���հ� �Դϴ�.");
		}
	}

	// �ǽ�����4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է�: ");
		int month = Integer.parseInt(sc.nextLine());
		String season;
		switch (month) {
		// 1�� , 2��, 12�� => �ܿ�
		case 1:
		case 2:
		case 12:
			season = "�ܿ�";
			break;

		// 3�� ~ 5�� => ��
		case 3:
		case 4:
		case 5:
			season = "��";
			break;

		// 6�� ~ 8�� => ����
		case 6:
		case 7:
		case 8:
			season = "����";
			break;

		// 9�� ~11�� => ����
		case 9:
		case 10:
		case 11:
			season = "����";
			break;

		// �׿��� ����
		default:
			season = "error";
		}

		// case������ ����� �Ⱦ.. ���ǹ��� �߰��ؼ� ����ϴ�.
		if (season.equals("error")) {
			System.out.println(month + "��(��) �߸� �Էµ� ���Դϴ�.");
		} else {
			System.out.println(month + "���� " + season + "�Դϴ�.");
		}
	}

	// �ǽ�����5
	public void practice5() {
		// ���̵�, ��й�ȣ ���صΰ� �α��� ����� �ۼ��ϼ���.
		// ���س��� ���̵�� ��й�ȣ
		String realId = "myId";
		String realPw = "myPassword12";

		// ����ڰ� �Է��� ���̵�� ��й�ȣ
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵�: ");
		String inputId = sc.next();

		System.out.print("��й�ȣ: ");
		String inputPw = sc.next();

		// ���̵� ��ġ�ϴ°�?
		String result;
		if (inputId.equals(realId)) {
			// ��й�ȣ�� ��ġ�ϴ°�?
			if (inputPw.equals(realPw)) {
				result = "�α��� ����";
			} else {
				result = "��й�ȣ�� Ʋ�Ƚ��ϴ�.";
			}
		} else {
			// ���̵� ��ġ���� ����
			result = "���̵� Ʋ�Ƚ��ϴ�.";
		}
		// ��¸޽���
		System.out.println(result);
	}

	// �ǽ�����6
	public void practice6() {
		// ����ڿ��� ������/ ȸ��/ ��ȸ�� �� �ϳ��� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String position = sc.nextLine();

		// �� ����� ���� �� �ִ� ���� ���
		String available; // ��ȸ���� �������� �Ѵ�.

		switch (position) {
		case "������":
			available = "ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
			break;

		case "ȸ��":
			available = "�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
			break;
		case "��ȸ��":
			available = "�Խñ� ��ȸ";
			break;

		default:
			available = "����";
		}
		if (!available.equals("����"))
			System.out.println(available);
	}

	// �ǽ�����7
	public void practice7() {
		try {
			double height, weight;
			Scanner sc = new Scanner(System.in);
			System.out.print("Ű(m)�� �Է����ּ���: ");
			height = Double.parseDouble(sc.nextLine());

			System.out.print("������(kg)�� �Է����ּ���: ");
			weight = Double.parseDouble(sc.nextLine());

			double bmi = weight / (height * height);
			System.out.println("BMI ����: " + bmi);
			String result;
			if (bmi < 18.5) { // 18.5�̸� -> ��ü��
				result = "��ü��";
			} else if (bmi < 23) { // ����ü��
				result = "���� ü��";
			} else if (bmi < 25) { // ������
				result = "��ü��";
			} else if (bmi < 30) {// ��
				result = "��";
			} else {// ����
				result = "����";
			}
			System.out.println(result);
		} catch (Exception e) {
			// Ű�� 0m�� �ƴ���.
			System.out.println("�߸� �Է��ϼ̽��ϴ�!");
			System.out.println("�ٽ� �Է����ּ���!");
		}
	}

	// �ǽ�����8
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		// �ΰ��� ������ ���� ��ȣ�� �Է¹޴´�.
		System.out.print("�ǿ�����1 �Է�: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("�ǿ�����2 �Է�: ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.print("������ �Է�(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);

		// �ΰ��� ���� ��� ����� ���� �۵�
		if (num1 > 0 && num2 > 0) {
			String result = "";
			switch (op) {
			case '+':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 + num2);
				break;

			case '-':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 - num2);
				break;

			case '*':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 * num2);
				break;

			case '/':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) num1 / num2);
				break;

			case '%':
				System.out.printf("%d %c %d = %f", num1, op, num2, (float) (num1 % num2));
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		}
	}

	// �ǽ�����9
	public void practice9() {
		// �߰��������, �⸻�������, ��������, �⼮Ƚ�� �Է�
		Scanner sc = new Scanner(System.in);
		double midTerm, finalTerm, homeworkScore, attendCnt;
		double total = 0;
		System.out.print("�߰���� ����: ");
		midTerm = Double.parseDouble(sc.nextLine());
		midTerm *= 0.2;
		total += midTerm;

		System.out.print("�⸻��� ����: ");
		finalTerm = Double.parseDouble(sc.nextLine());
		finalTerm *= 0.3;
		total += finalTerm;

		System.out.print("���� ����: ");
		homeworkScore = Double.parseDouble(sc.nextLine());
		homeworkScore *= 0.3;
		total += homeworkScore;

		// 20ȸ�߿��� �⼮�� ���� ���� ������ ����ϼ���.
		System.out.print("�⼮Ƚ��: ");
		attendCnt = Double.parseDouble(sc.nextLine());
		attendCnt = ((attendCnt / 20) * 100) * 0.2;
		total += attendCnt;

		System.out.println("=========== ��� ===========");
		// �⼮Ƚ���� 30%�̻� �Ἦ�ϸ� fail (70%���� �⼮)
		if (attendCnt <= 0.7 * 20) {
			System.out.println("Fail [�⼮Ƚ�� ����(" + (int) attendCnt + "/20)]");
		} else {
			// �⼮���� ����ÿ� ���� ������
			System.out.printf("�߰���� ����(20): %.1f\n", midTerm);
			System.out.printf("�⸻��� ����(30): %.1f\n", finalTerm);
			System.out.printf("��������       (30): %.1f\n", homeworkScore);
			System.out.printf("�⼮����       (20): %.1f\n", attendCnt);
			System.out.printf("����: %.1f\n", total);

			// ���� 70�� �̻��̶��
			if (total >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		}
	}

	// �ǽ�����10
	public void practice10() {
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");

		System.out.print("����: ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice1();
			break;
			
		case 2:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice2();
			break;
			
		case 3:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice3();
			break;
			
		case 4:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice4();
			break;
			
		case 5:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice5();
			break;
			
		case 6:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice6();
			break;
			
		case 7:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice7();
			break;
			
		case 8:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice8();
			break;
			
		case 9:
			System.out.println("(�ǽ����� " + menu + "����)");
			practice9();
			break;
			
		default:
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println();
		}
	}

	// �ǽ�����11
	// �Է��� ��й�ȣ�� �Ǿ��ڸ����� 1~9������ �����ΰ�?
	public boolean isOne2Nine(int firstNum) {
		// ù��°���ڰ� 1�� 9������ �������, true�� ����
		if (firstNum >= 1 && firstNum <= 9)
			return true;

		// 1~9������ ������ �ƴ϶��, false�� ����
		return false;
	}

	public boolean isDuplicated(String password) {
		// �迭�� �ݺ����� �̿��Ͽ� �ߺ��Ǵ� ������ ������ ī��Ʈ
		boolean usedNum[] = new boolean[10];
		for (int i = 0; i < password.length(); i++) {
			char now = password.charAt(i);
			if (usedNum[now - '0']) // �̹� ����ߴٸ�
				return true;
			else
				usedNum[now - '0'] = true; // ���� ������� ����.
		}
		return false;
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String password = sc.nextLine();

		// �̰� �迭�� �ݺ����� ��ߵɰ� ������...
		int useNum[] = new int[10];

		String message = "����"; // ��� ��� �޽���
		// �Է��� ��й�ȣ�� ���̰� 4�ΰ�?
		if (password.length() == 4) {
			// ���� ���ڸ����� 1~9������ �����ΰ�?
			int firstNumber = password.charAt(0) - '0';
			if (isOne2Nine(firstNumber)) {
				// ù��° ���ڰ� 1~9������ �����̴�.
				// �ߺ��� ���ڰ� �����ϴ°�?
				if (isDuplicated(password))// �ߺ��� ���ڰ� �����Ѵٸ�
					message = "����(�����ߺ�)";

			} else {
				// ù��°���ڰ� 1~9������ ������ �ƴϴ�.
				message = "����(�Ǿ��ڸ� 1~9���� �ƴ�)";
			}
		} else {
			// �ڸ����� �ȸ���
			message = "�ڸ��� �ȸ���";
		}

		System.out.println(message);
	}

}
