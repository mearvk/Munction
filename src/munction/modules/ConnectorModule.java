package munction.modules;

import system.Presystem;
import system.System;

public class ConnectorModule
{
    public Presystem presystem;

    public System system;

    public ConnectorModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Connector module v."+ConnectorModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Connector module v."+ConnectorModuleAtom.version+" registered");
    }
}

class ConnectorModuleAtom
{
    public static final String version = "1.001";
}
