package chap02;
/**
 * 定义变量，并给变量赋值，打印输出
 * 
 * @author 陈想
 * @version 1.0 2019年8月6日
 */
public class Testype {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		//定义变量
		double score;		//成绩
		String name;		//姓名
		char sex;			//性别
		
		//给变量赋值
		score=99.5;
		name="张三";
		sex='男';
		
		//打印输出
		System.out.println("Java课考试最高分："+score);
		System.out.println("最高分学生姓名："+name);
		System.out.println("最高分学生性别："+sex);
	}
}
