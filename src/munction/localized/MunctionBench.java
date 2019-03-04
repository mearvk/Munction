package munction.localized;

import munction.modules.annotations.Munction;

public class MunctionBench
{
    public String classname;

    public String benchclassname;

    public static MunctionAnnotationExtender extender = new MunctionAnnotationExtender();

    public MunctionBench(String classname, String benchclassname)
    {
        try
        {
            MunctionBodi.staticref(this.classname = classname);

            MunctionBodi.staticref(this.benchclassname = benchclassname);
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }

    public void bench(String classname)
    {
        try
        {
            Class.forName(classname);
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true,true);
        }
    }

    public static void forName(String classname)
    {
        try
        {
            Class.forName(classname);
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true,true);
        }
    }
}
