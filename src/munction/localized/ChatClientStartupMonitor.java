package munction.localized;

public class ChatClientStartupMonitor extends Thread
{
    public Thread thread;

    public ChatClientStartupMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] startup monitor started.");
        }
    }
}
