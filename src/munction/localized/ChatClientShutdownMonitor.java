package munction.localized;

public class ChatClientShutdownMonitor extends Thread
{
    public MunctionThread thread;

    public ChatClientShutdownMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] shutdown monitor started.");
        }
    }
}
