package com.kuang.demo03;

import com.kuang.demo01.Rent;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
