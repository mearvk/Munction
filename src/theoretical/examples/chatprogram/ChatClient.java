package theoretical.examples.chatprogram;

import munction.localized.MunctionBench;
import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction
public class ChatClient extends ChatClientExtent
{
    @Munction
    public Driver driver;

    static
    {
        System.staticref(ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref(this);
    }

    //

    public static void main(String...args)
    {
        try
        {
            Class.forName("theoretical.examples.chatprogram.ChatClient");

            //MunctionBench.forName("theoretical.examples.chatprogram.ChatClient");
        }
        catch(Exception exception)
        {
            java.lang.System.out.println(exception);
        }
    }
}

