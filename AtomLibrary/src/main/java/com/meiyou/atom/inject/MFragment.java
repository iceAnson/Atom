package com.meiyou.atom.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Linhh on 2017/10/11.
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface MFragment {
    int value() default 0;
}
