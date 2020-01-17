package com.msdn.bean;

import java.util.Map;

/**
 * @author hresh
 * @date 2020/1/7 10:56
 * @description
 */
public class Man {
    private String name;
    private int age;
    private Car car;
    private String[] hobbies;
    private Map<String,Object> relatives;
    private Integer[][] nums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, Object> getRelatives() {
        return relatives;
    }

    public void setRelatives(Map<String, Object> relatives) {
        this.relatives = relatives;
    }

    public Integer[][] getNums() {
        return nums;
    }

    public void setNums(Integer[][] nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
