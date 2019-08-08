package ch01;

import java.util.Scanner;

/**
 * 判断输入的数是质数/素数
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = 0;
		int num;

		System.out.print("请输入一个数：");
		num = input.nextInt();

		// 判断它不是素数
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("这个数不是素数！");
				a = 1;
				return;
			}
		}
			System.out.println("这个数是素数！");
	}
}
