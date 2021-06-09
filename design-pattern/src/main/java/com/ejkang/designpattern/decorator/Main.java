package com.ejkang.designpattern.decorator;

public class Main {

    public static void main(String[] args) {
        Component p1 = new Product1();

        Component i7 = new CpuI7(p1);

        Component ssd256 = new Ssd256(i7);

        System.out.println("product : " + ssd256.product());
        System.out.println("price : " + ssd256.price());
    }
}
