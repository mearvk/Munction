package munction.modules.annotations;

public @interface Munction
{
    String namespace() default "";

    String name() default "";

    String servername() default "container://localhost";

    int id() default 0;

    int depth() default 6;

    boolean rewire() default true;

    boolean includestaticblock() default true;

    boolean includeconstructorblock() default true;
}
