package com.tianmaying;
import java.util.Scanner;

public class VariableTest {
	public static void main(String[] args) {
		int a = 1, b, c = 2;
		double pi = 3.1415926;
		char x = 'x';
//		printInfo();
		scan();
	}

	public static void printInfo() {
		System.out.println("int类型的二进制位数：" + Integer.SIZE);
		System.out.println("int类型的最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("int类型的最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);

		// 基本类与包装类互转
		Integer in = new Integer(100); // 将int转换为包装类
		int m = in.intValue(); // 获取Integer的int值
		String s = "123";
		int n = Integer.parseInt(s); // 将字符串转换为整数
		String s2 = Integer.toString(n); // 将整数转换为字符串

		/**
		 * 分别定义7种数据类型的一个变量，给他们赋初值，并进行依次打印
		 */
		byte myByte = -50;
		short myShort = 500;
		int myInt = 1000;
		long myLong = 20000L;
		float myFloat = 0.2f;
		double myDouble = 0.1;
		char myChar = 'a';

		System.out.println(myByte + "(byte)所占的bit位数为" + Byte.SIZE);
		System.out.println(myShort + "(short)所占的bit位数为" + Short.SIZE);
		System.out.println(myInt + "(int)所占的bit位数为" + Integer.SIZE);
		System.out.println(myLong + "(long)所占的bit位数为" + Long.SIZE);
		System.out.println(myFloat + "(float)所占的bit位数为" + Float.SIZE);
		System.out.println(myDouble + "(double)所占的位bit数为" + Double.SIZE);
		System.out.println(myChar + "(char)所占的bit位数为" + Character.SIZE);

		char[] domain = { 'w', 'w', 'w', '.', 't', 'i', 'a', 'n', 'm', 'a', 'y', 'i', 'n', 'g', '.', 'c', 'o', 'm' };
		System.out.println(domain[0]);
		System.out.println(domain[1]);
		System.out.println(domain[2]);
		System.out.println(domain[3]);
		System.out.println(domain[4]);
		System.out.println(domain[5]);
		System.out.println(domain[6]);
		System.out.println(domain[7]);
		System.out.println(domain[8]);
		System.out.println(domain[9]);
		System.out.println(domain[10]);
		System.out.println(domain[11]);
		System.out.println(domain[12]);
		System.out.println(domain[13]);
		System.out.println(domain[14]);
		System.out.println(domain[15]);
		System.out.println(domain[16]);
		System.out.println(domain[17]);

	}
	
	public static void scan() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		double c = scan.nextDouble();
		String d = scan.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		scan.close();
	}
}
