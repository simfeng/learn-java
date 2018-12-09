package com.tianmaying;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		int initSpeed = sc.nextInt();
		int upSpeed = sc.nextInt();
		// your code here, 将车的速度设置为initSpeed
		car.speed = initSpeed;

		System.out.println(car.speed);

		// your code here,请完成car.speedUp方法，并调用它，使车加速upSpeed
		car.speedUp(upSpeed);
		System.out.println(car.speed);
	}

}
