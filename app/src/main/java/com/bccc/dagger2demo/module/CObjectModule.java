package com.bccc.dagger2demo.module;

import com.bccc.dagger2demo.object.CObject;
import com.bccc.dagger2demo.scope.MyScope;

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
