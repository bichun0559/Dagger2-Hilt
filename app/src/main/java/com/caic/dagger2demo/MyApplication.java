package com.caic.dagger2demo;

import android.app.Application;

import com.caic.dagger2demo.component.DaggerObjectComponent;
import com.caic.dagger2demo.component.ObjectComponent;

public class MyApplication extends Application {

    //在Application中实例化Component,其生命周期和程序一致,进而可以创建Dagger2全局单例
    static ObjectComponent mComponent = DaggerObjectComponent.create();

    public static ObjectComponent getObjectComponent() {
        return mComponent;
    }
}
