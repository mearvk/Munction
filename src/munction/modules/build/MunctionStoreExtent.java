package munction.modules.build;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MunctionStoreExtent
{
    public static Registry staticregistry;

    public Registry registry;

    static
    {
        try
        {
            staticregistry = LocateRegistry.createRegistry(6868);

            staticregistry.bind("{MUNCTIONSERVER}", new MunctionString("resolver-needed"));

            staticregistry.bind("{MUNCTIONURL}", new MunctionString("resolver-needed"));

            staticregistry.bind("{MUNCTION}", new MunctionString("resolver-needed"));

            staticregistry.bind("{STARTUP}", new MunctionString("resolver-needed"));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"{STARTUP}","constructor",true, false);
        }
    }

    public MunctionStoreExtent()
    {
        try
        {
            registry = staticregistry;
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"{STARTUP}","constructor",true, false);
        }
    }

    public String lookup(String name, Boolean usedefault)
    {
        String retval = null;

        try
        {
            if(this.registry==null)
            {
                retval = ((MunctionString)this.staticregistry.lookup(name)).value;
            }
            else
            {
                retval = ((MunctionString)this.staticregistry.lookup(name)).value;
            }
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception,"{}","lookup",true, false);
        }

        return retval;
    }
}
