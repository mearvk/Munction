package munction.modules;

import system.Presystem;
import system.System;

public class EnhancementModule
{
    public Presystem presystem;

    public System system;

    public EnhancementModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Enhancement module v."+EnhancementModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Enhancement module v."+EnhancementModuleAtom.version+" registered");
    }
}

class EnhancementModuleAtom
{
    public static final String version = "1.001";
}
