package com.spring.boot.service;

import com.spring.boot.common.UserDTO;

import java.util.List;

/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

public interface MyService {
    public List<UserDTO> userView();
    public Integer userAdd(UserDTO user);
    public Integer userDelete(int number);
    public Integer userEdit(UserDTO user);
    public List<UserDTO> userQuery(int start, int length);
}
