package munction.modules;

import system.Presystem;
import system.System;

public class PersistenceModule
{
    public Presystem presystem;

    public System system;

    public PersistenceModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Persistence module v."+PersistenceModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Persistence module v."+PersistenceModuleAtom.version+" registered");
    }
}

class PersistenceModuleAtom
{
    public static final String version = "1.001";
}
