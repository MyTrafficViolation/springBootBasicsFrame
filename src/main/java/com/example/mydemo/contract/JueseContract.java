package com.example.mydemo.contract;

import com.example.mydemo.service.JueSeService;
import com.example.mydemo.unitl.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/juese")
public class JueseContract {
    @Resource
    private   JueSeService jueSeService;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ReturnData add(HttpServletRequest request){
        return  jueSeService.insertJuese();
    }
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public ReturnData queryAll(HttpServletRequest request){
        return  jueSeService.queryAll();
    }
}
