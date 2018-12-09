package com.tianmaying;

import java.util.Scanner;

public class BlogApp {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			String command = scanner.next();
//			System.out.println(command);
//			if (command.equals("exit")) break;
//		}
//		scanner.close();
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            // your code here
            // 请按照作业描述完成相关逻辑
            if ( 2<=n && n<=5) {
                ans = "Not Weird";
            } else if (6<=n && n<=20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
        sc.close();
		
		
		int max = 23;
		int[] fib = new int[max];
		for (int i = 0; i < max; i++) {
			if (i == 0 || i == 1) {
				fib[i] = i;
			} else {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		System.out.println(fib[max-1]);

//		Scanner scanner = new Scanner(System.in);
//		boolean exit = false;
//		while (!exit) {
//			String command = scanner.nextLine();
//			System.out.println(command);
//			// your code here: 用switch语句重写作业描述中的代码
//			switch (command) {
//			case "exit":
//				System.out.println("系统退出");
//				exit = true;
//				break;
//			case "create":
//				// 处理创建博客的逻辑
//				System.out.println("创建博客");
//				break;
//			case "list":
//				// 处理显示博客列表的逻辑
//				System.out.println("展示博客列表");
//				break;
//			case "show":
//				// 处理显示博客内容的逻辑
//				System.out.println("展示博客内容");
//				break;
//			case "delete":
//				// 处理删除博客的逻辑
//				System.out.println("删除博客");
//				break;
//			default:
//				System.out.println("无效指令");
//				continue;
//			}
//		}
//		scanner.close();
	}
}
