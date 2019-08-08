package ch01;

import java.util.Scanner;

/**
 * 购买商品
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Shopping {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 定义变量
		int number;// 商品编号
		String name = null;// 商品名称
		double price = 0;// 商品价格
		int quantity;// 数量
		double num = 0;// 合计
		double ap;// 应付金额
		double amount;// 实付金额
		String yn = "y";// 是否继续
		double diff;// 找钱

		// 输入器
		Scanner input = new Scanner(System.in);

		// 打印购物菜单
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("请选择购买的商品编号：\n1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");

		//判断是否继续，输入y继续。
		while (yn.equalsIgnoreCase("y")) {

			// 给number/quantity赋值；
			System.out.print("请输入商品编号：");
			number = input.nextInt();
			System.out.print("请输入购买数量：");
			quantity = input.nextInt();
			
			//判断输入的商品编号是否正确，错误，重新输入，正确，继续执行程序
			while(number>3) {
				System.out.println("您输入的商品编号不存在~~\n请重新输入：");
				number=input.nextInt();
				System.out.print("请输入购买数量：");
				quantity=input.nextInt();
			}

			// 判断输入的商品编号进行循环
			switch (number) {
			case 1:

				// 给变量name/price//num赋值
				name = "T恤";// 商品名称
				price = 245;// 商品价格
				break;
			case 2:

				// 给变量name/price//num赋值
				name = "网球鞋";// 商品名称
				price = 570;// 商品价格
				break;
			case 3:

				// 给变量name/price//num赋值
				name = "网球拍";// 商品名称
				price = 200;// 商品价格
				break;
			}

			// 计算，总和/输出信息
			num += price * quantity;// 合计
			System.out.println(name + "￥" + price + "\t" + "数量：" + quantity + "\t" + "合计：" + num);

			// 输入是否继续（y/n）
			System.out.print("请输入是否继续（y/n）：");
			yn = input.next();
		}
		// 判断输入为n，结算
		if (yn.equalsIgnoreCase("n")) {
			System.out.println("折扣：0.8");

			// 计算应付金额，给变量ap赋值
			ap = num * 0.8;
			System.out.println("应付金额：" + ap);

			// 给变量amount赋值
			System.out.print("实付金额：");
			amount = input.nextDouble();

			// 判断实付金额小于应付金额，提示重新输入，如果大于应付金额，找钱
			while (amount < ap) {
				// 提示重新输入
				System.out.print("您的钱不够了，请重新输入：");
				amount = input.nextDouble();
			}

			// 计算找钱多少，输出差值
			diff = amount - ap;
			System.out.println("找钱：￥" + diff);

		}

	}
}
