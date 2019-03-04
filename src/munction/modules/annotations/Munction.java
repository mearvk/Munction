package munction.modules.annotations;

public @interface Munction
{
    String parentclassname = "";

    String namespace() default "";

    String name() default "";

    String policy() default "";

    String servername() default "container://localhost";

    int id() default 0;

    int order() default 0;

    int depth() default 6;

    boolean staticstart() default true;

    boolean rewire() default true;

    boolean includestaticblock() default true;

    boolean includeconstructorblock() default true;
}
