package com.example.xxf.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DBSource {
    /**
     * 默认数据源
     * @return
     */

    String source() default "xxfcar";
}