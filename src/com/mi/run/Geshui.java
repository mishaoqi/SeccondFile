package com.mi.run;

import java.util.Scanner;

public class Geshui {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("输入工资");
		
		double salary = sc.nextDouble();
		System.out.println("请输入五险一金");
		double insurance = sc.nextDouble();
		double base = salary - insurance - 3500;
		double tax = 0;
		if(base <= 0){
			tax = 0;
		}else if(base <= 1500){
			tax = base*0.03;
		}else if(base<= 4500){
			tax = base * 0.1 - 105;
		}else if(base<= 9000){
			tax = base * 0.2 - 555;
		}else if(base<= 35000){
			tax = base * 0.3 - 2755;
		}else if(base<= 80000){
			tax = base * 0.35 - 5505;
		}else {
			tax = base * 0.45-13505;
		}
		System.out.println("应缴纳个税："+tax);
		sc.close();
	}
}