package theoretical;

import theoretical.examples.chatprogram.MunctionBench;

public class MunctionDriver
{
    public static MunctionList<MunctionBench> benches = new MunctionList<MunctionBench>();

    public static MunctionList<MunctionWrench> wrenches = new MunctionList<MunctionWrench>();

    static
    {
        try
        {
            MunctionDriver.wrench("theoretical.System");

            MunctionDriver.wrench("theoretical.SystemExtender");

            MunctionDriver.wrench("theoretical.MunctionExtender");

            MunctionDriver.wrench("theoretical.MunctionComponent");

            MunctionDriver.wrench("munction.modules.server.MunctionServer");
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception,"","",true, true);
        }
    }

    public static void bench(String classname, String benchclassname)
    {
        try
        {
            MunctionDriver.benches.add(new MunctionBench(classname, benchclassname));
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }

    public static void wrench(String classname)
    {
        try
        {
            MunctionDriver.wrenches.add(Class.forName(classname));
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }

    public static void main(String...args)
    {
        try
        {
            Class.forName("theoretical.examples.chatprogram.ChatClient");
        }
        catch(Exception exception)
        {
            java.lang.System.out.println(exception);
        }
    }
}
