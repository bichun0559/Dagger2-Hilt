package com.bccc.dagger2demo.object;

import javax.inject.Inject;

/**
 * 被注入的对象类
 */
public class BObject {

    //使用@Inject注解在构造方法上，告知Dagger2可以通过构造方法来创建并获取到被注入的对象实例
    @Inject
    public BObject() {

    }
}
