package com.example.mydemo.unitl.beanunitl;

import com.example.mydemo.bean.Zdactioninfo;
import com.example.mydemo.unitl.MyUuid;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class ZdactioninfoUnitl {
    public static final int percentage [] = {0,1};//百分比：0不是，1是
    public static final int typeaction [] = {0,1,2,3,4};//0开始时累增-1开始-2结束时-3命中
    public static final String typevalue [] = {"hp","mp","gjl","fyl","jueduifyl","jueduigjl"};//作用的属性

    public static Zdactioninfo getHpActionInfo_hp(Integer zdactionid){
        Zdactioninfo zdactioninfo = new Zdactioninfo(zdactionid);
        zdactioninfo.setTypevalue("hp");
        zdactioninfo.setPercentage(MyUuid.getRandomInt(2)-1);
        Map<String,Object> map = null;
        switch (zdactioninfo.getPercentage()){
            case 0:
                System.out.println("----------->进入HP技能属性0<--------");
                map = getOntTwoThreeValue_0();
                break;
            default:
                System.out.println("----------->进入HP技能属性1<--------");
                map = getOntTwoThreeValue_1();
                break;
        }
        zdactioninfo.setOnevalue((Long) map.get("onevalue"));
        zdactioninfo.setTwovalue((Long) map.get("twovalue"));
        zdactioninfo.setThreevalue((Long) map.get("threevalue"));
        zdactioninfo.setTypeaction((Integer) map.get("typeaction"));
        return  zdactioninfo;
    }

    public static Map getOntTwoThreeValue_0(){
        Map<String,Object> map = new HashMap<>();
        long o = 0l;
        long max = 0l;
        map.put("typeaction",MyUuid.getRandomInt(3) - 1);
        int swt = (int) map.get("typeaction");
        switch (swt){
            case 1://开始、结束时
            case 2://开始、结束时
                 o = MyUuid.getRandom(14)+9;
                 max = o + (MyUuid.getRandom(15)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 3://命中敌人时
                 o = MyUuid.getRandom(14)+4;
                 max = o + (MyUuid.getRandom(10)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            default://开始时累加
                 o = MyUuid.getRandom(4)+3;
                 max = o + (MyUuid.getRandom(3)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
        }
        return  map;
    }

    public static Map getOntTwoThreeValue_1(){
        Map<String,Object> map = new HashMap<>();
        long o = 1l;
        long max = 1l;
        map.put("typeaction",MyUuid.getRandomInt(3) - 1);
        int swt = (int) map.get("typeaction");
        switch (swt){
            case 1://开始、结束时
            case 2://开始、结束时
                o = MyUuid.getRandom(50)+24;
                max = o + (MyUuid.getRandom(15)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 3://命中敌人时
                o = MyUuid.getRandom(75)+44;
                max = o + (MyUuid.getRandom(25)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            default://开始时累加
                o = MyUuid.getRandom(34)+3;
                max = o + (MyUuid.getRandom(19)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
        }
        return  map;
    }
}
