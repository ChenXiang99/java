package chap02;

import java.util.Scanner;

/**
 * 从控制台输入学生王浩3门课程成绩，编写程序实现
 * 
 * @author 陈想
 * @version 1.0 2019年8月6日
 */
public class Score {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 定义变量
		int javaScore;// java成绩
		int stbScore;// STB成绩
		int sqlScore;// SQL成绩
		int subScore;// 差
		double sum;// 总分
		double avg;// 平均分

		// 定义输入器
		Scanner input = new Scanner(System.in);// 调用Scanner类

		// 给变量赋值
		System.out.print("java的成绩是：");
		javaScore = input.nextInt();
		System.out.print("STB的成绩是：");
		stbScore = input.nextInt();
		System.out.print("SQL的成绩是：");
		sqlScore = input.nextInt();

		// 算出差值和平均分\总分
		subScore = javaScore - stbScore;// Java成绩减去stb成绩的差值
		sum = javaScore + stbScore + sqlScore;// 三门课程总分
		avg = sum / 3;// 三门课程平均分

		// 打印成绩列表
		System.out.println("-------------------------------------");
		System.out.println("科目：\tJava\tSTB\tSQL\n");
		System.out.println("成绩：\t" + javaScore + "\t" + stbScore + "\t" + sqlScore);
		System.out.println("-------------------------------------");

		// 输出差和平均分
		System.out.println("Java和SQL的成绩差：" + subScore);
		System.out.println("3门课成绩总和：" + sum);
		System.out.println("3门课的平均分是：" + avg);
	}
}
