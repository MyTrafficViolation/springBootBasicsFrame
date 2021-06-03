package com.example.mydemo.service;

import com.example.mydemo.bean.*;
import com.example.mydemo.dao.*;
import com.example.mydemo.unitl.MyUuid;
import com.example.mydemo.unitl.ReturnData;
import com.example.mydemo.unitl.beanunitl.ZdactioninfoUnitl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

@Service
public class JueSeService {
    @Resource
    JueseMapper jueseMapper;
    @Resource
    JinengMapper jinengMapper;
    @Resource
    JuesejinengMapper juesejinengMapper;
    @Resource
    ZdactionMapper zdactionMapper;
    @Resource
    ZdactioninfoMapper zdactioninfoMapper;


    public ReturnData insertJuese(){
        ReturnData returnData = new ReturnData();
        Random random = new Random();
        try {
            //Juese juese = new Juese( "独孤求败崽子",  0, (long)(random.nextInt(128)+1),  (long)(random.nextInt(64)+1),  (long)(random.nextInt(35)+1),  (long)(random.nextInt(5)+1),  (long)(random.nextInt(35)+1),  (long)(random.nextInt(5)+1),  1,  1);
            Juese juese = new Juese("独孤求败爪子");
            System.out.println("--------->角色生成开始");
            System.out.println("--------->"+jueseMapper.insertSelective(juese));
            System.out.println("--------->角色生成结束");
            System.out.println("--------->角色ID："+juese.getJueseid());

            System.out.println("--------->技能生成开始");
            Jineng jineng = new Jineng("爆裂爪");
            jinengMapper.insertSelective(jineng);
            System.out.println("--------->技能生成结束");
            System.out.println("--------->技能ID："+jineng.getId());
            Juesejineng juesejineng = new Juesejineng(juese.getJueseid(),jineng.getId());
            System.out.println("--------->角色技能转换开始");
            BeanUtils.copyProperties(jineng,juesejineng);
            System.out.println("--------->角色技能转换结束");
            System.out.println("--------->角色技能name："+juesejineng.getName());
            System.out.println("--------->角色技能HP："+juesejineng.getHp());
            juesejinengMapper.insertSelective(juesejineng);
            int acs = MyUuid.getRandomInt(4);
            System.out.println("--------->状态数总共："+acs);
            for (int y=0;y<acs;y++) {
                System.out.println("--------->开始准备技能状态");
                Zdaction zdaction = new Zdaction("战斗状态");
                zdactionMapper.insertSelective(zdaction);
                System.out.println("--------->准备技能状态完成");
                int pis = MyUuid.getRandomInt(5);
                System.out.println("--------->状态属性数总共：" + pis);
                for (int i = 0; i < pis; i++) {
                    System.out.println("--------->开始准备技能状态属性");
                    Zdactioninfo zdactioninfo = ZdactioninfoUnitl.getHpActionInfo_hp(zdaction.getId());
                    System.out.println("--------->技能状态属性准备完成");
                    System.out.println("--------->开始写入状态");
                    zdactioninfoMapper.insertSelective(zdactioninfo);
                    System.out.println("--------->写入状态完成");
                }
            }

            returnData.setData("操作成功！");
        }catch (Exception e){
            returnData.setCode(-1);
            System.out.println(e.getMessage());
            returnData.setData(e.getMessage());
        }finally {
            return  returnData;
        }
    }
    public ReturnData queryAll(){
        ReturnData returnData = new ReturnData();
        try {
            returnData.setData(jueseMapper.selectByPrimaryKey(null));
        }catch (Exception e){
            returnData.setCode(-1);
            returnData.setData("操作失败!");
        }finally {
            return  returnData;
        }
    }
}
