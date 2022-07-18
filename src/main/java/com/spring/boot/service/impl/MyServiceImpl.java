package com.spring.boot.service.impl;

import com.spring.boot.dao.MyMapper;
import com.spring.boot.common.UserDTO;
import com.spring.boot.service.MyService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;


/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

@Service
@EnableScheduling
public class MyServiceImpl implements MyService {

    @Resource
    MyMapper myMapper;

    // 返回全部用户类
    public List<UserDTO> userView(){
        System.out.println("users:" + myMapper.userView() + "\n");
        return myMapper.userView();
    }

    public Integer userAdd(UserDTO user){
        System.out.println("users:" + user + "\n");
        return myMapper.userAdd(user);
    }

    public Integer userDelete(int number){
        System.out.println("number:" + number + "\n");
        return myMapper.userDelete(number);
    }

    public Integer userEdit(UserDTO user){
        System.out.println("user:" + user + "\n");
        return myMapper.userEdit(user);
    }

    public List<UserDTO> userQuery(int start, int length){
        System.out.println("start:" + start + "length:" + length + "\n");
        return myMapper.userQuery(start, length);
    }


}
