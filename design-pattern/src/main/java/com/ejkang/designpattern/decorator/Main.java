package com.ejkang.designpattern.decorator;

public class Main {

    public static void main(String[] args) {
        Component p1 = new Product1();

        Component i7 = new CpuI7(p1);

        Component ssd256 = new Ssd256(i7);

        System.out.println("product : " + ssd256.product());
        System.out.println("price : " + ssd256.price());

        Component p2 = new Product2();
        Component i7_2 = new CpuI7(p2);
        Component ssd256_2 = new Ssd256(i7_2);

        System.out.println("product2 : " + ssd256_2.product());
        System.out.println("price2 : " + ssd256_2.price());

    }
}
