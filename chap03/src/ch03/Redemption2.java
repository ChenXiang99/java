package ch03;

import java.util.Scanner;

/**
 * 换购
 * 
 * @author 陈想
 * @version 1.0 2019年8月7日
 */
public class Redemption2 {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int amount;//金额
		int number;//编号
		
		System.out.print("请输入消费金额：");
		amount=input.nextInt();
		
		//换购菜单
		System.out.println("请选择以下情况进行换购：");
		System.out.println("1.满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2.满100元，加3元换购500mlk可乐一瓶");
		System.out.println("3.满100元，加10元换购5公斤面粉");
		System.out.println("4.满200元，加10元换购苏泊尔炒菜锅");
		System.out.println("5.满200元，加20元换购欧莱雅爽肤水");
		System.out.println("0.不换购");
		
		System.out.print("请选择（0-5）：");
		number=input.nextInt();
		
		//判断输入的数字进行换购
		switch(number) {
		case 1:
			if(amount>=50) {//判断是否满足换购条件
				System.out.println("本次消费总金额："+(amount+2)+"元");
				System.out.println("成功换购：百事可乐饮料一瓶");
				break;
			}else {
				System.out.println("抱歉，您的消费金额不满足换购条件！");
				break;
			}
		case 2:
			if(amount>=100) {//判断是否满足换购条件
				System.out.println("本次消费总金额："+(amount+3)+"元");
				System.out.println("成功换购：500ml可乐一瓶");
				break;
			}else {
				System.out.println("抱歉，您的消费金额不满足换购条件！");
				break;
			}
		case 3:
			if(amount>=100) {//判断是否满足换购条件
				System.out.println("本次消费总金额："+(amount+10)+"元");
				System.out.println("成功换购：5公斤面粉");
				break;
			}else {
				System.out.println("抱歉，您的消费金额不满足换购条件！");
				break;
			}
		case 4:
			if(amount>=200) {//判断是否满足换购条件
				System.out.println("本次消费总金额："+(amount+10)+"元");
				System.out.println("成功换购：苏泊尔炒菜锅");
				break;
			}else {
				System.out.println("抱歉，您的消费金额不满足换购条件！");
				break;
			}
		case 5:
			if(amount>=200) {//判断是否满足换购条件
				System.out.println("本次消费总金额："+(amount+20)+"元");
				System.out.println("成功换购：欧莱雅爽肤水");
				break;
			}else {
				System.out.println("抱歉，您的消费金额不满足换购条件！");
				break;
			}
		case 0:
			System.out.println("您本次消费金额："+amount+"元\n欢迎下次参加我们的换购活动！~~");
		}
	}
}
