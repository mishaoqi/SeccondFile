package com.mi.run;

import java.util.Scanner;

public class Fangdai {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("***********房贷计算器*************");
		System.out.println("1. 进入->I");
		System.out.println("2. 帮助->H");
		System.out.println("3. 退出->C");
		System.out.println("*******************************");
		// 菜单提示
		double lilv;
		double benjin;
		int nian;
		int yuehuankuan;
		double yuehuanbenjin = 0;
		int zonge1;
		int sum = 0;
		double chae;
		boolean flag = true;
		System.out.println("请根据菜单选择操作:");
		while (flag) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			char ch = str.charAt(0);
			switch (ch) {
			// 使用switch语句，利用菜单选择输入内容
			case 'i':
			case 'I':
				Scanner reader = new Scanner(System.in);
				System.out.println("请输入年利率：");
				lilv = reader.nextInt();
				System.out.println("请输入贷款总额：");
				benjin = reader.nextDouble();
				System.out.println("请输入还款年限：");
				nian = (int) reader.nextDouble();
				zonge1 = (int) (lilv * nian * 0.01 * benjin + benjin);
				yuehuankuan = zonge1 / nian / 12;
				for (int i = 0; i < nian * 12; i++) {

					yuehuankuan = (int) (yuehuanbenjin - lilv / nian / 12
							* (nian * 12 - i) * yuehuanbenjin * 0.01);
					if (i > nian * 12)
						break;
					sum = (sum + yuehuankuan);

				}
				chae = zonge1 - sum;
				System.out.println("\n 等额本息还贷法还款总额" + zonge1 + "元        月还款额为"
						+ yuehuankuan + "元\n");
				System.out.println("等额本息还贷法比等额本金还带发多还款" + chae
						+ "\n\n按i/l继续计算  按c/C退出程序");
				break;
			case 'h':
			case 'H':
				System.out.println("Clam down");
				System.out.println("请根据菜单提示一步步进行操作");
				Scanner reader1 = new Scanner(System.in);
				System.out.println("请输入年利率");
				lilv = reader1.nextInt();
				System.out.println("请输入还贷总额：");
				benjin = reader1.nextDouble();
				System.out.println("请输入还款年限：");
				nian = (int) reader1.nextDouble();
				zonge1 = (int) (lilv * nian * 0.01 * benjin + benjin);
				yuehuankuan = zonge1 / nian / 12;
				for (int i = 1; i <= nian * 12; i++) {
					yuehuanbenjin = benjin / nian / 12;
					yuehuankuan = (int) (yuehuanbenjin + lilv / nian / 12
							* (nian * 12 - i) * yuehuanbenjin * 0.01);
					if (i > nian * 12)
						break;
					sum = sum + yuehuankuan;

				}
				chae = zonge1 - sum;
				System.out.println("\n等额本息还款法还款总额" + zonge1
						+ "元             月还款额为" + yuehuankuan + "元\n");
				System.out.println("等额本金还款法还款总额为" + sum + "元 \n");
				System.out.println("等额本息还款法比等额本金还款法多还款" + chae
						+ "\n\n按i/I继续计算  按c/C退出程序");
				break;
			case 'c':
			case 'C':
				System.out.println("正在退出系统，感谢您的使用！");
				flag = false;
				sc.close();
				break;
			}

		}
	}
}