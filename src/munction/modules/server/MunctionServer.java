package munction.modules.server;

import munction.modules.build.MunctionException;
import munction.shutdown.MunctionServerShutdown;
import munction.startup.MunctionServerStartup;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.RemoteException;
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

        this.setregistry(null);
    }
}

class MunctionServerAtom
{
    public MunctionServerStartup startup = new MunctionServerStartup();

    public MunctionServerShutdown shutdown = new MunctionServerShutdown();

    //

    public MunctionRegistryStartup registrystartup = new MunctionRegistryStartup();

    public MunctionRegistryModifier registrymodifier = new MunctionRegistryModifier();

    public MunctionRegistryShutdown registryshutdown = new MunctionRegistryShutdown();

    //

    public Registry registry = null;

    //

    public MunctionServerAtom()
    {
        if(this.startup==null)
        {
            this.startup = new MunctionServerStartup();
        }

        if(this.shutdown==null)
        {
            this.shutdown = new MunctionServerShutdown();
        }

        System.out.println("Munction server starting...");
    }

    //

    public MunctionServerAtom killregistry(Registry registry)
    {
        this.registryshutdown
            .security(this, registry)
            .killregistry(this, registry);

        return this;
    }

    public MunctionServerAtom initregistry(Registry registry)
    {
        this.registrystartup
            .security(this, registry)
            .initregistry(this, registry);

        return this;
    }

    public MunctionServerAtom setregistry(Registry registry)
    {
        this.registrymodifier
            .security(this, registry)
            .setregistry(this, registry);

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


