package jh.calendar;

import java.util.Scanner;

public class Calendar2 {
	public int getDaysOfMonth(int month) {
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		return daysOfMonth[month -1];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar2 cal = new Calendar2();
		
		System.out.println("반복 횟수를 입력하세요.");
		int repeat = scan.nextInt();
		
		
		for(int i = 1; i <= repeat; i++) {
			System.out.println("달을 입력하세요.");
			int month = scan.nextInt();
			System.out.println(month + "달은 " + cal.getDaysOfMonth(month) +
					"일까지 있습니다.");
		}
		System.out.println("Bye~");
	}
}

