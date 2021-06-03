package com.example.mydemo.unitl;

import java.util.Random;
import java.util.UUID;

public class MyUuid {
    public static String getUuid(){
        String uuids = new String(UUID.randomUUID().toString());
        return uuids;
    }
    /*
    * 传入最大值
    * 至少>1
    * */
    public static long getRandom(int max){
        Random random =new Random();
        return (long)random.nextInt(max)+1;
    }
    public static int getRandomInt(int max){
        Random random =new Random();
        return random.nextInt(max)+1;
    }
    public static void  main(String a[]){
        for (int i=1;i<=100;i++) {
            System.out.println("------->第"+i+"次结果："+ (MyUuid.getRandomInt(2)-1));
        }
    }
}
