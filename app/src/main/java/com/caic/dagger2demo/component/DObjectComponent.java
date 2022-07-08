package com.caic.dagger2demo.component;

import com.caic.dagger2demo.SecActivity;
import com.caic.dagger2demo.module.DObjectModule;

import dagger.Subcomponent;

/**
 * 使用@Subcomponent注解指定子组件
 */
@Subcomponent(modules = DObjectModule.class)
public interface DObjectComponent {

    /**
     * 使用@Subcomponent.Factory定义DObjectComponent子组件的create方法
     */
    @Subcomponent.Factory
    interface Factory {
        DObjectComponent create();
    }

    void inject(SecActivity secActivity);

}
