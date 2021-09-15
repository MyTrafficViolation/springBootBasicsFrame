package com.example.mydemo.service;

import com.example.mydemo.dao.RoomMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Roomservice {
@Resource
    RoomMapper roomMapper;
}
