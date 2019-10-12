package com.howard.mylibrary;

public class MyLib {
    static {
        System.loadLibrary("test");
    }

    public MyLib() {

    }

    public void test() {
        nativeTest();
    }

    private native void nativeTest();
}
