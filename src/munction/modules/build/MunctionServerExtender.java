package munction.modules.build;

import munction.modules.server.MunctionServer;

import java.rmi.registry.Registry;

public class MunctionServerExtender
{
    public MunctionServer server;

    public MunctionStoreExtent lookup = new MunctionStoreExtent();

    public MunctionStore storage;

    //

    public MunctionServerExtender(MunctionServer server)
    {
        this.server = server;
    }

    public void persist(String namespace, String name, String link)
    {

    }

    public void connect(String namespace, String name, String link)
    {

    }

    public void register(String namespace, String name, String link)
    {

    }

    public void notify(String namespace, String name, String message)
    {
        //MunctionNotifications.
    }

    public void register(MunctionServer server, Registry registry, String servername, String namespace, String name, String link)
    {
        MunctionServer.servers.put(servername, server);
    }
}
