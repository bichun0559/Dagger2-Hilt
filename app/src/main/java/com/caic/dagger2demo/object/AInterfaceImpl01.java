package com.caic.dagger2demo.object;

public class AInterfaceImpl01 implements AInterface {

    @Override
    public String getString() {
        return AInterfaceImpl01.class.getSimpleName();
    }
}
