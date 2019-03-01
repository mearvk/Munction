package theoretical.examples.chatprogram;

import munction.localized.ChatClientExtent;
import munction.localized.MunctionDriver;
import munction.modules.annotations.Munction;
import munction.localized.System;

@Munction
public class ChatClient extends ChatClientExtent
{
    private MunctionDriver driver; //static only

    static
    {
        System.staticref("xmnx://org.mearvk.examples", "xmnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref("xmnx://org.mearvk.examples", "xmnx://chatclient", this);
    }

    //

    public static void main(String...args)
    {
        try
        {
            Class.forName("theoretical.examples.chatprogram.ChatClient").newInstance();
        }
        catch(Exception exception)
        {
            java.lang.System.out.println(exception);
        }
    }
}

