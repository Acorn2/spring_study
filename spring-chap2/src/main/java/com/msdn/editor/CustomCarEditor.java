package com.msdn.editor;

import com.msdn.bean.Car;

import java.beans.PropertyEditorSupport;

/**
 * @author hresh
 * @date 2020/1/10 16:16
 * @description
 */
public class CustomCarEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if(text == null || text.indexOf(",") == -1){
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        car.setColor(infos[3]);

        setValue(car);
    }
}
