package mypractice;

import java.util.Scanner;

public class chap02_03 {
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
		
		if(avg>=90) {
			System.out.println("A학점입니다.");
		} else if (avg>=80){
			System.out.println("B학점입니다.");
		}else if (avg>=70){
			System.out.println("C학점입니다.");
		}else if (avg>=60){
			System.out.println("D학점입니다.");
		}else if (avg>=50){
			System.out.println("E학점입니다.");
		}else{
			System.out.println("F학점입니다.");
		}
		
		input.close();
	}

}
