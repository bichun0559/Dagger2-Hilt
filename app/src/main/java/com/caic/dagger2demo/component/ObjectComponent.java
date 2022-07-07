package com.caic.dagger2demo.component;

import com.caic.dagger2demo.MainActivity;
import com.caic.dagger2demo.SecActivity;
import com.caic.dagger2demo.module.ObjectModule;
import com.caic.dagger2demo.scope.MyScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * IOC容器
 * Component用于注入对象，装载Module
 */
@Singleton
@Component(modules = {ObjectModule.class})
public interface ObjectComponent {

    void inject(MainActivity mainActivity);

    void inject(SecActivity secActivity);

}
