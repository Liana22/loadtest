package com.loadtest.LoadTest.controller;

public class LoadThread extends Thread{
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            assert true;
        }
    }
}
