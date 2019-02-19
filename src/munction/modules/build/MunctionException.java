package munction.modules.build;

public class MunctionException
{
    public static void relist(Exception exception, String listname)
    {

    }

    public static void relist(Exception exception, String listname, String modifiers)
    {

    }

    public static void relist(Exception exception, String listname, String modifiers, Boolean usestack)
    {

    }

    public static void relist(Exception exception, String listname, String modifiers, Boolean usestack, Boolean exitonthrow)
    {
        java.lang.System.out.println(exception.getMessage());

        if(exitonthrow)
            java.lang.System.exit(0);
    }

    public static void relist(Exception exception, String listname, String modifiers, Thread thread)
    {

    }

    public static void relist(Exception exception, String listname, String modifiers, StackTraceElement[] stack)
    {

    }
}
