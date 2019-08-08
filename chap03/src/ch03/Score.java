package ch03;

import java.util.Scanner;

/**
 * 成绩比较
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Score {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 调用类 
		Scanner input = new Scanner(System.in);

		int zs;// 张三的成绩
		int ls = 80;// 李四的成绩
		boolean isBig;// 布尔值用来储存结果

		// 输入张三的成绩
		System.out.println("请输入张三的成绩：");
		zs = input.nextInt();

		// 比较张三是否大于李四
		isBig = zs > ls;

		// 输出
		System.out.print("张三的成绩比李四高吗？\t" + isBig);
	}
}
