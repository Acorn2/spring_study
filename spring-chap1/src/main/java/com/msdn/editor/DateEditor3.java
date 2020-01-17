package com.msdn.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hresh
 * @date 2020/1/10 10:32
 * @description
 */
public class DateEditor3 extends PropertyEditorSupport {
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String getAsText() {
        return getValue().toString();
    }

    @Override
    public void setAsText(String s) throws IllegalArgumentException {
        try {
            Date date = new SimpleDateFormat(format).parse(s);
            setValue(date);
            return;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
