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
    @Resource
    JinengactionMapper jinengactionMapper;


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
                System.out.println("--------->开始准备人物技能中间件");
                Jinengaction jinengaction = new Jinengaction(juesejineng.getJnid(), zdaction.getId());
                jinengactionMapper.insertSelective(jinengaction);
                System.out.println("--------->人物技能状态中间件准备完成");
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
            returnData.setData(jueseMapper.selectAll());
        }catch (Exception e){
            returnData.setCode(-1);
            returnData.setData(e.getMessage());
        }finally {
            return  returnData;
        }
    }
    //queryEncounterForinfo
    //05e6ba5c-8137-48da-a3d8-570d632a9eca
    //28e0d226-d32d-4297-a615-ba33f2885698
    //3cab9360-d561-4dd6-a38c-d2ae72b2e04d
    //3fa5cf6a-66b5-4fdf-abcc-e25de254d65d
    public ReturnData queryEncounterForinfo(){
        ReturnData returnData = new ReturnData();
        String [] jsids = {"03034a63-e8d6-49a4-8e71-58a544b8fca3",
                "1ae3709f-d8c2-4db8-9f38-1a60fb0d2e61",
                "7340479a-28fc-44b6-bf18-374f037d5f03",
                "e1e5f378-b16f-441e-b673-0f0d2544d108"};
        try {
            returnData.setData(jueseMapper.selectByPrimaryKey(jsids[MyUuid.getRandomInt(jsids.length)-1]));
        }catch (Exception e){
            returnData.setCode(-1);
            returnData.setData(e.getMessage());
        }finally {
            return  returnData;
        }
    }
}
