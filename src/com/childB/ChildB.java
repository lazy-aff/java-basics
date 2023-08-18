package com.childB;


import com.parent.Parent;

// Parent class of ChildA is Parent
public class ChildB extends Parent {
    private int childB = 100;
    private int privateParent = 1000;
     int defaultParent = 20000;
    protected int protectedParent = 3000;
    private int getPrivateParent() {
        return privateParent;
    }
    public int getPublicParent() {
        return publicParent;
    }

    int getDefaultParent() {
        return defaultParent;
    }
    protected int getProtectedParent() {
        return protectedParent;
    }

    public static void main(String[] args) {
        ChildB childB = new ChildB();
        System.out.println(childB.childB); //100
        System.out.println(childB.privateParent); //1000
        System.out.println(childB.publicParent); // 50
        System.out.println(childB.getProtectedParent()); // 3000
        System.out.println(childB.getPrivateParent()); // 1000
        System.out.println(childB.getDefaultParent()); //2000
    }
}
