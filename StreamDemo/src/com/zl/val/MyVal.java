package com.zl.val;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyVal {
    
 // 字段描述
   String description() default "";
   int MaxNum() default 30;
   int MinNum() default 18;
}
