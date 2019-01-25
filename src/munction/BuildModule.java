package munction;

import system.Presystem;
import system.System;

public class BuildModule extends BuildListenerAtom
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
        java.lang.System.out.println("  >> Build module v."+MunctionAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Build module v."+MunctionAtom.version+" unregistered");
    }
}

class BuildListenerAtom
{
    public static final String version = "1.01";
}