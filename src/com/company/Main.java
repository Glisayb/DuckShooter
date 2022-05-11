package com.company;

import view.Window;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit((Runnable) new Window());


    }
}
