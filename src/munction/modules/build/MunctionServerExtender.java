package munction.modules.build;

import munction.modules.server.MunctionServer;

public class MunctionServerExtender
{
    public MunctionServer server;

    public MunctionStore store;

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
}
