package munction.modules;

public class ConnectorModule
{
    public void setRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+ConnectorModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+ConnectorModuleAtom.version+" registered");
    }
}

class ConnectorModuleAtom
{
    public static final String version = "1.001";
}
