package com.bccc.dagger2demo.module;

import com.bccc.dagger2demo.object.DObject;

import dagger.Module;
import dagger.Provides;

@Module
public class DObjectModule {

    @Provides
    DObject provideDObject() {
        return new DObject();
    }
}
