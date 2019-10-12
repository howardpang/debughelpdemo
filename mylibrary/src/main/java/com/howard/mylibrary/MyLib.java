package com.howard.mylibrary;

public class MyLib {
    static {
        System.loadLibrary("mylib");
    }

    public MyLib() {

    }

    public String getText() {
        return getNativeString() + "+ Hello from Java";
    }

    private native String getNativeString();
}
