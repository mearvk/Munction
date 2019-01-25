package munction.modules;

public class PeristenceModule
{
    public void setRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+PersistenceModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+PersistenceModuleAtom.version+" registered");
    }
}

class PersistenceModuleAtom
{
    public static final String version = "1.001";
}
