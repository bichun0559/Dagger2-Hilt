package com.bccc.dagger2demo.object;

/**
 * 同一个对象有不同创建方式的情况
 * 例如EObject有一个无参构造和含name参数构造
 * {@link com.bccc.dagger2demo.module.EObjectModule}提供两种创建方式provideEObject()和provideEObjectWithName()
 */
public class EObject {

    private String mName = "";

    public EObject(String name) {
        this.mName = name;
    }

    public EObject() {

    }

    public String getName() {
        return mName;
    }
}
