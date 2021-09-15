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
    public static void err(Object o,ReturnData returnData){
        returnData.setCode(-1);
        returnData.setData(o);
    }

    public static ReturnData err(Object o){
        return new ReturnData(-1,o);
    }
}
