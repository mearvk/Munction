package munction.modules.server;

import javax.management.remote.rmi.RMIConnection;
import javax.management.remote.rmi.RMIServer;
import java.io.IOException;
import java.rmi.RemoteException;

public class MunctionServer implements RMIServer
{
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
