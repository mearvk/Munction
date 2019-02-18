package munction.modules.server;

import munction.modules.build.MunctionException;
import munction.modules.build.RegistryControl;
import munction.shutdown.MunctionServerShutdown;
import munction.startup.MunctionServerStartup;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

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

        this.initialize();
    }
}

class MunctionServerAtom
{
    public Registry registry = null;

    public RegistryControl control = new RegistryControl();

    //

    public MunctionServerAtom()
    {

    }

    //

    protected MunctionServerAtom shutdown(Registry registry)
    {
        this.control.registryshutdown
            .security(this, registry)
            .killregistry(this, registry);

        return this;
    }

    protected MunctionServerAtom initialize()
    {
        try
        {
            Registry registry = LocateRegistry.createRegistry(3434);

            this.control.registrystartup
                    .security(this, registry)
                    .initregistry(this, registry);


        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{STARTUP}","Registry Startup");
        }

        return this;
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

        return retval;
    }

    public Remote push(String resourcename, Remote remote)
    {
        try
        {
            this.registry.bind(resourcename, remote);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/munctionserveratom", "push", true);
        }

        return remote;
    }
}

class RMIClientImpl implements RMIClientSocketFactory
{

    @Override
    public Socket createSocket(String s, int i) throws IOException
    {
        return new Socket(s,i);
    }
}

class RMIServerImpl implements RMIServerSocketFactory
{

    @Override
    public ServerSocket createServerSocket(int i) throws IOException
    {
        return new ServerSocket(i);
    }
}


