package ch01;
/**
 * 华氏温度公式：c * 9 / 5.0 + 32;摄氏温度小于250；
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Temp {
	public static void main(String[] args) {

		double c = 0;// 摄氏温度
		double h;// 华氏温度
		int count = 1;// 序号

		System.out.println("序号\t摄氏温度\t华氏温度");

		do {
			
			h = c * 9 / 5.0 + 32;//华氏温度

			System.out.println(count + "\t" + c + "\t" + h);

			c += 20;
			count++;

		} while ( c < 250);
	}
}
