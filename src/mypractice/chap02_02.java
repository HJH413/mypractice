package mypractice;

import java.util.Scanner;

//[ 문제 ]  국어, 영어, 수학 점수를 입력받아 총점과 평균을 구한다
public class chap02_02 {
	public static void main(String[] args) {
		System.out.println("국영수 값을 입력하세요.");
		Scanner input = new Scanner(System.in);
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		int total = kor + eng + math;
		double avg = total/3;
		
		System.out.println("kor=" + kor );
		System.out.println("eng=" + eng );
		System.out.println("math=" + math );
		System.out.println("===============");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}
}
