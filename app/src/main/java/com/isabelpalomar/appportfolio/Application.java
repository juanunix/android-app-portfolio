package com.isabelpalomar.appportfolio;

public class Application {

    String name;
    int layoutColor;

    public Application(String name, int layoutColor) {
        this.name = name;
        this.layoutColor = layoutColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLayoutColor() {
        return layoutColor;
    }

    public void setLayoutColor(int layoutColor) {
        this.layoutColor = layoutColor;
    }

}
