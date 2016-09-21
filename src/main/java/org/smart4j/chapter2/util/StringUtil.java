package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:字符串操作类
 */
public final class StringUtil {

    public static boolean isEmpty(String str){
        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }


    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

}
