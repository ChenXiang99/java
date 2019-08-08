package ch03;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;// 会员号码
		String birthday;// 会员生日
		int integral;// 积分

		System.out.println("我行我素购物管理系统    >    客户信息管理    >    添加客户信息\n");

		// 给变量赋值
		System.out.print("请输入会员号 <4位整数> ：");
		number = input.nextInt();
		System.out.print("请输入会员生日（月/日用两位数表示） ：");
		birthday = input.next();
		System.out.print("请输入积分：");
		integral = input.nextInt();

		// 判断
		if (number < 10000 && number >= 1000) {
			System.out.println("已录入的会员信息是：\n");
			System.out.println("会员号码\t"+"会员生日\t"+"积分\t\n");
			System.out.println(number + "\t" + birthday + "\t" + integral + "\t");
		} else {
			System.out.println("你输入的会员号不合法！");
		}

		// 输出信息
		

	}
}
