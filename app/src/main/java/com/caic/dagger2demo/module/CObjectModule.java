package com.caic.dagger2demo.module;

import com.caic.dagger2demo.object.CObject;
import com.caic.dagger2demo.scope.MyScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CObjectModule {

    @MyScope
    @Provides
    public CObject provideCObject() {
        return new CObject();
    }
}
