package ch01;

import java.util.Scanner;

/**
 * 使用情况语句实现
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Score {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int score;
		String level;
		
		System.out.print("请输入成绩：");
		score=input.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			level="优秀！";
			break;
		case 8:
			level="良好";
			break;
		case 7:
		case 6:
			level="中等";
			break;
		default:
			level="差";
		}
		System.out.println(level);
		
		
		
		
	}
}
