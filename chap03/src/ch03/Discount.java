package ch03;

import java.util.Scanner;

/**
 * 普通顾客购物满100元打9折；会员购物打8折；会员购物满200元打7.5折
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Discount {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 声明变量
		double amount;// 金额
		String yn;// 是否会员

		boolean a;

		do {
			System.out.print("请输入是否会员？（y/n）：");
			yn = input.next();

			// 判断
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("请输入购物金额：");
				amount = input.nextDouble();
				if (amount < 200) {// 会员打8折
					System.out.println("--会员购物打8折--\n您购物的总额是：" + amount + "元—\t折扣后是：" + amount * 0.8 + "元\n欢迎下次光临~~");
					break;
				} else {// 满200打7.5折
					System.out.println(
							"--会员购物满200元打7.5折--\n您购物的总额是：" + amount + "元—\t折扣后是：" + amount * 0.75 + "元\n欢迎下次光临~~");
					break;
				}
			} else if (yn.equalsIgnoreCase("n")) {// 判断
				System.out.print("请输入购物金额：");
				amount = input.nextDouble();
				if (amount >= 100) {// 满100打9折
					System.out
							.println("--购物满100元打9折！--\n您购物的总额是：" + amount + "元—\t折扣后是：" + amount * 0.9 + "元\n欢迎下次光临~~");
					break;
				} else {
					System.out.println("您本次购物总金额是：" + amount + "元！\n欢迎下次光临~~");
					break;
				}
			} else {
				System.out.println("请输入（y/n）~~~");
			}
		} while (a = true);

	}
}
