package com.spring.boot.common;


import lombok.Data;


/**
 * 用户类
 *
 * @author 代码的路
 * @date 2022/6/8
 */
@Data
public class UserDTO {

    private Integer number;
    private String name;

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
