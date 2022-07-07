package com.caic.dagger2demo.scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

/**
 * 自定义作用域
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface MyScope {
}
