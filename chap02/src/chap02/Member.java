package chap02;

import java.util.Scanner;

/**
 * 计算各个位数数字之和
 * 
 * @author 陈想
 * @version 1.0 2019年8月6日
 */
public class Member {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 调用Scanner类
		Scanner input = new Scanner(System.in);

		// 定义变量
		double number;
		int one;// 个位
		int ten;// 十位
		int hundred;// 百位
		int thousand;// 千位
		int sum;// 各个位数的和

		// 输入一个四位数数字
		System.out.print("请输入一个四位数的会员号码：");
		number = input.nextDouble();

		// 取余
		one = (int) number % 10;// 个位
		ten = (int) number / 10 % 10;// 十位
		hundred = (int) number / 100 % 10;// 百位
		thousand = (int) number / 1000 % 10;// 千位

		// 各个位数相加
		sum = one + ten + hundred + thousand;

		// 输出各个位数
		System.out.println("各个位数的和：" + sum);

	}
}
