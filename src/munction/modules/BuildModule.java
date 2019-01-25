package munction.modules;

import system.Presystem;
import system.System;

public class BuildModule extends BuildModuleAtom
{
    public Presystem presystem;

    public System system;

    public BuildModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Build module v."+ BuildModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Build module v."+BuildModuleAtom.version+" unregistered");
    }
}

class BuildModuleAtom
{
    public static final String version = "1.01";
}