package theoretical.examples.chatprogram;

import munction.localized.MunctionBodi;
import munction.localized.MunctionDriver;
import munction.localized.MunctionException;
import munction.modules.annotations.Munction;

public class Driver
{
    @Munction
    private MunctionDriver driver;

    static
    {
        try
        {
            MunctionBodi.put("xbdx://aspects/chatprogram/application", "", Class.forName("theoretical.examples.chatprogram.DevelopmentApplicationAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/network","", Class.forName("theoretical.examples.chatprogram.DevelopmentNetworkAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/userinterface","", Class.forName("theoretical.examples.chatprogram.DevelopmentUserInterfaceAspect"));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","", true, true);
        }
    }
}
