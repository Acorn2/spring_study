package com.msdn.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hresh
 * @date 2020/1/9 13:15
 * @description
 */
public class DateFormatEditor implements PropertyEditorRegistrar {
    private String dateFormat;

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        DateEditor dateEditor = new DateEditor();
        dateEditor.setDateFormat(new SimpleDateFormat(dateFormat));
        propertyEditorRegistry.registerCustomEditor(Date.class,dateEditor);

    }

}
