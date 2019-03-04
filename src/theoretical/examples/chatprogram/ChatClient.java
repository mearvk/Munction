package theoretical.examples.chatprogram;

import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction(start = true)
public class ChatClient extends ChatClientExtent
{
    static
    {
        System.staticref(ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref(this);
    }
}

