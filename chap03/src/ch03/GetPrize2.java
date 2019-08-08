package ch03;

import java.util.Scanner;

/**
 * if判断
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class GetPrize2 {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 声明变量
		int zhScore;// 成绩

		// 给变量赋值
		System.out.print("请输入张浩同学的成绩：");
		zhScore = input.nextInt();

		// 判断
		if (zhScore > 90) {
			System.out.println("考的不错，奖励一台笔记本电脑！");
		} else {
			System.out.println("考的太差，罚抄代码一百遍~~");
		}
	}
}
