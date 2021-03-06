package munction.modules.server;

import munction.localized.*;

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
    public MunctionServer reference = this;

    //

    public MunctionServer()
    {

    }

    public MunctionServer(String servername, Integer portnumber)
    {
        this.reference = new MunctionServer();

        this.reference.servername = servername;

        this.reference.portnumber = portnumber;
    }

    public MunctionServer(MunctionServer server)
    {
        this.reference = server;

        this.reference.servername = server.servername;

        this.reference.portnumber = server.portnumber;
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
        this.extender.register(namespace, name, link);
    }

    public void register(String namespace, String name, String link, MunctionComponent component)
    {
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
    public MunctionServerAtom reference = this;

    public String namespace;

    public String munctionname;

    public String projecturl;

    public static MunctionServer staticreference = new MunctionServer("xmnx://munctionserver",3434);

    public static MunctionServerExtender staticextender = new MunctionServerExtender(staticreference);

    public MunctionServerExtender extender = new MunctionServerExtender(staticreference);

    //

    public Registry registry = null;

    public RegistryControl control = new RegistryControl();

    //

    public Integer defaultportnumber = 3434;

    public String defaultservername = "xmnx://munctionserver";

    //

    public String servername;

    public Integer portnumber;

    //

    public MunctionServerMap<String, MunctionServer> servers = new MunctionServerMap();

    //

    public MunctionServerAtom()
    {

    }

    public MunctionServerAtom(String servername, Integer portnumber)
    {

    }

    public MunctionServerAtom(MunctionServer server)
    {
        this.initregistry();
    }

    //

    protected Registry initregistry()
    {
        try
        {
            Registry registry = this.registry = LocateRegistry.createRegistry(3434);

            this.control.registrystartup
                    .security(this, registry)
                    .updateregistry(this, this.servername, registry);
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
                    .updateregistry(this, this.servername, registry);
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


