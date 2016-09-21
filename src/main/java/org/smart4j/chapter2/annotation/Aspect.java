package org.smart4j.chapter2.annotation;

import java.lang.annotation.*;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/30.
 * Description:注解demon
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
