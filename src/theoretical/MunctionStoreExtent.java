package theoretical;

import java.rmi.Remote;
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

            staticregistry.bind("{MUNCTIONSTOREEXTENT}", new MunctionString("resolver-needed"));

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

    public void bind(String name, Remote value, Boolean usedefault)
    {
        try
        {
            if(this.registry==null)
            {
                this.staticregistry.bind(name, value);
            }
            else
            {
                this.registry.bind(name,value);
            }
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception,"{MUNCTIONSTOREEXTENT}","bind",true, false);
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
                retval = ((MunctionString)this.registry.lookup(name)).value;
            }
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception,"{MUNCTIONSTOREEXTENT}","lookup",true, false);
        }

        return retval;
    }
}
