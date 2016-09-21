package org.smart4j.chapter2.controller;

import javax.jws.WebService;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/30.
 * Description:
 */

@WebService
public interface HelloService {
    String say(String name);
}
