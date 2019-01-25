package munction.modules;

public class EnhancementModule
{
    public void setRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+EnhancementModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Web module v."+EnhancementModuleAtom.version+" registered");
    }
}

class EnhancementModuleAtom
{
    public static final String version = "1.001";
}
