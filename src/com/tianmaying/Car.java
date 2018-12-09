package com.tianmaying;

public class Car {
    
    int color;
    int speed;
    
    public Car() {
    }

    public Car(int color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void startup() {
        System.out.println("启动！");
    }
    
    //加速
    int speedUp(int speed) {
    	this.speed += speed;
        return 0;
    }

}