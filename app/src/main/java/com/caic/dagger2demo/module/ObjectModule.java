package com.caic.dagger2demo.module;

import android.app.Application;
import android.content.Context;

import com.caic.dagger2demo.object.AObject;
import com.caic.dagger2demo.object.SingletonObject;
import com.caic.dagger2demo.scope.MyScope;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 用于提供被注入对象
 * Module组件需要装载到Component组件中
 */
@Module
public class ObjectModule {

    private Application mApplication;

    public ObjectModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    Context provideContext() {
        return mApplication.getApplicationContext();
    }

    /**
     * Dagger2 Module注入方式，可以通过被@Provides注解的方法获取到被注入对象的实例
     */
    @Provides
    public AObject provideAObject() {
        return new AObject();
    }

    /**
     * 使用作用域注解，将被注入对象实例的声明周期限定为其组件的生命周期，其组件(Component)上需要使用对应的作用域注解
     * @Singleton 作用域注解，表示注入一个局部单例对象实例，其生命周期与其组件的生命周期一致，ObjectComponent上也需要使用@Singleton才能生效
     */
    @Singleton
    @Provides
    public SingletonObject provideSingletonObject() {
        return new SingletonObject();
    }
}
