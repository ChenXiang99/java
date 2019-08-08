package ch01;
/**
 * 输入一百遍好好学习天天向上，计算1-100加上总和；
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Student {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		//初始化循环条件变量
		int i=2006;
		double sum=8;
		
		//循环条件判断
		while(sum<20) {
			
			//执行循环体
			System.out.println("第"+i+"遍，好好学习，天天向上！~~");
			sum+=sum*25/100;
			
			//改变循环条件变量
			i++;
		}
		System.out.println(i);
	}
}
