package munction.localized;

import java.rmi.Remote;

public class MunctionBodi
{
    public static void staticref(String classname)
    {
        try
        {
            Class.forName(classname);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "", "", true, true);
        }
    }

    public static void put(String bodiname, String bodinamespace, String classname)
    {
        java.lang.System.out.println("[bodi] "+bodiname+" : "+bodinamespace+" : "+classname);

        return;
    }

    public static void put(String bodiname, String bodinamespace, Class klass)
    {
        java.lang.System.out.println("[bodi] "+bodiname+" : "+bodinamespace+" : "+klass);

        return;
    }

    public static Remote pull(String bodiname, String bodinamespace, String classname)
    {
        return null;
    }
}
