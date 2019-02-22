package theoretical;

import munction.modules.server.MunctionRegistryModifier;
import munction.modules.server.MunctionRegistryShutdown;
import munction.modules.server.MunctionRegistryStartup;
import munction.shutdown.MunctionServerShutdown;
import munction.startup.MunctionServerStartup;

public class RegistryControl
{
    public MunctionServerStartup startup = new MunctionServerStartup();

    public MunctionServerShutdown shutdown = new MunctionServerShutdown();

    //

    public MunctionRegistryStartup registrystartup = new MunctionRegistryStartup();

    public MunctionRegistryModifier registrymodifier = new MunctionRegistryModifier();

    public MunctionRegistryShutdown registryshutdown = new MunctionRegistryShutdown();

    //

    public RegistryControl()
    {
        if(this.startup==null)
        {
            this.startup = new MunctionServerStartup();
        }

        if(this.shutdown==null)
        {
            this.shutdown = new MunctionServerShutdown();
        }
    }
}
