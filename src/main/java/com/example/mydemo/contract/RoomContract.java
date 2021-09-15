package com.example.mydemo.contract;

import com.example.mydemo.unitl.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/room")
public class RoomContract {
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public ReturnData queryAll(HttpServletRequest request){
        return null;
    }
}
