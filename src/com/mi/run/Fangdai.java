package com.mi.run;

import java.util.Scanner;

public class Fangdai {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("***********����������*************");
		System.out.println("1. ����->I");
		System.out.println("2. ����->H");
		System.out.println("3. �˳�->C");
		System.out.println("*******************************");
		// �˵���ʾ
		double lilv;
		double benjin;
		int nian;
		int yuehuankuan;
		double yuehuanbenjin = 0;
		int zonge1;
		int sum = 0;
		double chae;
		boolean flag = true;
		System.out.println("����ݲ˵�ѡ�����:");
		while (flag) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			char ch = str.charAt(0);
			switch (ch) {
			// ʹ��switch��䣬���ò˵�ѡ����������
			case 'i':
			case 'I':
				Scanner reader = new Scanner(System.in);
				System.out.println("�����������ʣ�");
				lilv = reader.nextInt();
				System.out.println("����������ܶ");
				benjin = reader.nextDouble();
				System.out.println("�����뻹�����ޣ�");
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
				System.out.println("\n �ȶϢ�����������ܶ�" + zonge1 + "Ԫ        �»����Ϊ"
						+ yuehuankuan + "Ԫ\n");
				System.out.println("�ȶϢ�������ȵȶ�𻹴����໹��" + chae
						+ "\n\n��i/l��������  ��c/C�˳�����");
				break;
			case 'h':
			case 'H':
				System.out.println("Clam down");
				System.out.println("����ݲ˵���ʾһ�������в���");
				Scanner reader1 = new Scanner(System.in);
				System.out.println("������������");
				lilv = reader1.nextInt();
				System.out.println("�����뻹���ܶ");
				benjin = reader1.nextDouble();
				System.out.println("�����뻹�����ޣ�");
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
				System.out.println("\n�ȶϢ��������ܶ�" + zonge1
						+ "Ԫ             �»����Ϊ" + yuehuankuan + "Ԫ\n");
				System.out.println("�ȶ�𻹿�����ܶ�Ϊ" + sum + "Ԫ \n");
				System.out.println("�ȶϢ����ȵȶ�𻹿�໹��" + chae
						+ "\n\n��i/I��������  ��c/C�˳�����");
				break;
			case 'c':
			case 'C':
				System.out.println("�����˳�ϵͳ����л����ʹ�ã�");
				flag = false;
				sc.close();
				break;
			}

		}
	}
}