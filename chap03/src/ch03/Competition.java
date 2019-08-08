package ch03;

import java.util.Scanner;

/**
 * 按名次奖励奖品
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Competition {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ranking;

		System.out.print("请输入竞赛的名次：");
		ranking = input.nextInt();

		switch (ranking) {
		case 1:
			System.out.println("参加麻省理工大学组织的一个月夏令营！");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部！");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有任何奖励！");
			break;
		}

	}
}
