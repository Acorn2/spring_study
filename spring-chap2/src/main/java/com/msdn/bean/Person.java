package com.msdn.bean;

/**
 * @author hresh
 * @date 2019/12/30 9:39
 * @description
 */
public class Person {

    private String name;
//    private AbstractCar car;
    private Car car;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", 拥有一辆car=" + car +
                '}';
    }
}
