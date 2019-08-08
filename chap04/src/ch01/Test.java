package ch01;

import java.util.Scanner;

/**
 * 商场购物换购活动
 * 
 * @author 陈想
 * @version 1.0 2019年8月8日
 */
public class Test {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		int a=0;
		
		while(i<=10000) {
			a+=i;
			i++;
		}
		System.out.println(a);
	}
}
