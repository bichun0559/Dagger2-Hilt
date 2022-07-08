package com.bccc.dagger2demo.object;

public class AInterfaceImpl02 implements AInterface {

    @Override
    public String getString() {
        return AInterfaceImpl02.class.getSimpleName();
    }
}
