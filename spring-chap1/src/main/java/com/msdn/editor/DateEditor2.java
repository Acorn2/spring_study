package com.msdn.editor;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hresh
 * @date 2020/1/10 9:57
 * @description
 */
//@Component("myDateEditor")
public class DateEditor2 extends PropertyEditorSupport {
    private List<SimpleDateFormat> dateList;

    {
        dateList = new ArrayList<>();
        dateList.add(new SimpleDateFormat("yyyy年MM月dd日"));
    }


    public List<SimpleDateFormat> getDateList() {
        return dateList;
    }

    public void setDateList(List<SimpleDateFormat> dateList) {
        this.dateList = dateList;
    }

    @Override
    public String getAsText() {
        return getValue().toString();
    }

    @Override
    public void setAsText(String s) throws IllegalArgumentException {
        for(SimpleDateFormat format:dateList){
            try {
                Date date = format.parse(s);
                setValue(date);
                return;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
