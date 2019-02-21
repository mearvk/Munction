package munction.modules.annotations;

public @interface Munction
{
    int id() default 0;

    boolean includestaticblock() default true;

    boolean includeconstructorblock() default true;
}
