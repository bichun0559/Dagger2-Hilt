package com.bccc.dagger2demo.module;

import com.bccc.dagger2demo.object.AInterface;
import com.bccc.dagger2demo.object.AInterfaceImpl01;
import com.bccc.dagger2demo.object.AInterfaceImpl02;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class InterfaceModule {

    /**
     * @Binds 注解用于返回接口实例
     * 定义抽象接口方法，指定参数为AInterfaceImpl01实例
     */
    @Binds
    abstract AInterface bindAInterface(AInterfaceImpl01 impl);

    /**
     * 提供AInterfaceImpl01实例的创建方法
     * 注意需要定义为static
     */
    @Provides
    static AInterfaceImpl01 provideAInterfaceImpl01() {
        return new AInterfaceImpl01();
    }

    @Provides
    static AInterfaceImpl02 provideAInterfaceImpl02() {
        return new AInterfaceImpl02();
    }
}
