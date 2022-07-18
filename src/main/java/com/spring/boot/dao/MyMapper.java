package com.spring.boot.dao;

import com.spring.boot.common.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * dao层接口类
 *
 * @author 代码的路
 * @date 2022/6/10
 */

@Mapper
public interface MyMapper {

    List<UserDTO> userView();
    Integer userAdd(UserDTO user);
    Integer userDelete(int number);
    Integer userEdit(UserDTO user);
    List<UserDTO> userQuery(int start, int length);
}
