package com.ejkang.designpattern.composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Composite root = new Composite("root");

        Composite home = new Composite("home");
        Composite users = new Composite("users");
        Composite temp = new Composite("temp");

        Component img1 = new Leaf("img1");
        Component img2 = new Leaf("img2");
        // Component img3 = new Leaf("img3");
        // Component img4 = new Leaf("img4");

        root.addNode(home);
        root.addNode(users);
        users.addNode(temp);
        temp.addNode(img1);
        temp.addNode(img2);

        Main mm = new Main();
        mm.tree(root, "");

    }

    public void tree(Composite composite, String depth) {

        List<Component> list = composite.children;

        for (Component com : list) {

            if (com instanceof Composite) {
                System.out.println("Folder:" + depth + com.getName());
                Composite temp = (Composite) com;
                if (temp.isNode()) {
                    tree(temp, depth + "  ");
                } else {
                    System.out.println(depth + "No Children");
                }

            } else if (com instanceof Leaf) {
                System.out.println("Leaf:" + depth + com.getName());
            } else {
                System.out.println("??");
            }
        }
    }
}
