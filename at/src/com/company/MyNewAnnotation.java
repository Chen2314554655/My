package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Deprecated
public @interface MyNewAnnotation {
    public String name() default "steve";
    public int id() default 2;
}
