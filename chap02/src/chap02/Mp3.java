package chap02;

/**
 *  定义变量，并给变量赋值，打印输出
 * 
 * @author 陈想
 * @version 1.0 2019年8月6日
 */
public class Mp3 {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 定义变量
		String brand; // 品牌
		double weight; // 重量
		String type; // 电池类型
		int price; // 价格

		// 给变量赋值
		brand = "爱国者F928";
		weight = 12.4;
		type = "内置锂电池";
		price = 499;

		// 打印输出
		System.out.println("品牌：" + brand);
		System.out.println("重量：" + weight);
		System.out.println("电池类型：" + type);
		System.out.println("价格：" + price);
	}
}
