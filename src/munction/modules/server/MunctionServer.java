package munction.modules.server;

import munction.shutdown.MunctionShutdown;
import munction.startup.MunctionStartup;

import javax.management.remote.rmi.RMIConnection;
import javax.management.remote.rmi.RMIServer;
import java.io.IOException;
import java.rmi.RemoteException;

public class MunctionServer implements RMIServer
{
    public MunctionStartup startup;

    public MunctionShutdown shutdown;

    public String servername;

    public MunctionServer(String servername)
    {
        this.servername = servername;
    }

    @Override
    public String getVersion() throws RemoteException
    {
        return null;
    }

    @Override
    public RMIConnection newClient(Object o) throws IOException
    {
        return null;
    }
}
