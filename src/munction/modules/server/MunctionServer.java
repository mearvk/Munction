package munction.modules.server;

import munction.modules.build.MunctionException;
import munction.modules.build.MunctionServerMap;
import munction.modules.build.RegistryControl;

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
    public static MunctionServerMap<String, MunctionServer> servers = new MunctionServerMap();

    //

    public String servername;

    public Integer portnumber;

    //

    public MunctionServer(String servername, Integer portnumber) throws RemoteException
    {
        this.servername = servername;

        this.portnumber = portnumber;

        //

        MunctionServer.servers.put(servername, (MunctionServer) this.createregistry());
    }

    public void start()
    {
        this.createregistry();
    }

    public void stop()
    {
        this.removeregistry();
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

    protected MunctionServerAtom createregistry()
    {
        try
        {
            Registry registry = this.registry;

            this.control.registrystartup
                    .security(this, registry)
                    .initregistry(this, registry);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/initialize","destroy");
        }

        return this;
    }

    protected MunctionServerAtom removeregistry()
    {
        try
        {
            Registry registry = this.registry =  LocateRegistry.createRegistry(3434);

            this.control.registryshutdown
                    .security(this, registry)
                    .killregistry(this, registry);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/initialize","setup");
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
        Remote retval = remote;

        try
        {
            this.registry.bind(resourcename, remote);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/munctionserveratom", "push", true);
        }

        return retval;
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


