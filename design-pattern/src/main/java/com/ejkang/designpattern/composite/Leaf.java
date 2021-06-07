package com.ejkang.designpattern.composite;

public class Leaf extends Component {

    Leaf(String name) {
        this.setName(name);
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
