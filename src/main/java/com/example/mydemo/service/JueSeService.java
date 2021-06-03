package com.example.mydemo.service;

import com.example.mydemo.bean.Jineng;
import com.example.mydemo.bean.Juese;
import com.example.mydemo.bean.Juesejineng;
import com.example.mydemo.dao.JinengMapper;
import com.example.mydemo.dao.JueseMapper;
import com.example.mydemo.dao.JuesejinengMapper;
import com.example.mydemo.unitl.ReturnData;
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
            Juesejineng juesejineng = new Juesejineng(juese.getJueseid());
            System.out.println("--------->角色技能转换开始");
            BeanUtils.copyProperties(jineng,juesejineng);
            System.out.println("--------->角色技能转换结束");
            System.out.println("--------->角色技能name："+juesejineng.getName());
            System.out.println("--------->角色技能HP："+juesejineng.getHp());
            juesejinengMapper.insertSelective(juesejineng);
            returnData.setData("操作成功！");
        }catch (Exception e){
            returnData.setCode(-1);
            returnData.setData("操作失败!");
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
