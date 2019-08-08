package ch03;

import java.util.Scanner;

/**
 * 根据张浩同学的Java和音乐成绩
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Score2 {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 声明变量
		int javaScore;// Java成绩
		int musicScore;// 音乐成绩

		// 给变量赋值
		System.out.print("输入Java成绩：");
		javaScore = input.nextInt();
		System.out.print("输入音乐成绩：");
		musicScore = input.nextInt();

		// 判断输出
		if (javaScore > 90 && musicScore > 80 || javaScore > 95 && musicScore > 70) {
			System.out.println("获得奖励—一台苹果笔记本电脑~~");
		} else {
			System.out.println("考的太差，没有奖励！");
		}
	}

}
