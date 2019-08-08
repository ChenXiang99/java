package ch01;

import java.util.Scanner;

/**
 * 幸运抽奖
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Lottery {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int r;// 随机数
		int number;// 号码
		int hundred;// 百位数字

		// 给会员号赋值
		System.out.print("请输入会员号（4位数整数）：");
		number = input.nextInt();

		// 计算出会员号百位数字
		hundred = number / 100 % 10;

		// 产生0-9之间的随机数
		r = (int) (Math.random() * (10));
//		System.out.println(r);

		//判断会员号是否正确
		while (number < 1000 || number > 10000) {
			System.out.println("您输入的会员号错误！\n请重新输入会员号（4位数整数）：");
			number = input.nextInt();
		}
		// 判断
		if (hundred == r) {
			System.out.println("恭喜会员号：" + number + "，成为今天的幸运客户，奖精美MP4一个~~~");
		} else if (hundred != r) {
			System.out.println("很遗憾！没中奖！");
		}
	}
}
