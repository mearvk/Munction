package theoretical.examples.chatprogram;

import munction.localized.BodiEnabledAspectContainer;
import munction.localized.MunctionAspectContainer;
import munction.localized.MunctionComponent;
import munction.localized.MunctionContainer;
import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer("xmnx://chatclient","xmnx://chatclient","xmnx://chatclient","http://munction/projects/chatclient");

    //

    @Munction
    public MunctionAspectContainer container_001 = new BodiEnabledAspectContainer(DevelopmentApplicationAspect.class,"");

    @Munction
    public MunctionAspectContainer container_002 = new BodiEnabledAspectContainer(DevelopmentNetworkAspect.class,"");

    @Munction
    public MunctionAspectContainer container_003 = new BodiEnabledAspectContainer(DevelopmentUserInterfaceAspect.class,"");

    //

    static
    {
        System.staticref(ChatClientExtent.class);
    }

    @Munction
    public ChatClientExtent()
    {
        System.reference.ref(this);
    }
}
