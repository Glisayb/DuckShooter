package com.company;

import models.Difficulties;
import models.gnats.Gnat;
import models.gnats.GnatFactory;
import models.gnats.GnatTypes;
import view.Lives;
import view.Points;
import view.Window;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static ArrayList<Gnat> gnats = new ArrayList<>();
    public static Lives lives = new Lives(5);
    public static Points points = new Points();


    public static void main(String[] args) {

        GnatFactory mamry = new GnatFactory();

        ExecutorService service = Executors.newFixedThreadPool(10);

        service.submit(() -> {
            while (gnats.isEmpty()) {
                for (int i = 0; i < 5; i++)
                    gnats.add(mamry.createGnat(GnatTypes.Buzzing, Difficulties.NUTS));
            }
        });
//        service.submit(() -> {
//            while (!gnats.isEmpty()) {
//                var rand = new Random();
//                gnats.get(rand.nextInt(gnats.size()-1)).setActive();
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });

        service.submit(new Window());

    }
}
