package ch03;

import java.util.Scanner;

/**
 * 根据张浩同学的Java成绩，判断是否有奖励MP4
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class GetPrize {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 声明变量
		int zhScore;

		// 给变量赋值
		System.out.print("请输入张浩同学的Java成绩：");
		zhScore = input.nextInt();

		// 判断
		if (zhScore > 90) {
			System.out.println("奖励一个MP4！");// 大于90输出结果
		} else {
			System.out.println("没有奖励~~");// 小于90输出结果
		}
	}
}
