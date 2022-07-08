package com.bccc.dagger2demo.module;

import com.bccc.dagger2demo.object.EObject;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class EObjectModule {

    /**
     * 使用@Named 注解标识告知Dagger2调用哪种方法实对象实例的注入
     */
    @Named("WithoutName")
    @Provides
    EObject provideEObject() {
        return new EObject();
    }

    @Named("WithName")
    @Provides
    EObject provideEObjectWithName() {
        return new EObject("EObjectName");
    }
}
