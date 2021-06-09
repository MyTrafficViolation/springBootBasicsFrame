package com.example.mydemo.unitl.beanunitl;

import com.example.mydemo.bean.Juese;
import com.example.mydemo.unitl.MyUuid;

import java.util.HashMap;
import java.util.Map;

public class JuesejinengUnitl {
    public static final Integer upExp = 100;//升级所需经验
    public static final Integer expvalue = 10;//每次使用最少获得经验值
    public static final Integer expbs = 10;//随机增加经验值

    public static Integer getExp(){
        return MyUuid.getRandomInt(expbs)+expvalue;
    }
    public static Integer getExp(Integer exp){
        return MyUuid.getRandomInt(expbs)+expvalue + exp;
    }

    public static Integer up(Integer exp,Integer level){
        return  (exp%upExp)>=0?(exp%upExp):0;
    }

    public static Map<String, Juese> battle(Map map){

        return map;
    }

}
