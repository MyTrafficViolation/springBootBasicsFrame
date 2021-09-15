package com.example.mydemo.service;

import com.example.mydemo.dao.DicinfoMapper;
import com.example.mydemo.dao.HerodictionaryMapper;
import com.example.mydemo.unitl.MyUuid;
import com.example.mydemo.unitl.ReturnData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HerodictionaryService {
    @Resource
    HerodictionaryMapper herodictionaryMapper;
    @Resource
    DicinfoMapper dicinfoMapper;

    public ReturnData queryAll() {
        ReturnData returnData = new ReturnData(0);
        try {
            //returnData.setData(herodictionaryMapper.selectAll(0));
            returnData.setData(dicinfoMapper.queryAll());
        }catch (Exception e){
            MyUuid.err(e,returnData);
        }
        finally {
            return returnData;
        }
    }

    public ReturnData queryByMod(String mod) {
        ReturnData returnData = new ReturnData(0);
        try {
            //returnData.setData(herodictionaryMapper.selectByMOd(0,mod));
            returnData.setData(dicinfoMapper.queryByMod(mod));
        }catch (Exception e){
            MyUuid.err(e,returnData);
        }
        finally {
            return returnData;
        }
    }

}
