package munction.modules.server;

import munction.localized.MunctionException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MunctionRegistryStartup
{
    private volatile MunctionServerAtom atom = null;

    public MunctionRegistryStartup own(MunctionServerAtom atom)
    {
        this.atom = atom;

        return this;
    }

    public MunctionRegistryStartup security(MunctionServerAtom atom, Registry registry)
    {
        return this;
    }

    public MunctionRegistryStartup updateregistry(MunctionServerAtom atom, String servername, Registry registry)
    {
        if(registry == null)
        {
            try
            {
                //security manager

                atom.registry = LocateRegistry.createRegistry(3434);
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
