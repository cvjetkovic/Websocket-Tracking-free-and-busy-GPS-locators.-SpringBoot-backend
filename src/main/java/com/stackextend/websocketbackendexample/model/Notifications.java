package com.stackextend.websocketbackendexample.model;

import java.util.Random;

public class Notifications {

    private int count;
    private int count2;
    private int count3;

    public Notifications(int count, int count2, int count3) {
        this.count = count;
        this.count2 = count2;
        this.count3 = count3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    public int getCount3() {
        return count3;
    }

    public void setCount3(int count3) {
        this.count3 = count3;
    }

    public void increment() {
        this.count++;
    }

    public void random(){
        Random random = new Random();
        count = random.nextInt(900) + 100;
        count2 = random.nextInt(90) + 10;
        count3 = random.nextInt(10000);

    }
}
