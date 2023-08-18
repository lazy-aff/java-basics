package com.parent;

public class Parent {
    private int privateParent = 10;
    int defaultParent = 20;
    protected int protectedParent = 30;
    public int publicParent = 40;

    private int getPrivateParent() {
        return privateParent;
    }

    int getDefaultParent() {
        return defaultParent;
    }

    protected int getProtectedParent() {
        return protectedParent;
    }

    public int getPublicParent() {
        System.out.print("parent class");
        return publicParent;
    }
}
