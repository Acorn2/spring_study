package com.msdn.bean;

import java.util.Date;

/**
 * @author hresh
 * @date 2020/1/9 11:03
 * @description
 */
public class Boy {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
