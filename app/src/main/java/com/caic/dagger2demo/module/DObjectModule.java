package com.caic.dagger2demo.module;

import com.caic.dagger2demo.component.DObjectComponent;
import com.caic.dagger2demo.object.DObject;

import dagger.Module;
import dagger.Provides;

@Module
public class DObjectModule {

    @Provides
    DObject provideDObject() {
        return new DObject();
    }
}
