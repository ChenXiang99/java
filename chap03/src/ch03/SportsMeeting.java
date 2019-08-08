package ch03;

import java.util.Scanner;

/**
 * 根据性别进行分组决赛！
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class SportsMeeting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 声明变量
		double score;// 成绩
		String sex;// 性别

		boolean a;

		do {
			// 给变量赋值
			System.out.print("请输入你的百米竞赛成绩：");
			score = input.nextDouble();
			System.out.print("请输入性别：");
			sex = input.next();

			// 判断
			if (score < 10 && score >= 0) {
				if (sex.equals("男")) {
					System.out.println("恭喜你已" + score + "秒的成绩，进入男子组决赛！");
					break;
				} else if (sex.equals("女")) {
					System.out.println("恭喜你已" + score + "秒的成绩，进入女子组决赛！");
					break;
				} else {
					System.out.println("性别输入错误~~请重新输入成绩/性别");
				}
			} else {
				System.out.println("成绩不合格，你被淘汰了！");
				break;
			}
		} while (a = true);

	}
}
