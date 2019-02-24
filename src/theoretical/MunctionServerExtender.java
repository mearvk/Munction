package theoretical;

import munction.modules.server.MunctionServer;

import java.rmi.registry.Registry;

public class MunctionServerExtender
{
    public MunctionServer server;

    public MunctionServers servers;

    public MunctionStore storage;

    //

    public MunctionServerExtender(MunctionServer server)
    {
        this.server = server;
    }

    public void persist(String namespace, String name, String link)
    {
        try
        {
            this.storage.lookup.registry.bind(namespace+""+name, new MunctionString(link));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","",true, false);
        }
    }

    public void connect(String namespace, String name, String link)
    {

    }

    public void register(String namespace, String name, String link)
    {
        try
        {
            this.storage.lookup.registry.bind(namespace+""+name, new MunctionString(link));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","",true, false);
        }
    }

    public void register(String key, String value)
    {
        try
        {
            this.storage.lookup.registry.bind(key, new MunctionString(value));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","",true, false);
        }
    }

    public void notify(String namespace, String name, String message)
    {
        java.lang.System.out.println("[server] "+this.storage.lookup.lookup(namespace,true)+" : "+this.storage.lookup.lookup(name,true)+" : "+message);
    }

    public void register(MunctionServer server, Registry registry, String servername, String namespace, String name, String link)
    {
        MunctionServers.servers.put(servername, server);
    }
}
