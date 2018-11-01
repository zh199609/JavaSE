package com.zl.val;

import java.lang.reflect.Field;
import java.util.Objects;

public class VerifyAnnotationMyLimit {

    private MyVal myVal;
    private Class obj;
    private StringBuilder builder = new StringBuilder();
    
    
    private void verify(Field field,Object object) throws Exception {
        if (!field.isAnnotationPresent(MyVal.class)) {
            System.err.println("return");
            return;
        }
        myVal = field.getAnnotation(MyVal.class);
        //取出object对象中的field
        Object objectVal = field.get(object);
        if (objectVal.toString().length()>myVal.MaxNum()) {
            builder.append(myVal.description()+"不能不能超过"+myVal.MaxNum());
        }
    }
    
    public VerifyAnnotationMyLimit(Object object) throws Exception {
        obj = object.getClass();
        Field[] fields = obj.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            verify(field, object);
            field.setAccessible(false);
        }
    }

    public StringBuilder getBuilder() {
        return builder;
    }
}
