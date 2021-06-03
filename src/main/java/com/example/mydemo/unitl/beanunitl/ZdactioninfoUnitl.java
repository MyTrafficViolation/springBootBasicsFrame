package com.example.mydemo.unitl.beanunitl;

import com.example.mydemo.bean.Zdactioninfo;
import com.example.mydemo.unitl.MyUuid;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class ZdactioninfoUnitl {
    public static final int zdtype [] = {0,1};//类型：0-自己，-1敌人
    public static final int percentage [] = {0,1};//百分比：0不是，1是
    public static final int typeaction [] = {0,1,2,3,4,5};//0开始时累增-1自身效果-2开始-3结束时-4命中-5被命中
    public static final String typevalue [] = {"hp","mp","gjl","fyl","jueduifyl","jueduigjl"};//作用的属性

    public static Zdactioninfo getHpActionInfo_hp(Integer zdactionid ){
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
        map.put("typeaction",MyUuid.getRandomInt(5));
        int swt = (int) map.get("typeaction");
        switch (swt){
            case 1://无敌状态
                map.put("onevalue",o);
                map.put("twovalue",o);
                map.put("threevalue",o);
                break;
            case 2|3://开始、结束时
                 o = MyUuid.getRandom(14)+9;
                 max = o + (MyUuid.getRandom(15)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 4://命中敌人时
                 o = MyUuid.getRandom(14)+4;
                 max = o + (MyUuid.getRandom(10)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 5://被敌人命中
                 o = MyUuid.getRandom(15)+12;
                 max = o + (MyUuid.getRandom(15)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            default://
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
        long o = 0l;
        long max = 0l;
        map.put("typeaction",MyUuid.getRandomInt(5));
        int swt = (int) map.get("typeaction");
        switch (swt){
            case 1://去除状态1~3个
                o = MyUuid.getRandom(1);
                max = o + (MyUuid.getRandom(3)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 2|3://开始、结束时
                o = MyUuid.getRandom(9)+9;
                max = o + (MyUuid.getRandom(10)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            case 4|5://命中敌人时 | 被敌人命中
                o = MyUuid.getRandom(14)+4;
                max = o + (MyUuid.getRandom(10)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
            default://
                o = MyUuid.getRandom(4)+3;
                max = o + (MyUuid.getRandom(3)-1);
                map.put("onevalue",o);
                map.put("twovalue",max);
                map.put("threevalue",max);
                break;
        }
        return  map;
    }
}
