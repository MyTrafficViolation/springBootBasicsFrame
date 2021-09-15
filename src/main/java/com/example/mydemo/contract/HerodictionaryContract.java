package com.example.mydemo.contract;

import com.example.mydemo.service.HerodictionaryService;
import com.example.mydemo.unitl.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/dic")
public class HerodictionaryContract {

    @Resource
    HerodictionaryService herodictionaryService;

    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public ReturnData queryAll(HttpServletRequest request){
        return herodictionaryService.queryAll();
    }
    @RequestMapping(value = "/queryByMod",method = RequestMethod.GET)
    public ReturnData queryByMod(HttpServletRequest request,String mod){
        return herodictionaryService.queryByMod(mod);
    }
}
