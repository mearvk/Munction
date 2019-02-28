package munction.modules.server;

import theoretical.MunctionException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MunctionRegistryShutdown
{
    private volatile MunctionServerAtom atom = null;

    public MunctionRegistryShutdown own(MunctionServerAtom atom)
    {
        this.atom = atom;

        return this;
    }

    public MunctionRegistryShutdown security(MunctionServerAtom atom, Registry registry)
    {
        return this;
    }

    public MunctionRegistryShutdown updateregistry(MunctionServerAtom atom, String servername, Registry registry)
    {
        if(registry == null)
        {
            try
            {
                //security manager

                registry.unbind(servername);
            }
            catch(Exception exception)
            {
                MunctionException.relist(exception,"{MUNCTION}","setregistry", true);
            }
        }
        else
        {
            //security manager

            atom.registry = registry;
        }

        return this;
    }
}
