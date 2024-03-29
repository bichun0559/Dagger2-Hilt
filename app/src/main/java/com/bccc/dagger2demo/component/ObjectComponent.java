package com.bccc.dagger2demo.component;

import android.content.Context;

import com.bccc.dagger2demo.module.DComponentModule;
import com.bccc.dagger2demo.module.EObjectModule;
import com.bccc.dagger2demo.module.InterfaceModule;
import com.bccc.dagger2demo.module.ObjectModule;
import com.bccc.dagger2demo.object.AObject;
import com.bccc.dagger2demo.object.SingletonObject;

import javax.inject.Singleton;

import dagger.Component;

/**
 * IOC容器
 * Component用于注入对象，装载Module
 */
@Singleton
@Component(modules = {ObjectModule.class, DComponentModule.class, InterfaceModule.class, EObjectModule.class})
public interface ObjectComponent {

    //void inject(MainActivity mainActivity);

    //void inject(SecActivity secActivity);

    /**
     * 要想实现组件依赖，父组件必须显示声明以对应Module中定义对象类型为返回类型的方法，这样子组件才能访问父组件声明的对象
     * ObjectComponent对应module{@link ObjectModule}中提供了AObject和SingletonObject和Context类型的对象
     * 这里需要显示声明出来供CObjectComponent访问，才能在MainActivity中注入
     * @return AObject
     */
    AObject aobject();

    SingletonObject singletonObject();

    Context context();

    /**
     * 父组件中需要声明SubComponent中的Factory方法
     * @return DObjectComponent.Factory
     */
    DObjectComponent.Factory dObjectComponent();

}
