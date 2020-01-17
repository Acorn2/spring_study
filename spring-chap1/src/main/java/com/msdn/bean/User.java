package com.msdn.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author hresh
 * @date 2019/12/17 16:39
 * @description
 */
public class User {
    private String name;
    private String desc;

    public User() {
        System.out.println("user无参构造方法");
    }

    public User(String name) {
        this.name = name;
        System.out.println("user有参构造方法");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
