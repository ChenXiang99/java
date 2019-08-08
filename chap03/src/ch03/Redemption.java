package ch03;

import java.util.Scanner;

/**
 * 换购
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Redemption {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int amount;// 金额
		int number;// 编号

		boolean a;

		System.out.print("请输入消费金额：");
		amount = input.nextInt();

		// 换购菜单
		System.out.println("请选择以下情况进行换购：");
		System.out.println("\t1.满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("\t2.满100元，加3元换购500ml可乐一瓶");
		System.out.println("\t3.满100元，加10元换购5公斤面粉");
		System.out.println("\t4.满200元，加10元换购苏泊尔炒菜锅");
		System.out.println("\t5.满200元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("\t0.不换购");

		// 给变量赋值
		System.out.print("请选择（0-5）：");
		do {
			number = input.nextInt();

			// 判断
			switch (number) {
			case 1:
				// 判断金额是否满50
				if (amount >= 50) {
					amount+=2;
					System.out.println("本次消费总金额：" + amount);
					System.out.println("成功换购：百事可乐饮料一瓶");
				} else {
					System.out.print("抱歉，您的购物金额不满50元，不能进行换购~\n请重新选择（0-5）：");
				}
				break;
			case 2:
				// 判断金额是否满100
				if (amount >= 100) {
					amount+=3;
					System.out.println("本次消费总金额：" + amount);
					System.out.println("成功换购：500ml可乐一瓶");
				} else {
					System.out.print("抱歉，您的购物金额不满100元，不能进行换购~\n请重新选择（0-5）：");
				}
				break;
			case 3:
				// 判断金额是否满100
				if (amount >= 100) {
					amount+=10;
					System.out.println("本次消费总金额：" + amount);
					System.out.println("成功换购：5公斤面粉");
				} else {
					System.out.print("抱歉，您的购物金额不满100元，不能进行换购~\n请重新选择（0-5）：");
				}
				break;
			case 4:
				// 判断金额是否满200
				if (amount >= 200) {
					amount+=10;
					System.out.println("本次消费总金额：" + amount);
					System.out.println("成功换购：苏泊尔炒菜锅");
				} else {
					System.out.print("抱歉，您的购物金额不满200元，不能进行换购~\n请重新选择（0-5）：");
				}
				break;
			case 5:
				// 判断金额是否满200
				if (amount >= 200) {
					amount+=20;
					System.out.println("本次消费总金额：" + amount);
					System.out.println("成功换购：欧莱雅爽肤水一瓶");
				} else {
					System.out.print("抱歉，您的购物金额不满200元，不能进行换购~\n请重新选择（0-5）：");
				}
				break;
			case 0:
				System.out.println("不换购，欢迎下次再参加我们的换购活动！");
				return;
				default:
					System.out.println("输入错误，请重新输入！");
			}
		} while (a = true);
	}
}
