package com.ejkang.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    Composite(String name) {
        this.setName(name);
    }

    public List<Component> children = new ArrayList<>();

    public void addNode(Component component) {
        this.children.add(component);
    }

    public void removeNode(Component component) {
        this.children.remove(component);
    }

    public boolean isNode() {
        if (this.children.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
