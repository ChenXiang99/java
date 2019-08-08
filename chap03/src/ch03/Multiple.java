package ch03;

import java.util.Scanner;
/**
 * 多种if判断
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Multiple {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//声明变量
		int score;//成绩
		boolean a;
		
		do {
			//给变量赋值
			System.out.print("请输入考试成绩：");
			score=input.nextInt();
		
			//判断
			if(score>100) {
				System.out.println("您输入的成绩错误！~~请重新输入");
			}else if(score>=90) {
				System.out.println("优秀！");
				break;
			}else if(score>=80) {
				System.out.println("良好！");
				break;
			}else if(score>=60){
				System.out.println("中等");
				break;
			}else if(score<60&&score>=0){
				System.out.println("差");
				break;
			}else if(score<0) {
				System.out.println("您输入的成绩错误！~~请重新输入");
			}
		
			
		}while(a=true);
		
	}
}
