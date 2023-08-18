package com.demo;

public class MethodOverloading {

    public float getValue(float b){
        return b;
    }

    private long getValue(int c){
        return c;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        long d = 10;
        System.out.println(o.getValue(d));
    }
}
