package munction.modules.server;

import theoretical.MunctionException;
import theoretical.MunctionServerExtender;
import theoretical.MunctionServerMap;
import theoretical.RegistryControl;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

public class MunctionServer extends MunctionServerAtom
{
    public MunctionServer reference = new MunctionServer(staticreference);

    public MunctionServerExtender extender = new MunctionServerExtender(staticreference);

    //

    public static MunctionServer staticreference = new MunctionServer("{MUNCTIONSERVER}",3434);

    public static MunctionServerExtender staticextender = new MunctionServerExtender(staticreference);

    //

    public String servername;

    public Integer portnumber;

    //

    public MunctionServer(String servername, Integer portnumber)
    {
        this.servername = servername;

        this.portnumber = portnumber;

        //

        this.initregistry();

        //

        this.extender.register(this, this.registry, servername,"{MUNCTIONSERVER}/{RESOLVER}","{MUNCTIONSERVER}", "{MUNCTIONURL}");
    }

    public MunctionServer(MunctionServer server)
    {
        this.reference = server;
    }

    //

    public static void staticpersist(String namespace, String name, String link)
    {
        MunctionServer.staticextender.persist(namespace, name, link);
    }

    public static void staticconnect(String namespace, String name, String link)
    {
        MunctionServer.staticextender.connect(namespace, name, link);
    }

    public static void staticregister(String namespace, String name, String link)
    {
        MunctionServer.staticextender.register(namespace, name, link);
    }

    //

    public void persist(String namespace, String name, String link)
    {
        this.extender.persist(namespace, name, link);
    }

    public void connect(String namespace, String name, String link)
    {
        this.extender.connect(namespace, name, link);
    }

    public void register(String namespace, String name, String link)
    {
        this.extender.register(namespace, name, link);
    }

    public void register(String namespace, String name, String link, Class klass)
    {
        System.out.println("Registration for ["+klass+"] requested.");

        this.extender.register(namespace, name, link);
    }

    //

    public void start()
    {
        this.initregistry();
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

    public MunctionServerMap<String, MunctionServer> servers = new MunctionServerMap();

    //

    public MunctionServerAtom()
    {

    }

    //

    protected Registry initregistry()
    {
        try
        {
            Registry registry = this.registry = LocateRegistry.createRegistry(3434);

            this.control.registrystartup
                    .security(this, registry)
                    .updateregistry(this, registry);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/initialize","destroy");
        }

        return this.registry;
    }

    protected Registry removeregistry()
    {
        try
        {
            Registry registry = this.registry;

            this.control.registryshutdown
                    .security(this, registry)
                    .updateregistry(this, registry);
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "{MUNCTION}/initialize","setup");
        }

        return this.registry;
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


