package theoretical.examples.chatprogram;

import munction.localized.MunctionThread;
import munction.localized.SystemExtender;

public class ChatClientRuntimeMonitor extends Thread
{
    public Thread thread;

    public ChatClientRuntimeMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] runtime monitor started.");
        }
    }
}
