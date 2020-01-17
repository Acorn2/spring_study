package com.msdn.editor;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * @author hresh
 * @date 2020/1/9 10:59
 * @description
 */
public class DateEditor extends PropertyEditorSupport {
    private DateFormat dateFormat;

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public void setAsText(String s) throws IllegalArgumentException {
        try {
            Object value = dateFormat.parse(s);
            setValue(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getAsText() {
        if (getValue() instanceof Date){
            Date date = (Date) getValue();
            return dateFormat.format(date);
        }
        return super.getAsText();
    }
}
