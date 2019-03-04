package munction.localized;

public class MunctionDriver extends MunctionDriverCustomExtent
{
    public static MunctionList<MunctionBench> benches = new MunctionList<MunctionBench>();

    public static MunctionList<MunctionWrench> wrenches = new MunctionList<MunctionWrench>();

    //

    public static void main(String...args)
    {
        MunctionDriver.bench("munction.localized.MunctionDriver","munction.localized.MunctionBench");
    }

    //

    static
    {
        try
        {
            MunctionDriver.wrench("munction.localized.System");

            MunctionDriver.wrench("munction.localized.SystemExtender");

            MunctionDriver.wrench("munction.localized.MunctionExtender");

            MunctionDriver.wrench("munction.localized.MunctionComponent");

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
            MunctionBench bench = new MunctionBench(classname, benchclassname);

            bench.bench(classname);

            MunctionDriver.benches.add(bench);
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
}


