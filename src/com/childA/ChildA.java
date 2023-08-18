package com.childA;


import com.parent.Parent;

// Parent class of ChildA is Parent
public class ChildA extends Parent {
    private int childA = 50;

    public int getValueFromChild(){

        return 1000;
    }
//    public int getPublicParent() {
//        System.out.print("child class");
//
//        return publicParent;
//    }

    public static void main(String[] args) {
        Parent p = new ChildA();
        System.out.println("");

    }
}

