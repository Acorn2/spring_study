package com.msdn.bean;

/**
 * @author hresh
 * @date 2019/12/29 20:21
 * @description
 */
public class AbstractCar {

    private String brand ;
    private Money money;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AbstractCar{" +
                "brand='" + brand + '\'' +
                ", money=" + money +
                '}';
    }
}
