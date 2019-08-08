package chap02;

import java.util.*;

/**
 * 注册、登陆、抽奖
 * 
 * @author 陈想
 * @version 1.0 2019年8月6日
 */
public class Test {
	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 调用Scanner类
		Random random = new Random();// 随机数

		// 注册
		String username = null;// 用户名
		int password;// 密码

		// 登陆
		String username2;// 用户名
		int password2;// 密码

		// 输入选择
		int nb;// 编号
		boolean a;// 返回值

		int pn, i;// 随机生成的中奖号码/输入的号码
		
		String username3;//注册输入的用户名
		boolean b;

		do {
			// 菜单
			System.out.println("* * * * * * * * * * * *欢迎来到幸运大抽奖！* * * * * * * * * * * *");
			System.out.println("--（请登陆后进行抽奖！）");
			System.out.println("1.登陆\n2.注册");
			
			//判断
			do {
				// 选择输入
				System.out.print("请输入编号（1-3）：");
				nb = input.nextInt();
				if(nb>3) {
					System.out.println("输入错误，请重新输入！");
				}else {
					break;
				}
				
			}while(b=true);
			
			switch (nb) {
			case 1:// 登陆
				System.out.print("请输入用户名：");
				username2 = input.next();
				System.out.print("请输入密码：");
				password2 = input.nextInt();
				if (username2.equals(username)) {// 判断是否注册
					String y = "y";

					System.out.println("登陆成功！");
					System.out.println("请输入y/n进行抽奖！");
					String yn = input.next();
					if (yn.equals(y)) {// 输入y进行抽奖，输入n退出抽奖！
						// 随机生成一个中奖号码
						pn = random.nextInt(9);
//						System.out.println(pn);
						System.out.print("请输入一个1-9之间的数：");
						i = input.nextInt();
						if (i == pn) {// 判断是否中奖
							System.out.println("恭喜你，中奖了！");
							return;
						}
						System.out.println("很遗憾！奖品和你擦身而过~");
						return;
					}
					System.out.println("退出抽奖！");
					break;
				}
				System.out.println("登陆失败,请先注册！");
				break;

			case 2:// 注册
				System.out.print("请输入用户名：");
				username3 = input.next();
				System.out.print("请输入密码：");
				password = input.nextInt();
				if(username3.equals(username)==true) {//判断是否注册
					System.out.println("您已注册过此账号！");
				}else {
					System.out.println("注册成功！");
					username=username3;
				}
			}
		} while (a = true);
	}
}
