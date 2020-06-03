package com.kh.practice.student.view;
// view패키지: 출력결과를 볼 수 있다.

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	// field 필드 //
	private StudentController ssm = new StudentController();
	
	//생성자 //
	//기본 생성자 //
	public StudentMenu() {
		System.out.println("============ 학생정보 출력 ============");
		// 학생의 성적, 결과를 출력한다.
		//1. StudentController에 printStudent() 반환값을
		//   통해 학생 정보 출력
		Student [] studentInfo=ssm.printStudent();
		for(int i=0; i<studentInfo.length; i++)
			System.out.println(studentInfo[i].inform());

		
		System.out.println("\n============ 학생성적 출력 ============");
		//2. StudentController에  avgScore()을 통해
		//   점수합계와 평균 출력
		double avg[]=ssm.avgScore();
		System.out.printf("학생 점수 합계: %d\n", (int) avg[0]);
		System.out.printf("학생 점수 평균: %.1f\n", avg[1]);

		
		System.out.println("\n============ 성적결과 출력 ============");
		//3. 학생의 점수가 CUT_LINE 미만이면 재시험 대상
		//   이상이면 통과 출력
		for(int i=0; i<studentInfo.length; i++) {
			Student st= studentInfo[i]; //현재 학생
			String name= st.getName(); //현재학생 이름
			int score= st.getScore();  //현재학생 점수
			String result=null; //성적결과
			
			if(score>=StudentController.CUT_LINE) {
				result=name+"은 통과입니다.";
			}else {//불합격
				result=name+"은 재시험 대상입니다.";
			}
		
			System.out.println(result);
		}
	}
}
