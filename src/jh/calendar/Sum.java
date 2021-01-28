package jh.calendar;

import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = a+b;
		System.out.println("두 수의 합은 " + sum + "입니다.");
		scan.close();
	}
}
