package munction.modules.server;

import munction.modules.build.MunctionException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MunctionRegistryModifier
{
    private volatile MunctionServerAtom atom = null;

    public MunctionRegistryModifier own(MunctionServerAtom atom)
    {
        this.atom = atom;

        return this;
    }

    public MunctionRegistryModifier security(MunctionServerAtom atom, Registry registry)
    {
        return this;
    }

    public MunctionRegistryModifier setregistry(MunctionServerAtom atom, Registry registry)
    {
        if(registry == null)
        {
            try
            {
                //security manager

                atom.registry = LocateRegistry.createRegistry(3434, new RMIClientImpl(), new RMIServerImpl());
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
