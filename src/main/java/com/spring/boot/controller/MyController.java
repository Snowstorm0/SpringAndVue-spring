package com.spring.boot.controller;

import com.spring.boot.common.UserDTO;
import com.spring.boot.service.MyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/6/8
 */


@RestController
@RequestMapping("/homepage")
public class MyController {

    @Resource
    MyService myService;

    // 查看全部数据
    @GetMapping("/view")
    public List<UserDTO> userView(){
        return myService.userView();
    }

    // 增
    @PostMapping("/add")
    public int userAdd(@RequestBody UserDTO user){
        myService.userAdd(user);
        return 0;
    }

    // 删
    @DeleteMapping("/delete/{number}")
    public int deleteBook(@PathVariable("number") Integer number){
        return myService.userDelete(number);
    }
    // 改
    @PutMapping("/edit")
    public int userEdit(@RequestBody UserDTO user){
        return myService.userEdit(user);
    }
    // 查
    @GetMapping("/query/{start}/{length}")
    public List<UserDTO> userQuery(@PathVariable("start") Integer start,@PathVariable("length") Integer length){
        System.out.println("users:" + myService.userQuery(start, length) + "\n");
        return myService.userQuery(start, length);
    }



}
