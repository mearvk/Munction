package munction.modules.server;

import munction.modules.build.MunctionException;
import munction.shutdown.MunctionServerShutdown;
import munction.startup.MunctionServerStartup;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MunctionServer extends MunctionServerAtom
{
    public String servername;

    public Integer portnumber;

    //

    public MunctionServer(String servername, Integer portnumber) throws RemoteException
    {
        this.servername = servername;

        this.portnumber = portnumber;

        //

        Registry registry = LocateRegistry.getRegistry(this.servername, this.portnumber);

        //

        this.setregistry(registry);
    }
}

class MunctionServerAtom
{
    public MunctionServerStartup startup = new MunctionServerStartup();

    public MunctionServerShutdown shutdown = new MunctionServerShutdown();

    //

    public Registry registry = null;

    //

    public void setregistry(Registry registry)
    {
        //security manager

        this.registry = registry;
    }

    public Remote pull(String resourcename)
    {
        Remote retval = null;

        try
        {
            retval = this.registry.lookup(resourcename);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/munctionserveratom","pull", true);
        }

        return null;
    }
}
