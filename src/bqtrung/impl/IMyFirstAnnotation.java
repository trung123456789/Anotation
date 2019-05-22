package bqtrung.impl;

public @interface IMyFirstAnnotation {
    public String name();
 
    public String description() default "";
}
