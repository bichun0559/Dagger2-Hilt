package com.caic.dagger2demo.component;

import com.caic.dagger2demo.MainActivity;
import com.caic.dagger2demo.module.CObjectModule;
import com.caic.dagger2demo.scope.MyScope;

import dagger.Component;

/**
 * Component依赖，使用dependencies注解参数
 * CObjectComponent依赖ObjectComponent
 */
@MyScope
@Component(modules = CObjectModule.class, dependencies = ObjectComponent.class)
public interface CObjectComponent {

    void inject(MainActivity mainActivity);

}
