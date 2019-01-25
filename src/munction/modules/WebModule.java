package munction.modules;

import system.Presystem;
import system.System;

public class WebModule
{
    public Presystem presystem;

    public System system;

    public WebModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+ WebModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+ WebModuleAtom.version+" registered");
    }
}

class WebModuleAtom
{
    public static final String version = "1.001";
}