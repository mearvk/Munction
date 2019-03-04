package theoretical.examples.chatprogram;

import munction.localized.MunctionBodi;
import munction.localized.MunctionException;
import munction.modules.annotations.Munction;

public class MunctionDriver
{
    @Munction
    private munction.localized.MunctionDriver driver;

    static
    {
        try
        {
            MunctionBodi.put("xbdx://aspects/chatprogram/container1", "", Class.forName("theoretical.examples.chatprogram.DevelopmentApplicationAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/container2","", Class.forName("theoretical.examples.chatprogram.DevelopmentNetworkAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/container3","", Class.forName("theoretical.examples.chatprogram.DevelopmentUserInterfaceAspect"));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","", true, true);
        }
    }
}
